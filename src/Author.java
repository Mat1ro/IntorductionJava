public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return name.equals(otherAuthor.name) && surname.equals(otherAuthor.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
