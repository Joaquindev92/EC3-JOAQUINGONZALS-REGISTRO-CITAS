package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Cliente;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> ListarCliente(){
		return null;
	}
	
	@GetMapping("/listar/Cliente")
	public @ResponseBody Cliente ObtenerCliente(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		
	}
	
	@PostMapping("/actualizar")
	public void actualizarCliente(@RequestBody Cliente cliente) {
		
	}
	
	@PostMapping("/eliminar/{id}")
	public void eliminarCliente(@PathVariable Integer id) {
		
	}

}
