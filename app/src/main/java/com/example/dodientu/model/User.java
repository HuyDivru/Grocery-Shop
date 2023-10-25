package com.example.dodientu.model;

public class User {
    private String expired,image,price,quantity,category;

    public User() {
    }

    public User(String expired, String image, String price, String quantity, String category) {
        this.expired = expired;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
