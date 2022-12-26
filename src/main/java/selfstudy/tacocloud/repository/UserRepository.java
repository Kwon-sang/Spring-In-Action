package selfstudy.tacocloud.repository;


import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.data.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
