package Lab2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class update {

    private String ISBN1;
    private String AuthorID1;
    private List<Book> booklist=new ArrayList<Book>();
    private List<Author>Authorlist=new ArrayList<Author>();

    private String nISBN;
    private String nTitle;
    private String nPublisher;
    private String nPublishDate;
    private String nPrice;
    private String nName;
    private String nAge;
    private String nCountry;

    public String execute1() throws Exception {
        String sql1 = "select * from books where ISBN= '"+ISBN1+"'";
        new MySQLB();
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql1);
        if(rs.next())
        {
            Book book= new Book();
            Author au1=new Author();
            book.setISBN (rs.getString ("ISBN"));
            book.setTitle (rs.getString ("Title"));
            book.setAuthorID (rs.getString ("AuthorID"));
            book.setPublisher (rs.getString ("Publisher"));
            book.setPublishDate (rs.getString ("PublishDate"));
            book.setPrice (rs.getString ("Price"));
            booklist.add(book);
            AuthorID1=rs.getString ("AuthorID");
            String sql2= "select * from author where AuthorID= '"+AuthorID1+"'";
            ResultSet rs1=stmt.executeQuery(sql2);
            if(rs1.next()){
                au1.setAuthorID(rs1.getString ("AuthorID"));
                au1.setCountry(rs1.getString("Country"));
                au1.setName(rs1.getString("Name"));
                au1.setAge(rs1.getString("Age"));
                Authorlist.add(au1);
            }
        }

        con.close();
        stmt.close();
        rs.close();
        return "success";
    }
    public String execute2() throws Exception{
        new MySQLB();
        String sql= "select * from books where ISBN= '"+ISBN1+"'";
        String sql1="delete from books where ISBN=?";
        String sql2="insert into books (ISBN,Title,AuthorID,Publisher,PublishDate,Price) values (?,?,?,?,?,?)";
        String sql3="update author set Age=?,Country=? where AuthorID=?";
        String sql4="insert into author (AuthorID,Name,Age,Country) values (?,?,?,?)";
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        if(rs.next()){
            AuthorID1=rs.getString("AuthorID");
        }
        PreparedStatement pst1 = con.prepareStatement(sql1);
        pst1.setString(1,ISBN1);
        pst1.executeUpdate();
        System.out.println(ISBN1);
        System.out.println(AuthorID1);
        if(AuthorID1.equals(nName)) {
            pst1 = con.prepareStatement(sql2);
            pst1.setString(1,nISBN);
            pst1.setString(2,nTitle);
            pst1.setString(3,nName);
            pst1.setString(4,nPublisher);
            pst1.setString(5,nPublishDate);
            pst1.setString(6,nPrice);
            pst1.executeUpdate();
            pst1 = con.prepareStatement(sql3);
            pst1.setString(1,nAge);
            pst1.setString(2,nCountry);
            pst1.setString(3,nName);
            pst1.executeUpdate();
        }
        else{
            pst1 = con.prepareStatement(sql4);
            pst1.setString(1,nName);
            pst1.setString(2,nName);
            pst1.setString(3,nAge);
            pst1.setString(4,nCountry);
            pst1.executeUpdate();
            pst1 = con.prepareStatement(sql2);
            pst1.setString(1,nISBN);
            pst1.setString(2,nTitle);
            pst1.setString(3,nName);
            pst1.setString(4,nPublisher);
            pst1.setString(5,nPublishDate);
            pst1.setString(6,nPrice);
            pst1.executeUpdate();
        }

        con.close();
        stmt.close();
        rs.close();
        pst1.close();
        return "success";
    }

    public String getISBN1() {
        return ISBN1;
    }

    public void setISBN1(String ISBN1) {
        this.ISBN1 = ISBN1;
    }

    public List<Author> getAuthorlist() {
        return Authorlist;
    }

    public void setAuthorlist(List<Author> authorlist) {
        Authorlist = authorlist;
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }

    public String getAuthorID1() {
        return AuthorID1;
    }

    public void setAuthorID1(String AuthorID1) {
        this.AuthorID1 = AuthorID1;
    }

    public String getnISBN() {
        return nISBN;
    }

    public void setnISBN(String nISBN) {
        this.nISBN = nISBN;
    }

    public String getnPublisher() {
        return nPublisher;
    }

    public void setnPublisher(String nPublisher) {
        this.nPublisher = nPublisher;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnPublishDate() {
        return nPublishDate;
    }

    public void setnPublishDate(String nPublishDate) {
        this.nPublishDate = nPublishDate;
    }

    public String getnPrice() {
        return nPrice;
    }

    public void setnPrice(String nPrice) {
        this.nPrice = nPrice;
    }

    public String getnAge() {
        return nAge;
    }

    public void setnAge(String nAge) {
        this.nAge = nAge;
    }


    public String getnCountry() {
        return nCountry;
    }

    public void setnCountry(String nCountry) {
        this.nCountry = nCountry;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }
}
