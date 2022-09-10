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

}

