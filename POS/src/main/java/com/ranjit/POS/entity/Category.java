package com.ranjit.POS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id", length = 45)
    private Integer catId;
    @Column(name = "cat_name", length = 45)
    private String catName;
    @Column(name = "active", columnDefinition = "TINYINT default 1")
    private boolean active;
}
