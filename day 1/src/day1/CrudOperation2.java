package day1;

import java.sql.*;

public class CrudOperation2 {

    static Connection con;

    static {
        try {
            con = CrudOperation1.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert() throws SQLException {

        PreparedStatement ps = con.prepareStatement
                ("insert into Employee(id, first_name, last_name, email) values(?,?,?,?)");

        ps.setInt(1, 4);
        ps.setString(2, "kishan");
        ps.setString(3, "savaliya");
        ps.setString(4, "kssavaliya@gmail.com");

        ps.executeUpdate();

        System.out.println("user inserted successfully");

    }

    public static void update() throws SQLException {

        PreparedStatement ps = con.prepareStatement
                ("update Employee set first_name=? where id=?");

        ps.setInt(2,3);
        ps.setString(1,"krishna");

        ps.executeUpdate();

        System.out.println("update successful");
    }

    public static void delete() throws SQLException {

        PreparedStatement ps = con.prepareStatement
                ("delete from Employee where id=?");

        ps.setInt(1,4);

        ps.executeUpdate();

        System.out.println("delete successful");
    }

    public static void fetch() throws SQLException {

        PreparedStatement ps = con.prepareStatement
                ("select * from Employee where id=?");

        ps.setInt(1,1);

        ResultSet rs=ps.executeQuery();

        System.out.println("Employee Detail from Brilworks Database");

        while (rs.next()) {
            System.out.println("\nEmployee Id = " + rs.getInt(1) + "\n" +
                    "First Name : " + rs.getString(2) + "\nLast Name : " + rs.getString(3) +
                    "\nEmail Id : " + rs.getString(4));
        }

    }
}
