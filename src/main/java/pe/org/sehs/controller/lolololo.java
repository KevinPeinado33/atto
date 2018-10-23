package pe.org.sehs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class lolololo {
	@GetMapping("/")
	public String index() {
		return "prueba";
	}
}
