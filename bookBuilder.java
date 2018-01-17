package pachet1;
public class bookBuilder implements IBuilder{
	private Carte mybook = null;
	
	public Carte getBook() {
		return mybook;
	}
	
	public void buildBook() {
	    mybook = new Carte();
	    mybook.setCoperta(buildCover("It"));
    	mybook.setPagina(buildPages(20)); 
	    mybook.printBook();
	}
	
	private  bookCover buildCover(String title) {
		return new bookCover(title);
	}
	
	private bookNoPages buildPages(int noPages) {
		return new bookNoPages(noPages);
	}
}