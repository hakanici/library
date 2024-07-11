import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Book book=new Book();
        book.setBookName("Harry Potter");
        book.setBookStock(10);
        book.setBookPublicationYear("1998");
        entityManager.persist(book);

        Author author=new Author();
        author.setAuthorName("J.K. Rowling");
        author.setAuthorCountry("England");
        author.setAuthorBirthDate("1960");
        entityManager.persist(author);

        book.setAuthor(author);

        Category category=new Category();
        category.setCategoryName("Kid");
        category.setCategoryDescription("test");
        entityManager.persist(category);


        Publisher publisher=new Publisher();
        publisher.setPublisherAddress("test");
        publisher.setPublisherName("test");
        publisher.setPublisherEstablishmentYear("1998");
        entityManager.persist(publisher);

        book.setPublisher(publisher);

        BookBorrowing bookBorrowing=new BookBorrowing();
        bookBorrowing.setBorrowerName("test");
        bookBorrowing.setBorrowingDate("2024");
        bookBorrowing.setReturnDate("2024");
        entityManager.persist(bookBorrowing);


        transaction.commit();
    }
}
