package observerForms;

import busboyModel.BusboyState;

public class BusBoyStateNotify {
	public String busBoyState;
	public BusboyState state;
	
	public String getBusBoyState() {
		return busBoyState;
	}

	public void setBusBoyState(String busBoyState) {
		this.busBoyState = busBoyState;
	}

	public BusBoyStateNotify(String _busBoyState) {
		busBoyState = _busBoyState;
	}
	
	@Override
	public String toString() {
		return "busBoyStateNotify";
	}
}
