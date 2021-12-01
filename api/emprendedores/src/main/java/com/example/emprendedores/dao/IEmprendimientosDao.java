package com.example.emprendedores.dao;

import com.example.emprendedores.entity.Emprendimientos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmprendimientosDao extends JpaRepository<Emprendimientos, Integer> {

}
