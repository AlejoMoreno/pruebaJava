package dao.dao;

import entity.entity.Emprendedores;

import java.util.List;

public interface IEmprendedoresDao {

    List<Emprendedores> findAll();

    Emprendedores findById(int id);

    void save(Emprendedores emprendedores);

    void deleteById(int id);

}
