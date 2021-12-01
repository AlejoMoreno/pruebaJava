package service.service;

import dao.dao.EmprendimientosDao;
import dao.dao.IEmprendimientosDao;
import entity.entity.Emprendimientos;
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
        Emprendimientos emprendimientos = emprendimientosDao.findById(id);
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
