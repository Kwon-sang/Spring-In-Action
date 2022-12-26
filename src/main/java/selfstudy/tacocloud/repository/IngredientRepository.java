package selfstudy.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.data.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
