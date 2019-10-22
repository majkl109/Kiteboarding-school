package kiteboarding.controller;

import kiteboarding.helper.HibernateUtil;
import java.util.List;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;

public class DAO<T> {
    
    private final Session session;
    
    public DAO() {
        session = HibernateUtil.getSession();
    }
    //Create or update
    public T save(T ClassEntity) {
        session.beginTransaction();
        session.saveOrUpdate(ClassEntity);
        session.getTransaction().commit();
        return ClassEntity;
       }
    
    //Read
    @Deprecated
    public List<T> createQuery(String hql) {
        Query q = session.createQuery(hql);
        Date d = new Date();
        return q.list();
    }
    
    //Delete
    public void delete(T ClassEntity) {
        session.beginTransaction();
        session.saveOrUpdate(ClassEntity);
        session.getTransaction().commit();
       }
    
    //Save whole list in one transaction
    public List<T> save(List<T> listed) {
        session.beginTransaction();
        listed.stream().forEach((entitet) -> {
            session.saveOrUpdate(entitet);
        });
        session.getTransaction().commit();
        return listed; 
    } 
    
}
