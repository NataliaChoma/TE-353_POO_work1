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


    public int getidAmigo() {
        return idAmigo;
    }

    public void setidAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

}
