
package pachet1;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

public class Imagine extends AbstractElement {
	String numeImagine;
	BufferedImage imagine = null;
	public Imagine (String numeImagine,String cale){
		if(cale == null)
		 {
	            throw new NullPointerException("Calea nu exista...");
		 }
		this.numeImagine=numeImagine;
		try{
			
		this.imagine = ImageIO.read(new File(cale));
		//this.imagine = (BufferedImage) ImageIO.createImageOutputStream(imagine);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


	public void print() {
		 System.out.println(numeImagine);
		
	}

	public void acceptVisitor(Visitor s) {
	
		 s.visitImagine(this);
	}
	
	  public String toString()
	    {
	        return numeImagine;
	    }


	@Override
	public void acceptVisitor(DocumentStatistics visitor) {
		// TODO Auto-generated method stub
		
	}

}
