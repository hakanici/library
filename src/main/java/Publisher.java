import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")

public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private int id;

    @Column(name = "publisher_name",nullable = false)
    private String publisherName;

    @Column(name = "publisher_establishment_year")
    private String publisherEstablishmentYear;

    @Column(name = "publisher_address")
    private String publisherAddress;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherEstablishmentYear() {
        return publisherEstablishmentYear;
    }

    public void setPublisherEstablishmentYear(String publisherEstablishmentYear) {
        this.publisherEstablishmentYear = publisherEstablishmentYear;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }
}
