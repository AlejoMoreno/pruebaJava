package dao.dao;

import entity.entity.Emprendimientos;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmprendimientosDao implements IEmprendimientosDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Emprendimientos> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query query = currentSession.createQuery("from Emprendimientos", Emprendimientos.class);

        List<Emprendimientos> emprendimientos = query.getResultList();

        return emprendimientos;
    }

    @Override
    public Emprendimientos findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Emprendimientos emprendimientos = currentSession.get(Emprendimientos.class, id);

        return emprendimientos;
    }

    @Override
    public void save(Emprendimientos emprendimientos) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(emprendimientos);
    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Emprendimientos where id=:id");

        theQuery.setParameter("id", id);
        theQuery.executeUpdate();
    }
}
