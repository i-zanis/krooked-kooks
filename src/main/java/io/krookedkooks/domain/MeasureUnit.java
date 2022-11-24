package io.krookedkooks.domain;

import javax.persistence.*;

@Entity
public class MeasureUnit {
  @OneToOne
  Ingredient ingredient;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  public MeasureUnit(Ingredient ingredient, String description) {
    this.ingredient = ingredient;
    this.description = description;
  }
  public MeasureUnit(Ingredient ingredient) {
    this.ingredient = ingredient;
  }

  public MeasureUnit() {

  }

  public String getDescription() {
    return description;
  }

  public MeasureUnit setDescription(String description) {
    this.description = description;
    return this;
  }

  @Id
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
