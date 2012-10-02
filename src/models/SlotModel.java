package models;

import java.util.Observable;

import expr.Environment;
import expr.Expr;

public class SlotModel extends Observable {
	private String name;
	private Expr expression;
	
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
		return expression.toString();
	}
	
	public String getValue(Environment env) {
		return "test";
	}
}
