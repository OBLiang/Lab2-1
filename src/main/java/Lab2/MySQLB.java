package Lab2;

import java.sql.*;

public class MySQLB {
    private static Connection con =null;

    public MySQLB() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://hjsvdqbeofel.mysql.sae.sina.com.cn:10495/book", "root", "301415");
        } catch (Exception e) {
            con = null;
        }

    }

    public static Connection getCon(){
        return con;
    }

    public static void CloseCon() throws SQLException {
        con.close();
    }
}
