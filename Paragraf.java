
package pachet1;
public class Paragraf extends AbstractElement{
	public String text;
	public AlignStrategy alignment;
	
	public Paragraf(String text, AlignStrategy alignment){
		this.text = text;
		this.alignment = alignment;
}

public void setAlign(AlignStrategy as)
{
    this.alignment = as;
}


public void addElement(Element elem) throws Exception{
	
}

public void remove(Element elem) {
	
}

public void getChild(int index) {
	
}

public void print() {
	   if(this.alignment != null)
           this.alignment.printAligned(text);
       else 
           System.out.println(text);
	
}

public void acceptVisitor(Visitor v)
{
    v.visitParagraf(this);
}
public String toString()
{
    return text;
}

@Override
public void acceptVisitor(DocumentStatistics visitor) {
	// TODO Auto-generated method stub
	
}

}
