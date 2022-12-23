package selfstudy.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
