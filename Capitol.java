package pachet1;
import java.util.*;

public class Capitol implements Element {
	String titluCapitol;
	
	public ArrayList<Subcapitol> subcapitole = new  ArrayList<Subcapitol>();
	


public Capitol(String titluCapitol, ArrayList<Subcapitol> subcapitole) {
		super();
		this.titluCapitol = titluCapitol;
		this.subcapitole = subcapitole;
	}



public void print() {
	System.out.println(titluCapitol);
}



public void addElement(Element elem) throws Exception {
	
}



public void remove(Element elem) {
	
}



public void getChild(int index) {

}



public void acceptVisitor(Visitor s) {
	
}


public void getElement(int index) {
	
}



@Override
public void acceptVisitor(DocumentStatistics visitor) {
	// TODO Auto-generated method stub
	
}

















}
