package modelos;

public class Mercadoria {
	
	
	private String Nome;
	private String Descricao;
	private String Categoria;
	private double Peso = 0;
	private String Codigo;
	
	private Endereco enderecoEntrega;
	
	public Mercadoria (String Nome, String Descricao, String Categoria, double Peso, String Codigo, Endereco endereco) {

		this.Nome = Nome;
		this.Descricao = Descricao;
		this.Categoria = Categoria;
		this.Peso = Peso;
		this.Codigo = Codigo;
		this.enderecoEntrega = endereco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	

}
