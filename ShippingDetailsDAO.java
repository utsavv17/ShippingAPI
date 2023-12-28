/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 91789
 */
// ShippingDetailsDAO.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import model.ShippingDetails;

public class ShippingDetailsDAO {
      private static final String JDBC_URL = "jdbc:mysql://your-database-url:3306/your-database-name";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
   
    // Constructor, connection initialization
    
       public boolean addShippingDetails(ShippingDetails shippingDetails) {
    try {
        System.out.println("heyy");
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int sid = rand.nextInt(1000);
        System.out.println(sid);
Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

        // Assuming connection is properly initialized elsewhere
            System.out.println("a0");
            String query = "INSERT INTO shipping (ShippingID, address, city, pincode, po_id, customer_id) VALUES (?, ?, ?, ?, ?, ?)";
            System.out.println("a1");
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setInt(1, sid);
                System.out.println("a2");
                pst.setString(2, shippingDetails.getAddress());
                pst.setString(3, shippingDetails.getCity());
                pst.setString(4, shippingDetails.getPincode());
                pst.setInt(5, shippingDetails.getPoId());
                System.out.println("welcome");
                pst.setInt(6, shippingDetails.getCustomerId());
               if( pst.executeUpdate()==0)
                {
            
            System.out.println("Connection is not properly initialized or closed.");
            return false;
        }
            }
    } catch (SQLException e) {
        e.printStackTrace();
    }
return true;
       }

}
