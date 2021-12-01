package com.example.emprendedores.dao;

import com.example.emprendedores.entity.Emprendedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmprendedoresDao extends JpaRepository<Emprendedores, Integer> {

}
