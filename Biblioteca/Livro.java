package Biblioteca;

public class Livro {
	private int idLivro;
	private String titulo;
	private String autor;
	private float preco;
	private Disponibilidade dispLivro;

    public Livro(int idLivro, String titulo, String autor, float preco, String disponibilidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }   
    
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int id) {
        this.idLivro = idLivro;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getpreco() {
        return preco;
    }

    public void setpreco(float preco) {
        this.preco = preco;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }  
}
