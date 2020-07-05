package linkchecker.dbal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "links")
public class Link extends BaseEntity {

    @Column(name = "url")
    private String url;

    @Column(name = "status")
    private String status;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

}
