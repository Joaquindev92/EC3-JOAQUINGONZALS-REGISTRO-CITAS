package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.UsuarioCliente;

@Repository
public interface UsuarioClienteRepositorio extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuarioCliente(String usuario);
	
}
