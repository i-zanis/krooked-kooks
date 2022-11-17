package io.krookedkooks.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipes;
  private String description;

  public String getDescription() {
    return description;
  }

  public Category setDescription(String description) {
    this.description = description;
    return this;
  }

  public Set<Recipe> getRecipes() {
    return recipes;
  }

  public Category setRecipes(Set<Recipe> recipes) {
    this.recipes = recipes;
    return this;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
