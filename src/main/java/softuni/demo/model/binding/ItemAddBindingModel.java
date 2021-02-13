package softuni.demo.model.binding;

import org.hibernate.validator.constraints.Length;
import softuni.demo.model.entity.Category;
import softuni.demo.model.entity.CategoryName;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ItemAddBindingModel {
    private String name;
    private String description;
    private CategoryName category;
    private String gender;
    private BigDecimal price;

    public ItemAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public ItemAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }
    @Length(min=3, message = "Description must be more then three characters!")
    public String getDescription() {
        return description;
    }

    public ItemAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
    @NotNull(message = "Enter valid category name")
    public CategoryName getCategory() {
        return category;
    }

    public ItemAddBindingModel setCategory(CategoryName category) {
        this.category = category;
        return this;
    }
    @NotNull
    public String getGender() {
        return gender;
    }

    public ItemAddBindingModel setGender(String gender) {
        this.gender = gender;
        return this;
    }
    @DecimalMin(value ="0",message = "Enter valid price")
    public BigDecimal getPrice() {
        return price;
    }

    public ItemAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
