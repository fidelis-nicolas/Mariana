package marianashop;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {

    public static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Product product = new Product("Detergent", 20.88, "For soft clothes");
        Product product1 = new Product("Rice", 40.777, "Thai Rice");
        Product product2 = new Product();
        Product product3 = new Product("Milk", 2.9);

       product2.setProductName("Meat");
       product2.setProductPrice(3.99);
       product2.setDescription("Yummy");

       product.setProductName("Bathing Soap");
       product.setDescription("For soft skin");

       addNewProduct(product);
       addNewProduct(product1);
       addNewProduct(product2);
       addNewProduct(product3);

      menu();


    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while(run){

        System.out.println("Welcome to Marriana Shop");
        System.out.println("1 View All product");
        System.out.println("2 add product Product");
        System.out.println("3 Search product");
        System.out.println("4 Delete Product");
        System.out.println("5 update product information");
        System.out.println("6 Exit");

        System.out.print("Enter option: ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                viewAllProduct(products);
                break;
            case 2:
                System.out.println("Enter product Name");
                String prodName = scanner.next();
                System.out.println("Product price");
                double price = scanner.nextDouble();
                System.out.println("Description");
                String description = scanner.nextLine();

                Product product = new Product(prodName, price, description);
                addNewProduct(product);
                break;
            case 6:
                run = false;
                break;


            }
        }
    }
    //View All products
    public static void viewAllProduct(ArrayList<Product> products){
//        for(int i=0; i<products.size(); i++){
//            products.get(i).productInfo();
//        }

        for(Product myProduct: products){
            myProduct.productInfo();
        }
    }

    //Add new Products

    public static void addNewProduct(Product product){
        products.add(product);
    }

    // Delete Product

    // Update Product

    // Search product by name

    // Total price of product






}
