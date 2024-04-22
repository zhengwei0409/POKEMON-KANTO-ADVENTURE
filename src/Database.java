import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Pokemons.Pokemon;
import Serialization.PokemonSerialization;


public class Database {

    Account account;

    // database information
    String jdbcUrl = "jdbc:mysql://localhost:3306/PokemonDB";
    String username = "root";
    String password = "database";

    // Constructor 1 : use for fetch the details of a particular account
    public Database(int index) {

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            // Query the database
            String sqlQuery = "SELECT player_name, last_location, pokemons, badges FROM playerAccount WHERE save_id = ?";
            // Prepare the statement with the SQL query
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            // Set the save_id parameter in the prepared statement
            statement.setInt(1, index);
            // Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                String playerName = resultSet.getString("player_name");
                String lastLocation = resultSet.getString("last_location");
                String pokemonsJson = resultSet.getString("pokemons");
                
                // handle null value for pokemons column
                ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();
                if(pokemonsJson != null) {
                    List<Pokemon> pokemonList = PokemonSerialization.deserializePokemonList(pokemonsJson);
                    pokemonArrayList = new ArrayList<>(pokemonList);
                }

                String badges = resultSet.getString("badges");

                // temporary variable for handling null value
                ArrayList<String> badgesArrayList = new ArrayList<>();
                if(badges != null) {
                    badgesArrayList = new ArrayList<>(Arrays.asList(badges.split(",")));
                }

                account = new Account(playerName, lastLocation, pokemonArrayList, badgesArrayList);

            } else {
                System.out.println("User not found!");
            }

            // Close resources
            connection.close();

        } catch (SQLException e) {
            System.out.println("Database connection error");
            e.printStackTrace();
        }
    }

    // Constructor 2 : use for updating and saving new value (account) to database
    public Database(Account account, int saveId) {

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "UPDATE playerAccount SET player_name = ?, last_location = ?, pokemons = ?, badges = ? WHERE save_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(5, saveId);
                statement.setString(1, account.getName());
                statement.setString(2, account.getLastLocation().toString());
                // Serialize Pokemon list to JSON string
                String pokemonsJson = PokemonSerialization.serializePokemonList(account.getPokemonTeam());
                statement.setString(3, pokemonsJson);

                // convert ArrayList of badges into String
                String badges = "";
                for(String i : account.getBadges()) {
                    badges += i + ",";
                }

                statement.setString(4, badges);
                statement.executeUpdate();
            }

            // Close resources
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
