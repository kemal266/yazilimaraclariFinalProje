package tr.edu.medipol.mebis;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class ogrencibilgi {
	@Test 
	public void ogrenciler() {
		//Given-- on koşullar

	List<String> ogrenciServisi = new ArrayList<>();
		 {
			 String ogrenciler1 ="Kemal";
			 String ogrenciler2 ="Simge";
			 String ogrenciler3 ="Gökhan";
		
			 
			//When-- Asil test edilen birim calıstırılır
		
			 ogrenciServisi.add(ogrenciler1);
			 ogrenciServisi.add(ogrenciler2);
			 ogrenciServisi.add(ogrenciler3);
	
			
		//Then--sonrasındaki kontroller
			assertEquals("Kemal",ogrenciler1);
			assertEquals("Simge",ogrenciler2);
			assertEquals("Gökhan",ogrenciler3);

			
		}

	}
	@Test

	//Given-- on koşullar

	public void   ogrenciekle() {
		List<String> ogrenciler = new ArrayList<>();{
			 String isim ="Kemal";
		 }
		//When-- Asil test edilen birim calıstırılır
		 
		 String yenisim="ibrahim";
		 
		 ogrenciler.add(yenisim);
		 
		 
		//Then--sonrasındaki kontroller
		 
		 assertEquals(yenisim,"ibrahim");
	   
	}
	@Test	
	public void Ogrencisil() {
	
		//Given-- on koşullar
			List<String> ogrenciler = new ArrayList<>();
			 {
				 
				 String isim3 ="Gökhan";
				 
				//When-- Asil test edilen birim calıstırılır
				 
				 ogrenciler.remove(isim3);
		    
				//Then--sonrasındaki kontroller
				 assertEquals(isim3,"Gökhan");
			 }
	}
	
	



	
}

