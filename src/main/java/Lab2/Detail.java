package Lab2;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Detail {
    private String ISBN;
    private String Title;
    private String AuthorID;
    private List<Book> booklist=new ArrayList<Book>();
    private List<Author> Authorlist=new ArrayList<Author>();

    public String execute() throws Exception{
        booklist=GetBooklist(AuthorID,ISBN,Title);
        Authorlist=GetAuthorlist(AuthorID);
        if(!booklist.isEmpty()&&!Authorlist.isEmpty()) return"success";
        else return "empty";
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

    public List<Book> GetBooklist(String AuthorID,String ISBN,String Title)  throws Exception{
        List<Book> SaveList=new ArrayList<Book>();
        String sql = "select * from books where AuthorID= '"+AuthorID+"'"+" AND ISBN='"+ISBN+"'"+" AND Title='"+Title+"'";
        new MySQLB();
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        if(rs.next())
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

    public List<Author> GetAuthorlist(String AuthorID) throws Exception{
        List<Author> SaveAuthorlist=new ArrayList<Author>();
        String sql = "select * from author where AuthorID= '"+AuthorID+"'";
        new MySQLB();
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        if(rs.next())
        {
            Author author=new Author();
            author.setAuthorID(rs.getString("AuthorID"));
            author.setName(rs.getString("Name"));
            author.setAge(rs.getString("Age"));
            author.setCountry(rs.getString("Country"));
            SaveAuthorlist.add(author);
        }
        return SaveAuthorlist;
    }

    public List<Author> getAuthorlist() {
        return Authorlist;
    }

    public void setAuthorlist(List<Author> authorlist) {
        Authorlist = authorlist;
    }
}

