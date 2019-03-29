package hotel;

public class Motel {

		private String nome;
		private String email;
		
		public Motel (String nome, String email) {
			this.nome = nome;
			this.email = email;
		}
		
		public String toString() {
			return nome + " que pode ser contactado pelo email " + email;
		}
}
