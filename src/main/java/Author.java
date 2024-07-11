import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author")

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int id;

    @Column(name = "author_name",nullable = false)
    private String authorName;

    @Column(name = "author_birth_date")
    private String authorBirthDate;

    @Column(name = "author_country")
    private String authorCountry;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBirthDate() {
        return authorBirthDate;
    }

    public void setAuthorBirthDate(String authorBirthDate) {
        this.authorBirthDate = authorBirthDate;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }
}
