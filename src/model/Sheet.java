package model;

import java.util.HashMap;
import java.util.Observable;

import expr.Environment;
import expr.Expr;

public class Sheet extends Observable implements Environment {
HashMap<String, Expr> map = new HashMap<String, Expr>();


public Sheet(){
	map = new HashMap<String, Expr>();
}

public void add(String key, Expr value){
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
String s = name;
if()
	return map.get(name).value(this);
}
}

