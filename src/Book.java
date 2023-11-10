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

    @Override
    public String toString() {
        return nameBook + " " + author.toString() + " " + yearPublisher;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, yearPublisher, author);
    }

    @Override
    public boolean equals(Object book1) {
        if (this.getClass() != book1.getClass()) {
            return false;
        }
        Book book = (Book) book1;
        return nameBook.equals(book.nameBook) &&
                author.equals(book.author) &&
                yearPublisher == book.yearPublisher;
    }
}
