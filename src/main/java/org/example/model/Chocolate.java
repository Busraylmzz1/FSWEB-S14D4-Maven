package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean hasSugar;
    public Chocolate(String type, double price,String description){
        super(type,price,description);
    }
    public Chocolate(String type, double price, String description, boolean hasSugar){

        super(type,price,description);

        this.hasSugar=hasSugar;
    }




    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);

    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "hasSugar=" + hasSugar +
                '}';
    }
}
