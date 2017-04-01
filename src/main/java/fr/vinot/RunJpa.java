package fr.vinot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.dao.ClientDao;

public class RunJpa {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		ClientDao dao = spring.getBean(ClientDao.class);
		Client c = new Client("marseille", "bvfrance", "vinot", "bernard", "landreville");
		c = dao.save(c);
		System.out.println("id=" + c.getId());
		
		c = dao.findOne(c.getId());
		System.out.println(c);
		
		System.out.println("deuxième = " + dao.getClientFromNom("vinot", "bernard"));
		
		
		spring.close();
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinot");
		
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Client c = new Client("marseille", "bvfrance", "vinot", "bernard", "landreville");
		em.persist(c);
		System.out.println("id="+c.getId());
		em.getTransaction().commit();
		
		em = emf.createEntityManager();
		TypedQuery<Client> query = em.createQuery("select c from Client c where nom = :nom", Client.class);
		query.setParameter("nom", "vinot");
		System.out.println(query.getSingleResult());
		
		emf.close();*/

	}

}
