package org.example.model;

public class Store {
    public static void main(String[] args) {

       //array oluşturulur.
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Test", 5.5,"Test","white",true);
        products[1]= new Bread("bakery",5.3,"test", "eincorn","brown");
        products[2]= new Coke("skdkş",2.3,"test",true,3.2);
listProducts(products);
    }
public static void listProducts(ProductForSale[] products){
        for(ProductForSale product: products){
            if(product!=null){
                product.showDetails();
            }
        }
}

}