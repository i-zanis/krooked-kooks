package io.krookedkooks.domain;

import org.hibernate.annotations.CascadeType;

import javax.persistence.*;

@Entity
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  public Integer preparationTime;
  public Integer cookingTime;
  private Integer portions;
  // Deleting Recipe, deletes Notes
  @OneToOne(cascade = CascadeType.ALL)
  public Notes notes;
  public String source;
  public String url;
  public String directions;
  public Complexity difficulty;
  @Lob
  private Byte[] image;

}