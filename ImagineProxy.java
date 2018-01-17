package pachet1;

public class ImagineProxy extends AbstractElement {
	private String numeImagine;
	private Imagine realImage;
	String cale;
	public  ImagineProxy (String numeImagine,String cale){
		this.numeImagine=numeImagine;
		this.cale=cale;
	}
	

	public void addElement(Element elem) throws Exception {
		
	}

	
	public void remove(Element elem) {
		
	}

	
	public void getChild(int index) {
		
	
	}

	public void print() {
		
		this.realImage= new Imagine(numeImagine,cale);
		System.out.println(realImage);
		
	}


	@Override
	public void acceptVisitor(DocumentStatistics visitor) {
		// TODO Auto-generated method stub
		
	}



	
	
	

}
