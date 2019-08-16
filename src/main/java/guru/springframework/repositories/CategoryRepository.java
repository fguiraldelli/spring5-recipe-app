package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fguira on 2019-08-16 at 00:04
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
