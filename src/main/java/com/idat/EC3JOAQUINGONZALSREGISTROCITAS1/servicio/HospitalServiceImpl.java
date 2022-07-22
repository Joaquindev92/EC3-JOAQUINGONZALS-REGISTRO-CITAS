package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Hospital;
import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio.HospitalRepositorio;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepositorio repository;
	
	@Override
	public List<Hospital> ListarHospitales() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hospital ObtenerHospitales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarHospitales(Hospital hospital) {
		// TODO Auto-generated method stub
		repository.save(null);

	}

	@Override
	public void actualizarHospitales(Hospital hospital) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarHospitales() {
		// TODO Auto-generated method stub

	}

}
