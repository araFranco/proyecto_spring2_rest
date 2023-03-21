package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.model.Suscrito;

import py.edu.facitec.repository.SuscritoRepository;

@Controller
public class SuscritoController {
	//Inicializa el objeto 
	//Inyeccion de independencia
	//Carga el objeto dentro del gestor de Spring
	@Autowired
	private SuscritoRepository suscritoRepository;
	
	@RequestMapping("/form")
public String metodo1() {
		System.out.println("Cargando Formulario");
		
		//Carpeta Pagina
	return"suscrito/formulario";
	
}
	@RequestMapping("/registrar")
	public String registroDeDatos(Suscrito suscrito) {
		System.out.println(suscrito.toString());
	suscritoRepository.save(suscrito);
	System.err.println("Registrando correctamente...");
		return"suscrito/formulario";
	}
}
