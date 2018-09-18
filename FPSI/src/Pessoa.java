

public class Pessoa {	
	private String nome;
	private  int idade;									//atributos
	private  String telefone;
	private float altura;
			

	
	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}


	public Pessoa() {
		// TODO Auto-generated constructor stub
	}	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	String mostraDados() {						// método
		
		String ret = ("\nNome: "+ this.nome +"\nIdade: "+ this.idade +"\nTelefone: " + this.telefone);
		return ret;								// ret (variável)
	}
	
	
	//Classe
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idade;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pessoa other = (Pessoa) obj;
			if (idade != other.idade)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (telefone == null) {
				if (other.telefone != null)
					return false;
			} else if (!telefone.equals(other.telefone))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
		}


}
