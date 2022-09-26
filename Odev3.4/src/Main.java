
public class Main {

	public static void main(String[] args) {

//------>Otuz beşinci ders; Method Overloading
		DortIslem islem=new DortIslem();
		System.out.println(islem.topla(3, 5));
		
		System.out.println(islem.topla(4, 6, 5));
		
//----->Otuz altıncı ders; Inheritance Yapısı
		Customer customer=new Customer();
		Employee employee=new Employee();
		customer.firstName="Zeynep";
		System.out.println(customer.firstName);
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		employeeManager.BestEmployee();
	}

}
