package com.mapsa.SnapFood2.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mapsa.SnapFood2.common.BaseEntity;
import com.mapsa.SnapFood2.product.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categori")
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="category_id")
    private Long id;


    @Column(name = "title",unique = true)
    private String title;

@JsonIgnore
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
