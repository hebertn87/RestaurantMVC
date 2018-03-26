//Nathan Hebert 3/25/2018
package busboyModel;

//Interface for the busboy states
public interface BusboyState {
	public void GoOffShift();
	public void CleanBackroom();
	public void CleanTable();
	
	public void exeption();
}
