package marianashop;

public class Product {
    //Encapsulation -> Data hiding
    private String productName;
    private double productPrice;
    private String description;

    /*
        Constructors
        -> Used to initialise the properties of our class
        -> It's like a method but it does'nt have a return type
        -> You can have more than one constructor in you class. This concept is called constructor overloading
     */
    /*
        Global and local variables
        -> Variables of a class are always in the global scope
        -> Variables of a method, constructor, conditional statement, loop, lambda
        -> Global variables are accessible anywhere within the class
        -> Local only exist in the body of code in which it was created
     */
    //Construct with arguements
    public Product(String productName, double productPrice, String description){
        this.productName = productName;
        this.description = description;

        if (productPrice<2.0){
            System.out.println("Product price is too low");
        }
        else {
            this.productPrice = productPrice;
        }
    }
    //Constructor without arguements
    public Product(){

    }
    public Product(String productName, double productPrice){
        this.productName = productName;

        if (productPrice<2.0){
            System.out.println("Product price is too low");
        }
        else {
            this.productPrice = productPrice;
        }
    }


    public void setProductName (String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }
    public double getProductPrice(){
        return this.productPrice;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }



    public void productInfo(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
