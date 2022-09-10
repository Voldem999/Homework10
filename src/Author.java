public class Author {
    private String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "автор - " + fullName;
    }

}
//("Sherlock Holmes", 1892, new Author("sir Arthur Conan Doyle"))
