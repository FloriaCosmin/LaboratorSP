package pachet1;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Autor> autor=new ArrayList<Autor>();
		ArrayList<Element> capitole=new ArrayList<Element>();
		Carte c = new Carte("abcdef",null,autor,capitole);
		c.getCapitole().add(new Sectiune("Sectiunea I"));
		Paragraf p = new Paragraf("acesta este un text obisnuit",null);
		SpecialArt aa= new SpecialArt(p);
		//c.addElement();
		Sectiune a = new Sectiune("Sectiunea I");
		a.elemente.add(new Imagine("Imagine 1","/home/user/Documents/index.jpeg"));
		a.elemente.add(new Paragraf("A fost odata..",c.leftAlign));
		a.elemente.add(new Paragraf("ca niciodata...",c.centerAlign));
		c.getCapitole().add(a);
		Sectiune b = new Sectiune("Sectiunea II");
		b.elemente.add(new Paragraf("Si nu dupa mult timp...",c.rightAlign));
		b.elemente.add(new Imagine("Imagine 2",null));
		b.elemente.add(new Imagine("Imagine 3",null));
		c.getCapitole().add(b);
		c.printBook();
		
		
		
		
		File filename;
		Command openCommand = new openCommand();
		
		
		
		

	}

	

}
