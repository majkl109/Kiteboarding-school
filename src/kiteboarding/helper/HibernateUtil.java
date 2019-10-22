package kiteboarding.helper;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author majkl
 */
public class HibernateUtil {
    
    private static Session session = null;
    
    protected HibernateUtil(){
    }
    
    public static Session getSession(){
        if (session == null) {
            try {
                session = new Configuration().configure().buildSessionFactory()
                        .openSession();
                
            }catch (Throwable ex) {
                        System.err.println("InitialSessionFactory creation unsucsessfull: " + ex);
                        throw new ExceptionInInitializerError(ex);
                        }
            
        }
        return session;
    }
}   
