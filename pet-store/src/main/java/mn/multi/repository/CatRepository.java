package mn.multi.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mn.multi.domain.Cat;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {
}
