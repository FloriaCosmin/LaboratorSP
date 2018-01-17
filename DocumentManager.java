package pachet1;
class DocumentManager {
	
	private static DocumentManager instance;
	private Element book;
	public static DocumentManager getInstance()
	{
		if(instance==null)
		{
			instance= new DocumentManager();
		}
		return instance;
	}
	public Element getBook() {
		return this.book;
	}
	
}
