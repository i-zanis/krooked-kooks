package io.krookedkooks.repositories;

import io.krookedkooks.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
  Optional<Category> findByDescription(String description);
}
