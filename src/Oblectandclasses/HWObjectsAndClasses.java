package Oblectandclasses;
public class HWObjectsAndClasses {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter" ,joanneRowling,1997);
        System.out.println("Название книги : " + harryPotter.getTitle()
                + " Автор : " + harryPotter.getAuthor().getFullName()
                + " Дата : " + harryPotter.getPublicationOfTheYear());
    }
}
