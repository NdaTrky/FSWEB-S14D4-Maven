package org.example.model;

public abstract class ProductForSale { //Abstract metodunu classta kullanmadan metodda kullanamayız.
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void showDetails();

    public void printHello(){
        System.out.println("Hello!");
    }
    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
