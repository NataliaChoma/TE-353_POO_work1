package Biblioteca;
import java.util.ArrayList;

public class Biblioteca {

	private String nome;
	private ArrayList<Livro> alLivros;
	private float investimento;

	// construtor cria alLivros, ArrayList que fica encapsulado na classe Biblioteca
	public Biblioteca(String nome) {
		this.nome = nome;
		this.alLivros = new ArrayList<Livro>();
		investimento = 0;
	}

	public addLivro(String nomeLivro){

	}


	// demais m�todos getters, setters, toString, compareTo (para ordena��o) etc 
	// conforme a modelagem e encapsulamento especificados 
	// mais o que estudante decidir implementar
}
