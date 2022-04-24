import java.util.Arrays;

public class Lista {

	Aluno [] universitarios = new Aluno[60];
	int tamanho = 0;
	
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	
	public boolean estaCheia() {
		return (tamanho == universitarios.length);
	}
	
	
	public void mostraAlunos() {
		
		if ( estaVazia() )
			System.out.println("Nao ha alunos na lista.");
		else {
				
			System.out.println("Segue a lista de alunos:\n");
			
			for (int i = 0; i < tamanho; i++) {
				System.out.println("RGM:\t" + universitarios[i].getRgm());
				System.out.println("Nome:\t" + universitarios[i].getNome());
				universitarios[i].getlistaDisciplina().exibirLista();
			}
		}
	}

	
	public void inserirAluno(int rgm, String alunoNome, Lista_Disciplinas listaDisciplina) {
		
		if ( estaCheia()) {
			System.out.println("A lista está cheia!");
		
		}else{
			Aluno a = new Aluno();
			a.setDados(rgm, alunoNome, listaDisciplina);
			this.universitarios[tamanho] = a;
			tamanho++;
			System.out.println("Feito!\n\n");
		}
	}
	
	public void excluirAluno(int posicao) {
		
		for(int i = posicao ;i<tamanho; i++) {
			this.universitarios[i]=this.universitarios[i+1];

		}

		tamanho--;
		System.out.println("\nAluno excluído!");

	}
	
	public void excluirAlunoRGM(int RGM) {
		for(int i = 0; i < tamanho; i++) {
 			if(universitarios[i].getRgm() == RGM) {
 				excluirAluno(i);
 				
 				return;
 			}
 		}
		System.out.println("\nAluno excluido!");
	}
	
 	public void buscaRGM(int chave) {

 		for(int i = 0; i < tamanho; i++) {
 			if(universitarios[i].getRgm() == chave) {
 				System.out.println("Nome:\t" + universitarios[i].getNome() + "\n");
 				universitarios[i].getlistaDisciplina().exibirLista();
 				return;
 			}
 		}
 		System.out.println("\nAluno nao existe\n");
 	}
	
	
	private void moveParaDireita(int posicao) {
		for( int i=tamanho+1 ;i>posicao; i--){
			universitarios[i] = universitarios[i - 1]; //quando o programa executa essa linha, sobrescreve duas vezes os ultimos dados que foram inseridos, ao inves de abrir uma nova posição para poder aloca-los
		}
	}

	private void moveParaEsquerda(int posicao){
		for( int i = posicao ;i<tamanho; i++){
			universitarios[i] = universitarios[i + 1];
		}
	}
	
}
