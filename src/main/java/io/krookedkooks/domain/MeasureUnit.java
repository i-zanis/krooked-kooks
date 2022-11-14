package io.krookedkooks.domain;

import javax.persistence.*;

@Entity
public class MeasureUnit {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;

  @Id
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
