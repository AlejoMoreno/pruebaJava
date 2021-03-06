package com.example.emprendedores.service;

import com.example.emprendedores.entity.Emprendimientos;

import java.util.List;

public interface IEmprendimientosService {

    public List<Emprendimientos> findAll();

    public Emprendimientos findById(int id);

    public void save(Emprendimientos emprendimientos);

    public void deleteById(int id);
}
