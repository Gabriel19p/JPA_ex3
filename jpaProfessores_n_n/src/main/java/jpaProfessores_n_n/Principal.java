package jpaProfessores_n_n;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaProfessores_n_n.Classe;
import jpaProfessores_n_n.Professor;

public class Principal {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaProfessores_n_n");
		EntityManager entitymanager = emf.createEntityManager();
		entitymanager.getTransaction().begin();

		
		Classe classe = new Classe("Sistemas Operacionais", null);
		Classe classe2 = new Classe("Estrutura de Dados", null);
		Classe classe3 = new Classe("Banco de Dados", null);

		
		entitymanager.persist(classe); 
		entitymanager.persist(classe2); 
		entitymanager.persist(classe3); 

	
		List<Classe> classes = new ArrayList();
		classes.add(classe);
		// departmentSet1.add(department2);

		
		List<Classe> classes2 = new ArrayList();
		classes2.add(classe2);

		
		List<Classe> classes3 = new ArrayList();
		classes3.add(classe3);

		
		Professor professor1 = new Professor();
		professor1.setTnome("Gabriel");
		professor1.setAssunto("Assunto1");
		professor1.setClasses(classes);

		// Criando a entidade professor
		Professor professor2 = new Professor();
		professor2.setTnome("Leandro");
		professor2.setAssunto("Assunto2");
		professor2.setClasses(classes2);

		// Criando a entidade professor
		Professor professor3 = new Professor();
		professor3.setTnome("Andre");
		professor3.setAssunto("Assunto3");
		professor3.setClasses(classes3);

		// Armazenar professor
		entitymanager.persist(professor1);
		entitymanager.persist(professor2);
		entitymanager.persist(professor3);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emf.close();
	}

}