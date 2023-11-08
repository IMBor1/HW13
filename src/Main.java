public class Main {
    public static void main(String[] args) {
        Author author = new Author("Pushkin", "Sergei");
        Author author2 = new Author("Dale", "Carnegic");


        Book book = new Book("Кавказский пленник", author, 1821);
        Book book1 = new Book("Ораторское исскуство", author2, 1956);
        book.setYearPublisher(1822);
    }
}