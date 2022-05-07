package com.projects.praticandoAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webUsuario")
public class WebUsuarioController {

	
	@GetMapping
	public String getFormularioParaUsuarios() {
		return "webUsuario/home";
	}
}
