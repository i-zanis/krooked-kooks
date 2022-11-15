package io.krookedkooks.repositories;

import io.krookedkooks.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
