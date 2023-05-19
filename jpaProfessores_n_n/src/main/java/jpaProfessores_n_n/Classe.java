package jpaProfessores_n_n;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity /* criacao da tabela */
public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cnome;

	@ManyToMany(mappedBy = "classes")
	private List<Professor> professores;

	public Classe() {
		super();
	}

	public Classe(String cnome, List<Professor> professores) {
		super();
		this.cid = cid;
		this.cnome = cnome;
		this.professores = professores;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCnome() {
		return cnome;
	}

	public void setCnome(String cnome) {
		this.cnome = cnome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

}