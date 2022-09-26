
public class Main {
	
	//Bellek içerisi Stack ve Heap olarak ikiye ayrılır
	//Stack içerisinde value type yani int Sring vb değişkenleri ve değerlerini tutar
	//Heap içerisinde ise class/array gibi referance type ile oluşturulan nesneler bulunur

	public static void main(String[] args) {
		sayiBulmaca();
		int sonuc=topla(5,9);
		System.out.println(sonuc);
		
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println("Girilen sayıların toplamı: "+toplam);
		
		CustomerManager customerManager1=new CustomerManager();//class: referance type(referans tipidir)
		customerManager1.Add();
		customerManager1.Remove();
		customerManager1.Update();
		
		
		int sayi3=10;
		int sayi4=20;
		sayi4=sayi3;//Bu atama ile sayi4'e atanan 20 değeri geçersiz olur
		sayi3=30; //Bu atama ise sadece sayi3 e ilk atanan değişmesini sağlar
		System.out.println(sayi4);//10 yazar
		
		int[] sayilar1=new int[]{1,2,3};
		int[] sayilar2=new int[]{4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);//ekrana 10 yazar çünkü diziler referans tip veri türü önemli değil
		
	}

//------------>//Yirmi dördüncü ders; Metodlar
		public static void sayiBulmaca() {
			int[] sayilar= new int[] {1,2,5,7,9,0};
			int aranacak=5;
			boolean varMi=false;
			
			for (int sayi:sayilar) {
				if(sayi==aranacak) {
					varMi=true;
					break;
				}
			}
			
			if(varMi)mesajVer("Sayı dizide mevcuttur: "+aranacak);
			else mesajVer("Sayı dizide mevcut değildir: "+aranacak);
		}
		
		public static void mesajVer(String mesaj) {
			System.out.println(mesaj);
		}

	
//------------>//Yirmi beşinci ders; Parametreli Metodları
		public static void ekle() {System.out.println("Eklendi.");}
		public static void sil() {System.out.println("Silindi.");}
		public static void guncelle() {System.out.println("Güncellendi.");}
		
		public static int topla(int sayi1,int sayi2) {
			//return metodu bitir demek
			return sayi1+sayi2;
			}
		
//------------>//Yirmi altıncı ders; Variable Arguments 
		public static int topla2(int... sayilar) {
			//int sonrası üç nokta birden fazla aynı tür değer gönderilecek demek arkaplanda dizi haline 
			int toplam=0;
			for(int sayi:sayilar)
			{
				toplam+=sayi;
			}
			
			return toplam;
		}

//------------>//Yirmi yedi ve sekizinci ders; Classes
				//CustomerManager classını oluşturup main içerisinde kullandık.
		
//------------>//Yirmi dokuzuncu ders; Değer ve Referans Tipleri
				//Main metodu içinde sayi3 ve sayi4 ataması yapıldı

		
}
