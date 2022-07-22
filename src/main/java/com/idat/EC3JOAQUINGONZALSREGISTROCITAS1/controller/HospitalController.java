package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Hospital;

@Controller
@RequestMapping("/api/v1/hospital")
public class HospitalController {
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospital> ListarHospital(){
		return null;
	}
	
	@GetMapping("/listar/Hospital")
	public @ResponseBody Hospital ObtenerHospital(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarHospital(@RequestBody Hospital hospital) {
		
	}
	
	@PostMapping("/actualizar")
	public void actualizarHospital(@RequestBody Hospital hospital) {
		
	}
	
	@PostMapping("/eliminar/{id}")
	public void eliminarHospital(@PathVariable Integer id) {
		
	}

}
