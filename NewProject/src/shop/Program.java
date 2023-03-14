package shop;

public class Program {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        Product p = new Product("milk", "pizza");
        myShop.addProducts("001","pizza");
        myShop.addProducts("002","milk");
//        try {
//            myShop.removeProducts("003");
//        } catch (Exception e) {
//            System.out.println("Product not exists");
//
//        }
    }
}