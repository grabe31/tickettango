
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Merchandise;
import dmacc.repository.MerchandiseRepository;

@Controller
public class MerchandiseController {

	@Autowired
	private MerchandiseRepository merchandiseRepository;
	
	 @GetMapping("/merchandiseViewAll")
	    public String merchandiseViewAll() {
	        return "merchandiseViewAll"; 
	    }

	@GetMapping("/addMerchandise")
	public String addMerchandiseForm(Model model) {
		model.addAttribute("merchandise", new Merchandise());
		return "addMerchandise";
	}

	@PostMapping("/addMerchandise")
	public String addMerchandise(Merchandise merchandise) {
		merchandise.setPrice(19.99);
		merchandise.setItemName("Graphic Tee");
	    merchandise.setImage("/images/istockphoto-1286279839-612x612.jpg");
	    merchandiseRepository.save(merchandise);
	    return "redirect:/merchandiseViewAll";
	}
	
}
 