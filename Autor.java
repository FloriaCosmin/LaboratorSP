package pachet1;
public class Autor {
	private String nume;
	
	public Autor () {
		this.nume = "Anonim";
		
	}
	public Autor (String nume) {
		this.nume = nume;
		
	}
	public String getAutor(){
		return this.nume;
	}
	public void setNume(String nume){
		this.nume= nume;
	}
	
	public String toString() {
		return "Autor [nume=" + nume + "]";
	}
}
	

