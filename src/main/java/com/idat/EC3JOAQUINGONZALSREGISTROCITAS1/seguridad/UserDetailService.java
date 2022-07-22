package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.seguridad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.UsuarioCliente;
import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio.UsuarioClienteRepositorio;

@Service
public class UserDetailService implements UserDetailsService{

	@Autowired
	private UsuarioClienteRepositorio repositorio;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UsuarioCliente usuario = repositorio.findByUsuarioCliente(username);
		if(usuario != null) {
			
			List<GrantedAuthority> granted = new ArrayList<GrantedAuthority>();
			GrantedAuthority authority = new SimpleGrantedAuthority(usuario.getRol());
			granted.add(authority);
			
			return new User(usuario.getUsuario(), usuario.getPassword(), granted);
			
		}else {
			throw new UsernameNotFoundException("El usuario no existe");
		}
	}
	
	
	

}
