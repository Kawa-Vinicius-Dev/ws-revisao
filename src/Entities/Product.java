package Entities;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;

    public Product(){
    }

    public Product(Long id, String name, String description, Double price, String imageUri) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUri = imageUri;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
