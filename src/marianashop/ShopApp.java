package marianashop;

public class ShopApp {
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

       System.out.println(product2.getProductName());
        System.out.println(product2.getProductPrice());
        System.out.println(product2.getDescription());

        product1.productInfo();
        product.productInfo();
        product3.productInfo();
    }
}
