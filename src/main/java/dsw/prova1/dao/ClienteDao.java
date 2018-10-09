
package dsw.prova1.dao;

import dsw.prova1.entidades.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class ClienteDao {
    
    public static Cliente ler(int id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Prova1aPU");
        EntityManager em = emf.createEntityManager();
        
        return em.find(Cliente.class, id);
    }
    
}
