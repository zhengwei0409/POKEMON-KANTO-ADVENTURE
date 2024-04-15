import java.sql.*;

public class Database {

    Account account;

    // This constructor will fetch the details of a particular account
    public Database(int index) {

        // database information
        String jdbcUrl = "jdbc:mysql://localhost:3306/PokemonDB";
        String username = "root";
        String password = "database";

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

                System.out.println("Player Name: " + playerName);
                System.out.println("Last Location: " + lastLocation);
                System.out.println("Pokemons: " + pokemons);
                System.out.println("Badges: " + badges);

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

}
