package sky_hw_13;

import java.util.Objects;

public class Book {
    private String title;
    private Author authorName;
    private int year;

    public Book(String title, Author authorName, int year) {
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги = " + title + "\n" +
                authorName +
                "Год публикации = " + year + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, year);
    }
}
