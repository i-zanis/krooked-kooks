package io.krookedkooks.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
  public Integer preparationTime;
  public Integer cookingTime;
  // Deleting Recipe, deletes Notes
  @OneToOne(cascade = CascadeType.ALL)
  public Notes notes;
  public String source;
  public String url;
  public String directions;
  public Complexity difficulty;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private Integer portions;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredients;
  @Lob
  private Byte[] image;

  public Long getId() {
    return id;
  }

  public Recipe setId(Long id) {
    this.id = id;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Recipe setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getPreparationTime() {
    return preparationTime;
  }

  public Recipe setPreparationTime(Integer preparationTime) {
    this.preparationTime = preparationTime;
    return this;
  }

  public Integer getCookingTime() {
    return cookingTime;
  }

  public Recipe setCookingTime(Integer cookingTime) {
    this.cookingTime = cookingTime;
    return this;
  }

  public Integer getPortions() {
    return portions;
  }

  public Recipe setPortions(Integer portions) {
    this.portions = portions;
    return this;
  }

  public Notes getNotes() {
    return notes;
  }

  public Recipe setNotes(Notes notes) {
    this.notes = notes;
    return this;
  }

  public String getSource() {
    return source;
  }

  public Recipe setSource(String source) {
    this.source = source;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public Recipe setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getDirections() {
    return directions;
  }

  public Recipe setDirections(String directions) {
    this.directions = directions;
    return this;
  }

  public Complexity getDifficulty() {
    return difficulty;
  }

  public Recipe setDifficulty(Complexity difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  public Byte[] getImage() {
    return image;
  }

  public Recipe setImage(Byte[] image) {
    this.image = image;
    return this;
  }


}