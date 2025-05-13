abstract public class Acc {
	
	protected int id;
	protected String name;
	private Datasource myData;

	public void performOperation(Datasource _myData){
		myData = _myData;
		myData.execute();
	}
}










