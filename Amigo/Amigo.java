package Amigo;
public class Amigo {
	
	private int idAmigo;
	private String nome;
	private String celular;

	public Amigo(int idAmigo, String nome, String celular) {
		super();
		this.idAmigo = idAmigo;
		this.nome = nome;
		this.celular = celular;
	}

	public Amigo(){
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
        return fone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

	@Override
	public String toString() {
		return "Amigo [idAmigo =" + idAmigo + ", nome =" + nome + "]";
	}

}
