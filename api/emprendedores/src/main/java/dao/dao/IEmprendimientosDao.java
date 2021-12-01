package dao.dao;

import entity.entity.Emprendimientos;

import java.util.List;

public interface IEmprendimientosDao {

    List<Emprendimientos> findAll();

    Emprendimientos findById(int id);

    void save(Emprendimientos emprendimientos);

    void deleteById(int id);

}
