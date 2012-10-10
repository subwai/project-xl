package models;

import java.util.Observable;

import util.XLException;

import expr.Environment;
import expr.ExprParser;

public class SlotModel extends Observable {
	private static final ExprParser parser = new ExprParser();
	
	private String name;
	Content content;
	private String error;
	
	public SlotModel(String name) {
		this.name = name;
		content = new TextContent("                    ");
	}
	
	public void setContent(String text, Environment env) {
		try{content = new ExprContent(parser.build(text));
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
	
	public Content getContent(){
		return content;
	}

	public double getValue(Environment env) {
		error = "";
		if(content instanceof ExprContent)
		{
		CircularContent cc = new CircularContent(content);
		try { return cc.value(env);}
		catch (XLException e){
			error = e.getMessage();
			setChanged();
			notifyObservers(0);
			return 0;
		} catch (NullPointerException e){
			error = "Kan inte utföra räkneoperation med tom ruta";
			setChanged();
			notifyObservers(0);
			return 0;
		}
		} 
		error = "Kan inte utföra räkneoperation med textruta";
		return 0;

}
	public String getError(){
		return error;
	}
}
