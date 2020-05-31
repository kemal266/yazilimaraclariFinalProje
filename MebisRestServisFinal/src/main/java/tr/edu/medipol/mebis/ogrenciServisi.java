package tr.edu.medipol.mebis;
import java.util.*;

import org.springframework.web.bind.annotation.*;

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
	@GetMapping("/ogrenciekle/{ogrenciAdi}")
	public List<String> ogrenciEkle(@PathVariable String ogrenciAdi){
		ogrenciler.add(ogrenciAdi);
		return ogrenciler;
	}
	@GetMapping("/ogrencisil/{ogrenciAdi}")
	public List<String> ogrenciSil(@PathVariable String ogrenciAdi){
		ogrenciler.remove(ogrenciAdi);
		return ogrenciler;
	}
}