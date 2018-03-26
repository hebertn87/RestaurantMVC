package tableModel;

public interface TableState {
	public void IsReady();
	public void IsInUse();
	public void DoesNeedCleaning();
	public void IsBeingCleaned();
}	
