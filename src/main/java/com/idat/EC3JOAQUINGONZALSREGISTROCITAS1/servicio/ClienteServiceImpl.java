package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Cliente;
import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio.ClienteRepositorio;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepositorio repository;
	
	@Override
	public List<Cliente> ListarClientes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente ObtenerClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(null);

	}

	@Override
	public void actualizarClientes(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarClientes() {
		// TODO Auto-generated method stub

	}

}
