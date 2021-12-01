package dao.dao;

import entity.entity.Emprendedores;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmprendedoresDao implements IEmprendedoresDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Emprendedores> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query query = currentSession.createQuery("from Emprendedores", Emprendedores.class);

        List<Emprendedores> emprendedores = query.getResultList();

        return emprendedores;
    }

    @Override
    public Emprendedores findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Emprendedores emprendedores = currentSession.get(Emprendedores.class, id);

        return emprendedores;
    }

    @Override
    public void save(Emprendedores emprendedores) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(emprendedores);
    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Emprendedores where id=:id");

        theQuery.setParameter("id", id);
        theQuery.executeUpdate();
    }
}
