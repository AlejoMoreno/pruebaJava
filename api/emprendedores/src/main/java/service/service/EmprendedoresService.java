package service.service;

import dao.dao.EmprendedoresDao;
import dao.dao.IEmprendedoresDao;
import entity.entity.Emprendedores;
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
        Emprendedores emprendedores = emprendedoresDao.findById(id);
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
