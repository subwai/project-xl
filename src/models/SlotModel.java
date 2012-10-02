package models;

import java.util.Observable;

import expr.Environment;
import expr.Expr;

public class SlotModel extends Observable {
	private String name;
	private Content content;
	
	public SlotModel(String name) {
		this.name = name;
	}
	
	public void setExpression(String text) {
		setChanged();
		notifyObservers(1);
	}
	
	public String getName() {
		return name;
	}
	
	public String getText() {
		return content.toString();
	}
	
	public String getValue(Environment env) {
		return String.valueOf(content.value(env));
	}
}
