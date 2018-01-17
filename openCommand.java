package pachet1;
import java.io.File;
//import java.util.Calendar.Builder;

public class openCommand implements Command {
	File fisier;
	public void execute()
	{
		//Builder builder = new JSONBuilder("book.json");
		//builder.build();
		//Element book = builder.getResult();
		DocumentManager.getInstance().getBook();
		
	}
	private static void open(File filename) {
		
		
	}
}
