package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Cliente;

public interface ClienteService {
	
	public List<Cliente> ListarClientes();
	public Cliente ObtenerClientes();
	public void guardarClientes(Cliente cliente);
	public void actualizarClientes(Cliente cliente);
	public void eliminarClientes();
	
	

}
