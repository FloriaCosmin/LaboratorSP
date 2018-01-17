package pachet1;
public abstract class AbstractElement implements Element {

	public void acceptVisitor(Visitor s) {
		System.out.println("Soon to be implemented :)");
	}
	
	public void addElement(Element elem) throws Exception {
		throw new Exception("Not supported");
		
	}
	
	public int getElements(){
		
		return 0;
	}
	
	public void getChild(int index) {
		 throw new UnsupportedOperationException("Not yet implemented.");
	
	}

	public void print() {
		
		System.out.println("Soon to be implemented :)");
	}


	public void remove(Element e) {
		System.out.println("Not supported yet...");
		
	}

	
	public void getElement(int index) {
		
	}

	
	
	

}
