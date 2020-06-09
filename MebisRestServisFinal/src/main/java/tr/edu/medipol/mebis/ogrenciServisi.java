package tr.edu.medipol.mebis;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenciler")

public class ogrenciServisi  {
	private static List<String> ogrenciler = new ArrayList<>();
	static {
		ogrenciler.add("Kemal");
		ogrenciler.add("Simge");
		ogrenciler.add("Gökhan");
	}
	
	@GetMapping("/tumbilgiler")
	public List<String> ogrenciBilgileri(){
		return ogrenciler;
	}
	@PostMapping("/ogrenciekle")
	public List<String> ogrenciEkle(@RequestBody Ogrenci ogrenci){
		ogrenciler.add(ogrenci.getOgrenciAdi() + " " + ogrenci.getOgrenciNo());
		return ogrenciler;
	}
	@PostMapping("/ogrencisil")
	public List<String> ogrenciSil(@RequestBody Ogrenci ogrenci){
		ogrenciler.remove(ogrenci.getOgrenciAdi() + " " + ogrenci.getOgrenciNo());
		return ogrenciler;
	}
	
	private static class Ogrenci {
		private String ogrenciAdi;
		private int ogrenciNo;

		public String getOgrenciAdi() {
			return ogrenciAdi;
		}

		public void setOgrenciAdi(String ogrenciAdi) {
			this.ogrenciAdi = ogrenciAdi;
		}

		public int getOgrenciNo() {
			return ogrenciNo;
		}

		public void setOgrenciNo(int ogrenciNo) {
			this.ogrenciNo = ogrenciNo;
		}
	}
}