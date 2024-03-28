package Repo;

import database.HibernateUtil;
import entities.Sach;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class SachRepo {
    private Session session = HibernateUtil.getFACTORY().openSession();

    public List<Sach> findAll() {
        String hql = "select entity From Sach entity";
        Query q = session.createQuery(hql, Sach.class);
        return q.getResultList();
    }

    public void create(Sach sach) {
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            this.session.persist(sach);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
    public void update(Sach sach) {
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            this.session.merge(sach);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
    public void remove(Sach sach) {
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            this.session.remove(sach);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
