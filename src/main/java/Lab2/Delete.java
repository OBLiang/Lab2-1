package Lab2;

import java.sql.*;

public class Delete {
    private String ISBN;
    private String Title;
    private String AuthorID;

    public String execute() throws Exception {
        new MySQLB();
        String sql1 = "delete  from books where AuthorID=? AND ISBN=? AND Title=?";
        String sql2 = "select * from books where AuthorID= '"+AuthorID+"'";
        String sql3 = "delete  from author where AuthorID=?";

        Connection con =MySQLB.getCon();
        PreparedStatement pst = con.prepareStatement(sql1);
        pst.setString(1,AuthorID);
        pst.setString(2,ISBN);
        pst.setString(3,Title);
        pst.executeUpdate();
        Statement stmt =con.createStatement();
        ResultSet rs2=stmt.executeQuery(sql2);
        if(!rs2.next())
        {
            pst=con.prepareStatement(sql3);
            pst.setString(1,AuthorID);
            pst.executeUpdate();
        }
        return "success";
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(String authorID) {
        AuthorID = authorID;
    }
}
