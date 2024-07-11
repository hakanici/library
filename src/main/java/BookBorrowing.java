import jakarta.persistence.*;

@Entity
@Table(name = "book_borrowing")

public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id")
    private int id;

    @Column(name = "borrower_name",nullable = false)
    private String borrowerName;

    @Column(name = "borrowing_date",nullable = false)
    private String borrowingDate;

    @Column(name = "return_date")
    private String returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowingDate='" + borrowingDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", book=" + book +
                '}';
    }
}
