package pachet1;
public class StatisticsCommand implements Command{

	public void execute()
	{
		Element book = DocumentManager.getInstance().getBook();
		DocumentStatistics visitor  = new DocumentStatistics();
		book.acceptVisitor(visitor);
		visitor.printStatistics();
	}
	
}
