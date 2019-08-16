package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fguira on 2019-08-16 at 00:03
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
