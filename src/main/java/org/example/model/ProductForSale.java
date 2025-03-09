package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;
    public ProductForSale(String type,double price, String description){
        this.type= type;
        this.price=price;
        this.description=description;
    }
    //bunu kesinlikle override etmesi gerekmez.
    public void printHello(){
        System.out.println("hello");

    }
    //kesinlikle override etmesini sağlar.
    public abstract void showDetails();
    public double getSalesPrice(int quantity){
       return quantity*price;
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
}
