package controller;

import view.RestaurantView;

public class RestaurantDriver {
	
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RestaurantController controller = null;
				RestaurantModel myRest = null;
				
				myRest = new RestaurantModel(controller);
				RestaurantView a = new RestaurantView();
				controller = new RestaurantController(myRest, a);
				myRest.updateRef(controller);
				
			}
		});
	}
}
