package Repos;
import javax.persistence.*;

public class HibernateFactoryUtil {
    static EntityManagerFactory entityManagerFactory;
    static EntityManager entityManager;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("ESAPractice1");
        entityManager = entityManagerFactory.createEntityManager();
    }
}
