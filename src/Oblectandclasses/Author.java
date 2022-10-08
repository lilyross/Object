package Oblectandclasses;

public class Author {
    private final String name;
    private final String surname;

    public Author(String Joanne, String Rowling) {
        this.name = Joanne;
        this.surname = Rowling;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
