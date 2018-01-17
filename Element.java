package pachet1;
public interface Element {

	public void addElement(Element elem) throws Exception;

	public void remove (Element elem);

	public  void getElement(int index);


	public void acceptVisitor(DocumentStatistics visitor);

	public void print();

}
