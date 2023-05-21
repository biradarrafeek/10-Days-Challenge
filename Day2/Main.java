package Day2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService service = new ProductService();
		
		service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
        
        System.out.println("Print all products");
        
        List<Product> productList = service.getAllProducts();
        for(Product p:productList) {
        	System.out.println(p);
        }
        System.out.println("*************************************************************");
        System.out.println("Poducts black Table");
        List<Product> productsOnBlackTable=service.getProductWithPlace("Black table");
        for(Product p:productsOnBlackTable){
            System.out.println(p);
        }
        System.out.println("*************************************************************");
        System.out.println("Poducts with Black");
        List<Product> productWithBlack=service.getProductWithText("Black");
        for(Product p:productWithBlack){
            System.out.println(p);
        }
        System.out.println("*************************************************************");
        System.out.println("Poducts out of warranty");
        List<Product> outOfWarantyProducts=service.OutOfWarranty();
        for(Product p:outOfWarantyProducts){
            System.out.println(p);
        }
        System.out.println("*************************************************************");
        System.out.println("printing a particular product");
        Product p=service.getProduct("Mac Studio");
        System.out.println(p);
	}
}
