package softuni.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="items")
public class Item extends BaseEntity {
    private String name;
    private String description;
    private BigDecimal price;
    private String gender;
    private Category category;

    public Item() {
    }
    @Column(nullable = false,unique = true)
    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }
    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }
    @Column(nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public Item setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getGender() {
        return gender;
    }
    @Column(nullable = false)
    public Item setGender(String gender) {
        this.gender = gender;
        return this;
    }
    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public Item setCategory(Category category) {
        this.category = category;
        return this;
    }
}



