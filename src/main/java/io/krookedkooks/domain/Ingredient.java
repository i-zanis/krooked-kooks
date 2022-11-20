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
  @OneToOne
  private MeasureUnit unit;

  public Ingredient(String description, BigDecimal amount, MeasureUnit unit) {
    this.description = description;
    this.amount = amount;
    this.unit = unit;
  }

  public Ingredient() {
  }

  public MeasureUnit getUnit() {
    return unit;
  }

  public Ingredient setUnit(MeasureUnit unit) {
    this.unit = unit;
    return this;
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
