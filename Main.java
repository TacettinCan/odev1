package odev1;


public class Main {

	public static void main(String[] args) {
		Products products1=new Products(1, "Ýphone12", 12000, "8 GB", "15 Mp");
		Products products2=new Products(2, "Samsung A51", 3800, "16 GB", "24 Mp");
		Products products3=new Products(1, "Xioami R9", 3500, "12 GB", "18 Mp");
		
		Products [] products= {products1,products2,products3};
		
		for (Products product : products) {
			
			System.out.println(product.name);
		}
		
		ProductsManagers productManager=new ProductsManagers();
		productManager.customize(products1);
		productManager.customize(products2);
		productManager.customize(products3);

	}

}
