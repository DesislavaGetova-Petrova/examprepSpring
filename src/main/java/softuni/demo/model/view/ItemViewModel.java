package softuni.demo.model.view;

import java.math.BigDecimal;

public class ItemViewModel {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imgUrl;

    public ItemViewModel() {
    }

    public String getId() {
        return id;
    }

    public ItemViewModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public ItemViewModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
}
