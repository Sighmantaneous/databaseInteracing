import java.sql.*;

public class QueryExample {

    public static void main(String[] args) throws SQLException {

        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sampleproducts", "simon", "password");

        String query = "SELECT * FROM product WHERE price = 25 " ;

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("ID\t"+"Name\t"+"Price");
            while ( rs.next() ) {
                int productId = rs.getInt("id");
                String nameProduct = rs.getString("name");
                String priced = rs.getString("price");

                System.out.println(productId+"\t"+nameProduct +"\t" +priced);
            }

        } catch (SQLException ex) {

            System.out.println("Record insert failed.");
            ex.printStackTrace();
        }
        // Close the connection
        conn.close();
    }

    }

