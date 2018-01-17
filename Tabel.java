package pachet1;
public class Tabel extends AbstractElement{
	String numeTabel;
	
	
	
	public Tabel (String numeTabel) {
		this.numeTabel=numeTabel;
	}
	
	public void addElement(Element elem) throws Exception {
		
	}
	
	public void remove(Element elem) {
		
	}
	
	public void getChild(int index) {
		
	}
	
	public void print() {
		 System.out.println(numeTabel);
		
	}
	
	public void acceptVisitor(Visitor s) {
		  s.visitTabel(this);
	}
	
	
	public String toString()
    {
        return numeTabel;
    }

	@Override
	public void acceptVisitor(DocumentStatistics visitor) {
		// TODO Auto-generated method stub
		
	}
}
