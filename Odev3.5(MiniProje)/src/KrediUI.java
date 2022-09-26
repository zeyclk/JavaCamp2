
public class KrediUI {
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		//Normalde button txtbox vs birbirine bağlarsın
		
		//ogretmen/tarımkredi parametresi almak yerine ikisinin de miras
		// alındığı classı parametre kabul etmen daha kullanışlı
		// main class ında miras verdiği sınıf nesnesi de parametre olarak gönderilebilir
		baseKrediManager.Hesapla();
	}
}
