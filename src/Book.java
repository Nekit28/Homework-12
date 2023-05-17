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


    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book dogHeart2 = (Book) other;
        return name.equals(dogHeart2.name);

    }
    public int hashCode() {
        return java.util.Objects.hashCode(name);
    }

}
