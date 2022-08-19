package Principal;

import java.util.ArrayList;

import Amigo.*;
import Emprestimo.*;
import Biblioteca.*;

public class  Principal {
	
	private static Biblioteca bib = new Biblioteca("Biblioteca Pessoal");
	private static ListaEmprestimos emprestimos = new ListaEmprestimos();
	private static ListaAmigos amigos = new ListaAmigos();
	
	public static void main(String[] args) {

		// as diversas funcoes static na main servir�o para implementar as op��es do menu
		// efetuar o controle da aplica��o e a intera��o com o usu�rio
		// v�rias formas para criar o(s) menu(s) e articular as classes
		// e para manipular os respectivos objetos (usando as listas, os IDs e/ou refer�ncias diretas)
		// todas as entradas e sa�das de dados ficam nesta classe Principal
		// classes de modelagem sem sout ou scanner, apenas cuidando dos seus respectivos atributos

		
		// aqui apenas alguns exemplos de manipula��o hardcoded em rela��o a amigos para ilustrar
		// a opera��o das listas bib e emprestimos � semelhante
		int idAmigo;
		idAmigo = amigos.addAmigo("Fulano", "(41) 99876-5432");
		System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Ciclano", "(47) 98123-2121");
		System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Joaninha", "(51) 98123-0000");
		System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Joao", "(31) 98456-0000");
		System.out.println("Adicionado com codigo " + idAmigo);

		for (int i =0; i < amigos.getListaAmigosSize(); i++) {
			Amigo amigo = amigos.getAmigo(i);
			System.out.println("Nome: " + amigo.getNome());
			System.out.println("Celular: " + amigo.getCelular());
		}
		
		
		do {
			System.out.println("0 - sair");
			System.out.println("1 - cadastrar livro");
			System.out.println("2 - cadastrar amigo");
			System.out.println("3 - emprestar");
			System.out.println("4 - devolver");
			System.out.println("5 - listar emprestimos atuais");
			System.out.println("6 - listar hist�rico de empr�stimos de um livro");
			System.out.println("7 - listar toda a biblioteca");
			opcao = scanner.nextInt();

			switch (opcao) {
				case 0:
					System.out.println("   Obrigado por usar o sistema!");
					scanner.close();
					break;
				case 1:
					cadastrarLivro();
					break;
				case 2:
					cadastrarAmigo();
					break;
				case 3:
					emprestar();
					break;
				case 4:
					  devolver();
					break;
				case 5:
					
					//Collections.sort(lista, Collections.reverseOrder());
					break;
				case 6:

					break;
				case 7:
					// Etapa 1: ordenar por data de nascimento (no ANO, de 1 a 365)e caso seja a mesma, por ordem alfab?tica
					Collections.sort(lista, new Comparator<Contato>() {
						@Override
						public int compare(Contato c1, Contato c2) {
							// getDayOfYear() devolve um int de 1 a 365, ou seja, incorpora dia e m?s em um ?nico n?mero
							int diaC1 = c1.getDataNascimento().getDayOfYear();
							int diaC2 = c2.getDataNascimento().getDayOfYear();
							if (diaC1 != diaC2) {  // anivers?rio em dias diferentes, compara as datas
								return Integer.compare(diaC1, diaC2);
								// usando o m?todo compare da classe wraper Integer
								// (poderia fazer conta ou fazer ifs)
							}
							return c1.compareTo(c2);
							// se fazem anivers?rio no mesmo dia, compara alfabeticamente
						}
					});

					// Etapa 2: vamos imprimir um calend?rio anual de anivers?rios
					LocalDate hoje = LocalDate.now();
					System.out.println("\n--- Lista de Aniversariantes - " + hoje.getYear()+ " ---\n");

					// portugu?s do Brasil, para pegar os nomes dos meses direto da API do Java
					Locale ptBr = new Locale ("pt", "BR");

					int mes = 0; // come?ando com janeiro
					for (int i = 0; i < lista.size(); i++) {
						Contato c = lista.get(i);
						int mesP = c.getDataNascimento().getMonthValue(); // pega o m?s de nascimento
						if (mesP != mes){ // trocou para outro m?s ?
							System.out.println("    > " + c.getDataNascimento().getMonth().getDisplayName(TextStyle.FULL, ptBr));
							mes = mesP;
						}
						// usando o print formatado (printf) para facilitar a composi??o da string em tela
						System.out.printf("        %02d - %s (Nasceu em %d - %d anos)\n", c.getDataNascimento().getDayOfMonth(),
								c.getNome(), c.getDataNascimento().getYear(), c.getIdade());
					}
					break;
				default:
					System.out.println("   Opcao invalida!");
					break;
			}
		} while (opcao != 0);


			
	}
}
