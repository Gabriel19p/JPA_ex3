package jpaProfessores_n_n;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity /* criacao da tabela */
public class Professor {

	@Id /* chave primaria */
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* auto incrementa por responsabilidade do bd */
	private int tid;
	private String tnome;
	private String assunto;

	@ManyToMany
	@JoinTable(name = "professor_classe", joinColumns = @JoinColumn(name = "professor_id"), inverseJoinColumns = @JoinColumn(name = "classe_id"))

	private List<Classe> classes;

	public Professor() {
		super();
	}

	public Professor(int tid, String tnome, String assunto, List<Classe> classes) {
		super();
		this.tid = tid;
		this.tnome = tnome;
		this.assunto = assunto;
		this.classes = classes;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTnome() {
		return tnome;
	}

	public void setTnome(String tnome) {
		this.tnome = tnome;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}

}