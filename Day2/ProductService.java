package Day2;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	List<Product> products = new ArrayList<>();

	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		products.add(p);
	}
	public List<Product> getAllProducts(){
		return products;
	}
	
	public List<Product> getProductWithText(String s){
		return products.stream().filter(p->p.getName().contains(s)||p.getType().contains(s)||p.getPlace().contains(s)).toList();
	}
	public Product getProduct(String s) {
		return products.stream().filter(p->p.getName().equalsIgnoreCase(s)).toList().get(0);
	}
	public List<Product> getProductWithPlace(String s){
		return products.stream().filter(p->p.getPlace().equalsIgnoreCase(s)).toList();
	}
	public List<Product> OutOfWarranty(){
		return products.stream().filter(p->p.getWarranty()<2023).toList();
	}
	
}
