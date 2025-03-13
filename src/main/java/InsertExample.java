import java.sql.*;

public class InsertExample {

    public static void main(String[] args) throws SQLException {

        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sampleproducts", "simon", "password");

        try {

            // Insert a new record into the "users" table using a prepared statement.
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO product (name, price) VALUES (?, ?)");
            stmt.setString(1, "Shovel");
            stmt.setString(2, "25");
            stmt.executeUpdate();

            System.out.println("Insert completed successfully.");
        } catch (SQLException ex) {

            System.out.println("Record insert failed.");
            ex.printStackTrace();
        }
        // Close the connection
        conn.close();
    }




}