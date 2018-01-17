package pachet1;

import java.util.ArrayList;



public class Sectiune implements Element {
	
	public ArrayList<Element> elemente;
	public String titlu;
	
	public Sectiune(String titlu){
		elemente = new ArrayList<Element>();
		this.titlu = titlu;
	}

	public void addElement(Element e) {
		elemente.add(e);
	}

	
	public int getElements() {
		return elemente.size();
	}

	public void print() {
		System.out.println(this.titlu);
		for(Element e : this.elemente){
			e.print();
		}
	}

	public void remove(Element elem) {
		elemente.remove(elem);
	}

	public void getElement(int index) {
		
	}

	
	public void acceptVisitor(Visitor s) {
		s.visitSectiune(this);
	}

	@Override
	public void acceptVisitor(DocumentStatistics visitor) {
		// TODO Auto-generated method stub
		
	}
    
	

}
