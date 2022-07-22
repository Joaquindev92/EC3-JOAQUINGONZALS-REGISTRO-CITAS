package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.UsuarioCliente;
import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio.UsuarioClienteRepositorio;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepositorio repository;
	
	@Override
	public List<UsuarioCliente> ListarUsuarioClientes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public UsuarioCliente ObtenerUsuarioClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarUsuarioClientes(UsuarioCliente usuariocliente) {
		// TODO Auto-generated method stub
		repository.save(null);

	}

	@Override
	public void actualizarUsuarioClientes(UsuarioCliente usuariocliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarUsuarioClientes() {
		// TODO Auto-generated method stub

	}

}
