package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.UsuarioCliente;

@Controller
@RequestMapping("/api/v1/UsuarioCliente")
public class UsuarioClienteController {
	
	
	@GetMapping("/listar")
	public @ResponseBody List<UsuarioCliente> ListarUsuarioCliente(){
		return null;
	}
	
	@GetMapping("/listar/UsuarioCliente")
	public @ResponseBody UsuarioCliente ObtenerUsuarioCliente(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarUsuarioCliente(@RequestBody UsuarioCliente hospital) {
		
	}
	
	@PostMapping("/actualizar")
	public void actualizarUsuarioCliente(@RequestBody UsuarioCliente hospital) {
		
	}
	
	@PostMapping("/eliminar/{id}")
	public void eliminarUsuarioCliente(@PathVariable Integer id) {
		
	}

}
