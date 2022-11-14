package io.krookedkooks.domain;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
public class Ingredient {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private BigDecimal amount;
  private String description;
  @ManyToOne
  private Recipe recipe;

  public Ingredient(BigDecimal amount, String description, Recipe recipe) {
    this.amount = amount;
    this.description = description;
    this.recipe = recipe;
  }

  public Ingredient() {
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public Ingredient setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Ingredient setDescription(String description) {
    this.description = description;
    return this;
  }

  public Recipe getRecipe() {
    return recipe;
  }

  public Ingredient setRecipe(Recipe recipe) {
    this.recipe = recipe;
    return this;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
