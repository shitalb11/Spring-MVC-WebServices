import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {
    public void addStudent(Student.Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
        session.close();
    }

    public void updateStudent(Student.Student student) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(student);
        tx.commit();
        session.close();
    }

    public void deleteStudent(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.remove(id);
        tx.commit();
        session.close();
    }

    public Student.Student getStudent(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Student.Student student = session.find(Student.Student.class, id);
        return student;
    }

    public List<Student.Student> getAllStudents() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List list = session.createQuery("from Student").list();
        session.close();
        return list;
    }
}