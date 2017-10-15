package Lab2;

public class Author {
    private String AuthorID;
    private String Name;
    private String Age;
    private String Country;

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountry() {
        return Country;
    }

    public void setAuthorID(String authorID) {
        AuthorID = authorID;
    }

    public String getAuthorID() {
        return AuthorID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
