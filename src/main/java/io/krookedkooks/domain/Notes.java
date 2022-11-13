package io.krookedkooks.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Notes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  // No cascade operation.
  // Deleting the Notes object should not cascade.
  // but deleting a recipe should delete the recipe notes.
  @OneToOne
  private Recipe recipe;

  // Java's String length (2^31 - 1) > Hibernate/JPA's (255)
  @Lob
  private String recipeNotes;

  public Notes(Long id, Recipe recipe, String recipeNotes) {
    this.id = id;
    this.recipe = recipe;
    this.recipeNotes = recipeNotes;
  }

  public Long getId() {
    return id;
  }

  public Notes setId(Long id) {
    this.id = id;
    return this;
  }

  public Recipe getRecipe() {
    return recipe;
  }

  public Notes setRecipe(Recipe recipe) {
    this.recipe = recipe;
    return this;
  }

  public String getRecipeNotes() {
    return recipeNotes;
  }

  public Notes setRecipeNotes(String recipeNotes) {
    this.recipeNotes = recipeNotes;
    return this;
  }
}
