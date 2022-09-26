
public class Product {
	
//------------>//Otuz dördüncü ders; Constructor 
	public Product(int id,String name,String description,double price,int stockAmount,String color) {
		//class ile aynı isimle olmalı
		System.out.println("Yapcı blok çalıştı");
		
		//bu tanımlamalar yapılmazsa atama yapılmayıp kod hatal çalışır
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.color=color;
	}

	public Product() {
		//Diğer kullanımda bu da doğrudur
		//her iki şekilde de tanımlama yapılabilir
		//Aynı isimli iki farklı metod tanmlamaya overloading denir
	}
	
	
	// attribute field
	// _ ile olanlar field (editör için _ kaldırıldı _id,_name...)
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String kod;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKod() {
		//Belilediğimiz kod formatı ismin ilk harfi ve id
		return this.name.substring(0,1)+this.id;
	}
	
	//Kod okunsun ancak değiştirelemesin diye set kısmı pasif
	/*
	public void setKod(String kod) {
		this.kod = kod;
	}*/
	


}
