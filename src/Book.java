public class Book {
    private String name;
    private final Author author;
    private int year;
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Имя автора = '" + author + '\'';
    }


    public void setYear(int year) {
        this.year = year;
    }
}
