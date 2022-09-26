
public class Main {

	public static void main(String[] args) {
		
//------------>//Otuz bir / Otuz iki ve Otuz üçüncü ders; 
				//Field and Attribute / Encapsulation / Getters and Setters
				
		Product product1=new Product();// new diyerek aslında constructor çalıştırılır
		product1.setName("Laptop");
		product1.setId(1);
		product1.setDescription("Asus Laptop");
		product1.setPrice(5000);
		product1.setStockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product1);
		
		System.out.println(product1.getKod());
		
		//System.out.println(product1.name);
		
		//Otuz dördüncü ders; Constructor ile ürün tanımlaması
		Product product2=new Product(2, "Telefon", "Samsung Cep Telefonu", 7000, 50, "Beyaz");
		System.out.println(product2.getName()+" adlı ürünün kodu: "+product2.getKod());
		
		
		
		

	}

}
