package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Hospital;

public interface HospitalService {
	
	public List<Hospital> ListarHospitales();
	public Hospital ObtenerHospitales();
	public void guardarHospitales(Hospital hospital);
	public void actualizarHospitales(Hospital hospital);
	public void eliminarHospitales();

}
