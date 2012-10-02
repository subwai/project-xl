package models;

import java.util.HashMap;
import java.util.Observable;

import expr.Environment;

public class Sheet extends Observable implements Environment {
	HashMap<String, Content> map = new HashMap<String, Content>();

	public Sheet() {
		map = new HashMap<String, Content>();
	}

	public void add(String key, Content value) {
		remove(key);
		map.put(key, value);
		inform();
	}

	public void remove(String key) {
		if (map.containsKey(key)) {
			map.remove(key);
			inform();
		}
	}

	private void inform() {
		setChanged();
		notifyObservers();
	}

	public double value(String name) {

		try {
			return map.get(name).value(this);
		} catch (Exception e) {
			System.out
					.println("Kan inte utföra räkneoperationer med en textruta");
			return 0;
		}

	}

	public String toString(String name) {
		return map.get(name).toString();
	}

}
