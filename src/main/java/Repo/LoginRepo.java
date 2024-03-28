package Repo;

import database.HibernateUtil;
import entities.NguoiDung;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LoginRepo {
    private Session session = HibernateUtil.getFACTORY().openSession();

    public List<NguoiDung> findAll() {
        String hql = "select entity From NguoiDung entity";
        Query q = session.createQuery(hql, NguoiDung.class);
        return q.getResultList();
    }
}
