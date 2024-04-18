import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Database {

    Account account;

    // database information
    String jdbcUrl = "jdbc:mysql://localhost:3306/PokemonDB";
    String username = "root";
    String password = "database";

    // This constructor will fetch the details of a particular account
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
                String pokemons = resultSet.getString("pokemons");
                String badges = resultSet.getString("badges");

                // temporary variable for handling null value
                String[] pokemonsArray = null;
                if(pokemons != null) {
                    pokemonsArray = pokemons.split(",");
                }

                ArrayList<String> badgesArrayList = new ArrayList<>();
                if(badges != null) {
                    badgesArrayList = new ArrayList<>(Arrays.asList(badges.split(",")));
                }

                account = new Account(playerName, lastLocation, pokemonsArray, badgesArrayList);

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

    // Method 1 : for updating and saving new value (account) to database
    

}
