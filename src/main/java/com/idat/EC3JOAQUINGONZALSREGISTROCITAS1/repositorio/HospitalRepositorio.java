package com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC3JOAQUINGONZALSREGISTROCITAS1.modelo.Hospital;


@Repository
public interface HospitalRepositorio extends JpaRepository<Hospital, Integer> {

}
