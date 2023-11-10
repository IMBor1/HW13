public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }

    @Override
    public boolean equals(Object author2) {
        if (this.getClass() != author2.getClass()) {
            return false;
        }
        Author author = (Author) author2;
        return firstName.equals(author.firstName) &&
                secondName.equals(author.secondName);
    }
}