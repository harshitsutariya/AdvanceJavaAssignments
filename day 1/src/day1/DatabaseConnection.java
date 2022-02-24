package day1;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded\n");

            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/Brilworks?useSSL=false", "root", "password");

            System.out.println("Connection Successful\n");

            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery("select * from Employee");

            System.out.println("Employee Detail from Brilworks Database");

            while (rs.next()) {
                System.out.println("\nEmployee Id = " + rs.getInt(1) + "\n" +
                        "First Name : " + rs.getString(2) + "\nLast Name : " + rs.getString(3) +
                        "\nEmail Id : " + rs.getString(4));
            }

            con.close();

    }
}
