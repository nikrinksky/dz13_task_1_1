package sky_hw_13;

public class Book {
    private String title;
    private Author authorName;
    private int year;

    public  Book(String title, Author authorName, int year){
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }
    public Author getAuthorName(){
        return this.authorName;
    }
    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }



}
