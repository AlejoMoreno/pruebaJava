package com.example.emprendedores.service;

import com.example.emprendedores.dao.IEmprendedoresDao;
import com.example.emprendedores.entity.Emprendedores;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmprendedoresService implements IEmprendedoresService{

    @Autowired
    private IEmprendedoresDao emprendedoresDao;

    @Override
    public List<Emprendedores> findAll() {
        List<Emprendedores> listEmprendedores= emprendedoresDao.findAll();
        return listEmprendedores;
    }

    @Override
    public Emprendedores findById(int id) {
        Emprendedores emprendedores = emprendedoresDao.getById(id);
        return emprendedores;
    }

    @Override
    public void save(Emprendedores emprendedores) {
        emprendedoresDao.save(emprendedores);
    }

    @Override
    public void deleteById(int id) {
        emprendedoresDao.deleteById(id);
    }
}
