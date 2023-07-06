package sky_hw_13;

public class Main {
    public static void main(String[] args) {
        Author authorTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("\"Война и мир\"", authorTolstoy, 1867 );

        System.out.println("Название книги = " + warAndPeace.getTitle());
        System.out.println("Имя автора = " + warAndPeace.getAuthorName().getName());
        System.out.println("Фамилия автора = " + warAndPeace.getAuthorName().getFamily());
        System.out.println("Год публикации = " + warAndPeace.getYear());

        System.out.println();

        Book authorJulVern = new Book("\"Таинственны остров\"", new Author("Жюль", "Верн"), 1874);
        System.out.println("Название книги = " + authorJulVern.getTitle());
        System.out.println("Имя автора = " + authorJulVern.getAuthorName().getName());
        System.out.println("Фамилия автора = " + authorJulVern.getAuthorName().getFamily());
        System.out.println("Год публикации = " + authorJulVern.getYear());

        authorJulVern.setYear(1875);
        System.out.printf("Год публикации книги %s длился по %s год ", authorJulVern.getTitle(), authorJulVern.getYear());
    }
}