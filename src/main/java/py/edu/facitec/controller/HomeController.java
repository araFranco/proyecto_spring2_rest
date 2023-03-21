package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String metod() {
	return"index";
}
	//prefijo / archivo/  aplication.properties
	//sufijo    .html
	 
	
		@RequestMapping("/cliente")
	public String metod2() {
		return"/cliente/formulario";
	}

}