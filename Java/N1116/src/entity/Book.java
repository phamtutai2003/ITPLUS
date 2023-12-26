package entity;


public class Book {
    private  int id;
    private String name;
    private  String publishing;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublishing() {
        return publishing;
    }

    public Book(int id, String name, String publishing) {
        this.id = id;
        this.name = name;
        this.publishing = publishing;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    
}
