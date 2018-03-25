package tableModel;

public interface TableState {
	public void ready();
	public void inUse();
	public void needCleaning();
	public void beingCleaned();
}	
