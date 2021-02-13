package softuni.demo.model.service;

import softuni.demo.model.entity.Category;

import java.math.BigDecimal;

public class ItemServiceModel extends BaseServiceModel{
    private String name;
    private String description;
    private BigDecimal price;
    private String gender;
    private CategoryServiceModel category;

    public ItemServiceModel() {
    }

    public String getName() {
        return name;
    }

    public ItemServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public ItemServiceModel setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public CategoryServiceModel getCategory() {
        return category;
    }

    public ItemServiceModel setCategory(CategoryServiceModel category) {
        this.category = category;
        return this;
    }
}
