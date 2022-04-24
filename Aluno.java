
public class Aluno {

	private int rgm; // CHAVE PRIMARIA
	private String nome;
	private Lista_Disciplinas listaDisciplina;
		
	public int getRgm() {
		return rgm;
	}
	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Lista_Disciplinas getlistaDisciplina() {
		return listaDisciplina;
	}
	public void setlistaDisciplina(Lista_Disciplinas listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}
	public void setDados (int matricula, String novoNome, Lista_Disciplinas listaDisciplina) {
		rgm = matricula;
		nome = novoNome;
		this.listaDisciplina = listaDisciplina;
	}

}



