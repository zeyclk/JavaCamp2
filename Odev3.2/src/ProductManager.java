
public class ProductManager {
	public void Add(Product product) {
		// İleride JDBC kodları kullanarak veritababına güncellenecek
		System.out.println("Ürün eklendi: " + product.getName());
	}
}
