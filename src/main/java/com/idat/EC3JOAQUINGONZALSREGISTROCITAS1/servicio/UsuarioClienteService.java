package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.UsuarioCliente;

public interface UsuarioClienteService {
	
	public List<UsuarioCliente> ListarUsuarioClientes();
	public UsuarioCliente ObtenerUsuarioClientes();
	public void guardarUsuarioClientes(UsuarioCliente usuariocliente);
	public void actualizarUsuarioClientes(UsuarioCliente usuariocliente);
	public void eliminarUsuarioClientes();

}
