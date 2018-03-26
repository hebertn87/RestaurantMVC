//Nathan Hebert 3/25/2018
package tableModel;

//Interface for the table states
public interface TableState {
	public void IsReady();
	public void IsInUse();
	public void DoesNeedCleaning();
	public void IsBeingCleaned();
}	
