public class Book {
    private String nameBook;
    private Author author;
    private int yearPublisher;

    public Book(String nameBook, Author author, int yearPublisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}
