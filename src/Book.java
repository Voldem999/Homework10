import java.util.Objects;

public class Book {
    private String name;
    private int publishYear;
    private Author author;

    public Book(String name, int publishYear, Author author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Книга - " + name +
                ", дата публикации - " + publishYear +
                ", " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishYear, author);
    }
}

