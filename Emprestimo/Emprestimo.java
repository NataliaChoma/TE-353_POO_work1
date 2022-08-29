package Emprestimo;
import java.time.LocalDate;

import Amigo.Amigo;
import Biblioteca.Livro;

public class Emprestimo {

	private int idAmigo;
	private int idLivro;
	private LocalDate dataEmprestimo; //ver dps
	private LocalDate dataDevolucao;	//ver dps
	
	// para a equipe PENSAR nesta repeti��o de informa��o, pois pode-se obter os objetos pelo IDs
	// caso mantenha a base do ArrayList organizada fisicamente, pode usar o Id como chave de acesso
	// caso contr�rio, ou como op��o extra para acesso, pode manter a refer�ncia ao objeto
	private Livro livro;
	private Amigo amigo;

    public Emprestimo() {

    }

    public Emprestimo(int idAmigo, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.idAmigo = idAmigo;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getidAmigo() {
        return idAmigo;
    }

    public void setidAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getidLivro() {
        return idLivro;
    }

    public void setidLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getdataEmprestimo() {
        return dataEmprestimo;
    }

    public void setdataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getdataDevolucao() {
        return dataDevolucao;
    }

    public void setdataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
