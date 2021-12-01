package com.example.emprendedores.service;

import com.example.emprendedores.dao.IEmprendimientosDao;
import com.example.emprendedores.entity.Emprendedores;
import com.example.emprendedores.entity.Emprendimientos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmprendimientosService implements IEmprendimientosService{

    @Autowired
    private IEmprendimientosDao emprendimientosDao;

    @Override
    public List<Emprendimientos> findAll() {
        List<Emprendimientos> listEmprendimientos= emprendimientosDao.findAll();
        return listEmprendimientos;
    }

    @Override
    public Emprendimientos findById(int id) {
        Emprendimientos emprendimientos = emprendimientosDao.getById(id);
        return emprendimientos;
    }

    @Override
    public void save(Emprendimientos emprendimientos) {
        emprendimientosDao.save(emprendimientos);
    }

    @Override
    public void deleteById(int id) {
        emprendimientosDao.deleteById(id);
    }
}
