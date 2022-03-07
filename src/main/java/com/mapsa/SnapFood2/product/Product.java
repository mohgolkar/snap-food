package com.mapsa.SnapFood2.product;

import com.mapsa.SnapFood2.category.Category;
import com.mapsa.SnapFood2.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Long price;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cat_id")
    private Category category;


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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
