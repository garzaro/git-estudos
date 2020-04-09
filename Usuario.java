public class Usuario{
    private Long id;
    private String nome;
    private Integer telefone;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {

        
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return this.telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


}