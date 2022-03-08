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
				
		   
           
           System.out.println("Ürünün Adi:"+product1.Adi+"   "+"Ürün Id:"+product1.Id+"   "+
                              "Ürünün Fiyati:"+product1.Fiyati+"   "+"Ürünün Kategorisi:"+product1.Kategori);		
           
           System.out.println();
           
           System.out.println("Ürünün Kategorisi:"+kategori1.KategoriAdi+"   "+"Ürün Kategori Id:"+kategori1.KategoriId+"   "+
                              "Bagli Oldugu Ürün:"+kategori1.BagliOlduguUrun);
           
           
           System.out.println("**SIRADAKI ÜRÜN**");
           
           
           System.out.println("Ürünün Adi:"+product2.Adi+"   "+"Ürün Id:"+product2.Id+"   "+
                              "Ürünün Fiyati:"+product2.Fiyati+"   "+"Ürünün Kategorisi:"+product2.Kategori);		
           
           System.out.println();
           
           System.out.println("Ürünün Kategorisi:"+kategori2.KategoriAdi+"   "+"Ürün Kategori Id:"+kategori2.KategoriId+"   "+
                              "Bagli Oldugu Ürün:"+kategori2.BagliOlduguUrun);
                     
	}	

}
