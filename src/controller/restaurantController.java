package controller;

import java.util.Observable;
import java.util.Observer;

import observerForms.BusBoyStateNotify;
import observerForms.ControllerNotify;
import observerForms.TableStateNotify;
import observerForms.UpwardNotify;
import observerForms.ViewNotify;

import view.RestaurantView;

@SuppressWarnings("deprecation")
public class RestaurantController extends Observable implements Observer {

		public RestaurantModel restaurant;
		public RestaurantView view;
		
		public RestaurantController(RestaurantModel _restaurant, RestaurantView _v) {
			restaurant = _restaurant;
			view = _v;
			this.addObserver(restaurant);
			this.addObserver(view);
			
		}
		
		@Override
		public synchronized void update(Observable arg0, Object arg1) {
			
			ControllerNotify newCommand;
			
			//If message from view
			if(arg1.toString().equals("ViewNotify")) {
				ViewNotify viewCommand = (ViewNotify) arg1;
				newCommand = new ControllerNotify(viewCommand);
				this.setChanged();
				this.notifyObservers(newCommand);
			}
			//If message from table
			if(arg1.toString().equals("TableStateNotify")) {
				TableStateNotify tableNotify = (TableStateNotify) arg1;
				UpwardNotify myNotify = new UpwardNotify(tableNotify);
				this.setChanged();
				this.notifyObservers(myNotify);
			}
			//If message from bus boy
			if(arg1.toString().equals("BusBoyStateNotify")) {
				BusBoyStateNotify busBoyStateNotify = (BusBoyStateNotify) arg1;
				UpwardNotify myNotify = new UpwardNotify(busBoyStateNotify);
				this.setChanged();
				this.notifyObservers(myNotify);
			}
			
			
		}
}


