package dsw.prova1;

import dsw.prova1.dao.ClienteDao;
import dsw.prova1.entidades.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prova1Application {

	public static void main(String[] args) {
		SpringApplication.run(Prova1Application.class, args);
                
                //ler
                Cliente c = ClienteDao.ler(1);
                
                //named query
                EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Prova1aPU");
                EntityManager em = emf.createEntityManager();
                List<Cliente> clientes = em.createNamedQuery("listarClientes").getResultList();
	}
}
