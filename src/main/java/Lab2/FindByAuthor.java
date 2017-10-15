package Lab2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FindByAuthor {
    private String Title;
    private String AuthorID;
    private List<Book> booklist=new ArrayList<Book>();

    public String execute() throws Exception {
        Boolean flag=false;
        String sql="select * from books";
        if(AuthorID.length()==0) return"empty";
        if(!AuthorID.equals("AllAuthor")){
            sql = "select * from books where AuthorID= '"+AuthorID+"'";}

        new MySQLB();
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        try{if(rs.next()){
            flag=true;
        }
            rs.close();
            con.close();
            stmt.close();

            if(flag){
                booklist=getSaveList(AuthorID);
                return "success";
            }
            else {
                return "none";
            }
        }
        catch (Exception e) {

            return "error";
        }
    }
    public String getAuthorID(){
        return AuthorID;
    }

    public void setAuthorID(String AuthorID){
        this.AuthorID=AuthorID;
    }

    public List<Book> getSaveList(String AuthorID) throws SQLException {
        List<Book> SaveList=new ArrayList<Book>();
        String sql;
        if(AuthorID.equals("AllAuthor"))
            sql="select * from books";
        else
            sql = "select * from books where AuthorID= '"+AuthorID+"'";
        try {
            new MySQLB();

        } catch (Exception e) {
        }
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next())
        {
            Book book=new Book();
            book.setISBN (rs.getString ("ISBN"));
            book.setTitle (rs.getString ("Title"));
            book.setAuthorID (rs.getString ("AuthorID"));
            book.setPublisher (rs.getString ("Publisher"));
            book.setPublishDate (rs.getString ("PublishDate"));
            book.setPrice (rs.getString ("Price"));
            SaveList.add (book);
        }
        return SaveList;
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }
}
