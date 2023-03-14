package shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private HashMap<String, String> products;

    public Shop() {
        this.products = new HashMap<>();
    }

    public void addProducts(String shCode, String Products) {
        this.products.put(shCode, Products);
    }
//    public boolean removeProducts(String shCode) throws ProductNotExistsException{
//        boolean isExists=products.containsKey(shCode);
//        if(!isExists){
//            throw new ProductNotExistsException();
//        }
//        this.products.remove(shCode);
//        return isExists;
//    }
//    public boolean isProductsExists(String Product){
//
//        return this.products.containsValue(Product);
//    }

//    public List<Products> getProductByCategory(String category){
//        List<Products> result = new ArrayList<>();
//        for(Products p: this.products.values()){
//            if(p.category==category)
//                result.add(p);
//        }
//        return result;
//    }
}



