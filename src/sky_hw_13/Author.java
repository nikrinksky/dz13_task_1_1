package sky_hw_13;

import java.util.Objects;

public class Author {
    private String name;
    private String family;

    public Author(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public String getFamily() {
        return this.family;
    }

    @Override
    public String toString() {
        return "Имя автора = " +
                name + "\n" +
                "Фамилия автора = " + family + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(family, author.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family);
    }
}
