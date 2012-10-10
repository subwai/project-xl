package models;

import java.util.Observable;

import expr.Environment;
import expr.ExprParser;

public class SlotModel extends Observable {
	private static final ExprParser parser = new ExprParser();
	
	private String name;
	Content content;
	
	public SlotModel(String name) {
		this.name = name;
		content = new TextContent("                    ");
	}
	
	public void setContent(String text, Environment env) {
		try {
			content = new ExprContent(parser.build(text));
		} catch (Exception e) {
			content = new TextContent(text);
		}
		
		setChanged();
		notifyObservers(env);
	}
	
	public String getName() {
		return name;
	}
	
	public String getText() {
		return content.toString();
	}
	

	public double getValue(Environment env) throws Exception {
		return content.value(env);
	}

}
