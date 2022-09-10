public class Main {
    public static void main(String[] args) {
        Author author = new Author("sir Arthur Conan Doyle");
        Book sherlockHolmes = new Book("Sherlock Holmes", 1892, author);
        sherlockHolmes.setPublishYear(1895);
        System.out.println(sherlockHolmes);
        System.out.println();
        Author nikolayGogol = new Author("Nikolay Gogol");
        Book tarasBulba = new Book("Taras Bulba", 1835, nikolayGogol);
        tarasBulba.setPublishYear(1837);
        System.out.println(tarasBulba);

    }
}