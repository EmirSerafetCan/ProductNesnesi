public class ProductTest {

	public static void main(String[] args) {
		
				   
		   Product product1 = new Product();
		   product1.Id=1;
		   product1.Adi="Portakal";
		   product1.Fiyati="35 TL";
           product1.Kategori="Turuncgiller";
           
           
           ProductCategory kategori1 = new ProductCategory();
           kategori1.KategoriId=1;
           kategori1.KategoriAdi="Turuncgiller";
           kategori1.BagliOlduguUrun="Meyve";
           
           
                   
		   Product product2 = new Product();
		   product2.Id=2;
		   product2.Adi="Cikolata";
		   product2.Fiyati="5 TL";
           product2.Kategori="Atistirmalik";
           
           
           ProductCategory kategori2 = new ProductCategory();
           kategori2.KategoriId=2;
           kategori2.KategoriAdi="Atistirmalik";
           kategori2.BagliOlduguUrun="Biskuvi";
				
		   
           
           System.out.println("�r�n�n Adi:"+product1.Adi+"   "+"�r�n Id:"+product1.Id+"   "+
                              "�r�n�n Fiyati:"+product1.Fiyati+"   "+"�r�n�n Kategorisi:"+product1.Kategori);		
           
           System.out.println();
           
           System.out.println("�r�n�n Kategorisi:"+kategori1.KategoriAdi+"   "+"�r�n Kategori Id:"+kategori1.KategoriId+"   "+
                              "Bagli Oldugu �r�n:"+kategori1.BagliOlduguUrun);
           
           
           System.out.println("**SIRADAKI �R�N**");
           
           
           System.out.println("�r�n�n Adi:"+product2.Adi+"   "+"�r�n Id:"+product2.Id+"   "+
                              "�r�n�n Fiyati:"+product2.Fiyati+"   "+"�r�n�n Kategorisi:"+product2.Kategori);		
           
           System.out.println();
           
           System.out.println("�r�n�n Kategorisi:"+kategori2.KategoriAdi+"   "+"�r�n Kategori Id:"+kategori2.KategoriId+"   "+
                              "Bagli Oldugu �r�n:"+kategori2.BagliOlduguUrun);
                     
	}	

}
