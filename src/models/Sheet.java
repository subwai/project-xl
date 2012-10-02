package models;

import java.util.HashMap;
import java.util.Observable;

import expr.Environment;
import expr.Expr;

public class Sheet extends Observable implements Environment {
	HashMap<String, Slot> map = new HashMap<String, Slot>();


	public Sheet(){
		map = new HashMap<String, Slot>();
	}

	public void add(String key, Slot value){
		remove(key);
		map.put(key, value);
		inform();
	}

	public void remove(String key){
		if(map.containsKey(key)){
			map.remove(key);
			inform();
		}
	}

	private void inform(){
		setChanged();
		notifyObservers();
	}

	public double value(String name){

		try{
			double d = 	map.get(name).value(this);
			return d;
		} catch (Exception e){
			System.out.println("Kan inte utföra räkneoperationer med en textruta");
			return 0;
		}


	}
}

