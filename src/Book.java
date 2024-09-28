public class Book {
    private final String title;
    private final Author author;
    private int releaseYear;

    public Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author.toString() + ", Year: " + this.releaseYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return title.equals(otherBook.title) && author.equals(otherBook.author) && releaseYear == otherBook.releaseYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, releaseYear);
    }
}
