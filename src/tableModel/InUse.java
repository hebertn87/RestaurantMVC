//Nathan Hebert 3/25/2018
package tableModel;

public class InUse implements TableState {

	TableModel table;
	
	public InUse(TableModel _table) {
		this.table = _table;
	}
	
	public void IsReady() {
		System.out.println("Table already in use.");
	}

	
	public void IsInUse() {
		System.out.println("Table already in use.");
	}


	public void DoesNeedCleaning() {
		System.out.println("Table now empty, needs to be cleaned.");
		table.setState(table.GetNeedsCleaning());
	}


	public void IsBeingCleaned() {
		System.out.println("Table still in use.");
	}

}
