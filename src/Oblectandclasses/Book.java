package Oblectandclasses;

public class Book {
    private final String title;
    private final Author author;
    private int publicationOfTheYear;

    public Book(String title, Author author, int publicationOfTheYear) {
        this.title = title;
        this.author = author;
        this.publicationOfTheYear = publicationOfTheYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationOfTheYear() {
        return this.publicationOfTheYear;
    }

    public void setPublicationOfTheYear(int publicationOfTheYear) {
        this.publicationOfTheYear = publicationOfTheYear;
    }
}
