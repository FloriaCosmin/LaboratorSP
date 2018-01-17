package pachet1;

import java.util.ArrayList;

public class Carte {
	
	private String titlu;
	private ArrayList<Autor> autori;
	private ArrayList<Element> capitole;
	private Cuprins cuprins;
	
	public AlignStrategy leftAlign = new LeftAlign();
	public AlignStrategy centerAlign = new CenterAlign();
	public AlignStrategy rightAlign = new RightAlign();
	
	public Carte(){
		this.titlu = "";
		this.autori = new ArrayList<Autor>();
		this.capitole = new ArrayList<Element>();
	}
	
	public Carte(String titlu,Cuprins cuprins, ArrayList<Autor> autor, ArrayList<Element> capitole){
		this.titlu = titlu;
		this.autori = autor;
		this.capitole = capitole;
		this.cuprins = cuprins;
	}
	public void addElement(Paragraf p){
		this.capitole.add(p);
	}
	public void printBook(){
		for(Element e : this.capitole){
			e.print();
		}
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	public ArrayList<Element> getCapitole() {
		return capitole;
	}

	public void setCapitole(ArrayList<Element> capitole) {
		this.capitole = capitole;
	}

	public Cuprins getCuprins() {
		return cuprins;
	}

	public void setCuprins(Cuprins cuprins) {
		this.cuprins = cuprins;
	}

	
	public bookCover coperta;
	public bookCover getCoperta() {
		return coperta;
	}
	public void setCoperta(bookCover coperta) {
		this.coperta = coperta;
	}
	public bookNoPages getPagina() {
		return pagina;
	}
	public void setPagina(bookNoPages pagina) {
		this.pagina = pagina;
	}
	public bookNoPages pagina;

	public void printOut2() {
		System.out.print(coperta.title + " " + pagina.noPages);
}
	
}

