package com.example.emprendedores.service;

import com.example.emprendedores.entity.Emprendedores;

import java.util.List;

public interface IEmprendedoresService {

    public List<Emprendedores> findAll();

    public Emprendedores findById(int id);

    public void save(Emprendedores user);

    public void deleteById(int id);

}
