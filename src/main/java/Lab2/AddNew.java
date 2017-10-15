package Lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddNew {
    private String Name;
    private String Age;
    private String Country;
    private String ISBN;
    private String Title;
    private String Publisher;
    private String PublishDate;
    private String Price;


    public String exectue1() throws Exception {
        PreparedStatement pst1;
        String sql1 = "select * from author where AuthorID= '"+Name+"'";
        String sql2="insert into books (ISBN,Title,AuthorID,Publisher,PublishDate,Price) values (?,?,?,?,?,?)";
        String sql4="insert into author (AuthorID,Name,Age,Country) values (?,?,?,?)";
        String sql5 = "select * from books where ISBN= '"+ISBN+"'";
        new MySQLB();
        Connection con =MySQLB.getCon();
        Statement stmt =con.createStatement();
        Statement stmt1 =con.createStatement();
        ResultSet rs=stmt.executeQuery(sql1);
        ResultSet rs1=stmt1.executeQuery(sql5);
            if (rs.next()) {
                if(!rs1.next()) {
                    pst1 = con.prepareStatement(sql2);
                    pst1.setString(1, ISBN);
                    pst1.setString(2, Title);
                    pst1.setString(3, Name);
                    pst1.setString(4, Publisher);
                    pst1.setString(5, PublishDate);
                    pst1.setString(6, Price);
                    pst1.executeUpdate();
                    return "case1";
                }
                else return"ex";
            } else {
                if(!rs1.next()) {
                    pst1 = con.prepareStatement(sql4);
                    pst1.setString(1, Name);
                    pst1.setString(2, Name);
                    pst1.setString(3, "null");
                    pst1.setString(4, "null");
                    pst1.executeUpdate();
                    pst1 = con.prepareStatement(sql2);
                    pst1.setString(1, ISBN);
                    pst1.setString(2, Title);
                    pst1.setString(3, Name);
                    pst1.setString(4, Publisher);
                    pst1.setString(5, PublishDate);
                    pst1.setString(6, Price);
                    pst1.executeUpdate();
                    return "case2";
                }
                else return"ex";
            }

    }
    public String exectue2() throws Exception {
        PreparedStatement pst1;
        String sql="update author set Age=?,Country=? WHERE Name=?";
        new MySQLB();
        Connection con =MySQLB.getCon();
        pst1 = con.prepareStatement(sql);
        pst1.setString(1,Age);
        pst1.setString(2,Country);
        pst1.setString(3,Name);
        System.out.println(Age);
        System.out.println(Country);
        System.out.println(Name);
        pst1.executeUpdate();
        return "case1";

    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAge() {
        return Age;
    }

    public String getCountry() {
        return Country;
    }

    public String getPrice() {
        return Price;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}

