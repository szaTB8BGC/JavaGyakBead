package com.example.gyakorlatbead;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tartalom")
public class Tartalom {
@Id
private int id;
 @Column(name = "sutiid")
private int sutiid;
@Column(name = "mentes")
private String mentes;
}
