package linkchecker.dbal.repositories;

import linkchecker.dbal.models.Link;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link, Long> {
}
