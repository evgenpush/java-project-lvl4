package hexlet.code.domain;
import io.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public final class Url extends Model {
    @Id
    private long id;
    private String name;
    private Date createdAt;

    public Url(String n, Date cdAt) {
        this.name = n;
        this.createdAt = cdAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
