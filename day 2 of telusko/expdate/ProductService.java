import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String warranty){
        for(Product p : products){
            if(p.getName().equals(warranty))
                return p;
        }

        return null;
    }
    

    public List<Product> getProductWithText(int warranty2) {
        int str = warranty2;
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            int warranty = p.getWarranty();
            if( warranty>=warranty2)
                prods.add(p);
        }
        return prods;

    }
}
