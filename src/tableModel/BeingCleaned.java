package tableModel;

public class BeingCleaned implements TableState {


	TableModel table;
	
	public BeingCleaned(TableModel _table) {
		this.table = _table;
	}
	
	//Once table is done being cleaned, can be ready again.
	public void IsReady() {
		System.out.println("Table now ready for customers.");
		table.setState(table.GetReady());
	}

	//Does nothing, table can't be in use if being cleaned
	public void IsInUse() {
		System.out.println("Table being cleaned, cannot be used.");
	}

	//Does nothing, table already being cleaned.
	public void DoesNeedCleaning() {
		System.out.println("Table is being cleaned right now.");
	}

	//Does nothing, table already being cleaned.
	public void IsBeingCleaned() {
		System.out.println("Table already being cleaned.");
	}

}
