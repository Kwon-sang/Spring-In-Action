package selfstudy.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

//    Iterable<Ingredient> findAll();
//    Ingredient findById(String id);
//    Ingredient save(Ingredient ingredient);
}
