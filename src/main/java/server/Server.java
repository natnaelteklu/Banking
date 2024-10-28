package server;

import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import service.AccountManagementImpl;
import service.UserManagementImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Server {
    public static void main(String[] args) {
        Connection connection = null; // Declare the connection variable
        try {
            // Step 1: Initialize the ORB and POA
            ORB orb = ORB.init(args, null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            // Step 2: Establish a database connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/banking"; // Update with your DB URL
            String username = "root"; // Update with your DB username
            String password = ""; // Update with your DB password
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 3: Pass the connection to UserManagementImpl and AccountManagementImpl
            UserManagementImpl userManagementImpl = new UserManagementImpl(connection);
            rootPOA.activate_object(userManagementImpl);

            AccountManagementImpl accountManagementImpl = new AccountManagementImpl(connection);
            rootPOA.activate_object(accountManagementImpl);

            // Step 4: Start the server
            System.out.println("Server is running...");
            orb.run();
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the connection if it's open
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
