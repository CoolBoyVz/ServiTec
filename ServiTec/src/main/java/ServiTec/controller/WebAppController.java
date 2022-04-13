package ServiTec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String irInicio() {
		return("index");
	}

	@RequestMapping("/clientes")
	public String irClientes() {
		return("clientes");
	}

//	@RequestMapping("/empleados")
//	public String irEmpl() {
//		return("empleados");
//	}
}
