package org.example.model.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String descripton;

    public ProductForSale(String type, double price,String descripton){
        this.type= type;
        this.price=price;
        this.descripton=descripton;
    }

public final void printHello(){
    System.out.println("hello");
}
public abstract void  showDetails();
    public double getSalesPrice(int quantity ){
        return quantity * price;
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public String getDescripton(){
        return descripton;
    }

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", descripton='" + descripton + '\'' +
                '}';
    }
}
