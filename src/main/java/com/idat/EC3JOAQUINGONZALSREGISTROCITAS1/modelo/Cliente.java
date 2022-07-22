package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Table (name = "Clientes")
@Entity
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 4631194868089344564L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String celular;
	
	@OneToOne(mappedBy = "cliente")
	private UsuarioCliente usuariocliente;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "cliente_hospital", joinColumns = @JoinColumn(name = 
	"id_hospital", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = 
	"foreign key(id_hospital) references clientes(id_hospital)")), inverseJoinColumns = @JoinColumn(name =
	"id_cliente", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = 
	"foreign key(id_cliente) references cliente(id_cliente)"))
	)
	
	private List<Hospital> cliente = new ArrayList<Hospital>();
	
	public Cliente() {
		super();
	}
	public Cliente(Integer idCliente, String nombre, String celular) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.celular = celular;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	

}
