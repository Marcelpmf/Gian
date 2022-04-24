import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int online = 1;
		Scanner teclado = new Scanner(System.in);
		
		Lista listaAlunos = new Lista();
		

		while(online==1){

			System.out.println("\nO que você quer fazer?\n"
					+ "1 - Listar Alunos\n"
					+ "2 - Inserir um Aluno na lista\n"
					+ "3 - Excluir um Aluno da lista\n"
					+ "4 - Buscar um Aluno na lista\n"
					+ "0 - Sair");

			int escolha = teclado.nextInt();

			switch (escolha) {

				case 0: {
	
					online = 0;
					break;
				}

				case 1: {

					listaAlunos.mostraAlunos();
					break;
				}


				case 2: {

					System.out.println("Digite o RGM do aluno a ser inserido:");

					int insercao = teclado.nextInt();
					int rgmASerInserido = insercao;

					if (rgmASerInserido == -1) {
						System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");
					}

					System.out.println("Agora insira o Nome do Aluno:");
					teclado.nextLine();
					String nomeNewAluno = teclado.nextLine();
					boolean maisDisciplina = true;
					
					Lista_Disciplinas lista_De_Disciplinas = new Lista_Disciplinas();
					
					
					while(maisDisciplina) {
						System.out.println("Adicione uma disciplina: ");
						Disciplina novaDisciplina = new Disciplina();
						
						novaDisciplina.setNome(teclado.nextLine());
						lista_De_Disciplinas.inserirNoFim(novaDisciplina);
						
						System.out.println("Mais disciplina?");
							if(teclado.nextLine().compareTo("sim") == 0) {
								maisDisciplina = true;
							}
							else { 
								maisDisciplina = false;
							
							}
					}
					listaAlunos.inserirAluno(rgmASerInserido, nomeNewAluno, lista_De_Disciplinas);
					break;

				}


				case 3: {

					System.out.println("Digite o RGM do Aluno a ser excluido!");
					int resposta = teclado.nextInt();
					int excluir = resposta;
					listaAlunos.excluirAlunoRGM(excluir);
					break;

				}
 

				case 4: {

					System.out.println("Digite o RGM do aluno do qual deseja ver os dados");
					int buscaResposta = teclado.nextInt();
					int buscaMatricula = buscaResposta;
					if (buscaMatricula == -1)
						System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");
					else
						listaAlunos.buscaRGM(buscaMatricula);
					break;
				}

				default: {

					System.out.println("Opcao invalida! reinicie a aplicacao e insira uma opcao correta.");

				}
			}
		}
		System.out.println("Encerrando Aplicacao...");
		teclado.close();
	}
}

