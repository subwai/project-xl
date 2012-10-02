package models;

import expr.Environment;

public class TextSlot extends Slot{
	String string;
	
public TextSlot(String string){
		this.string = string;
	}

	public double value(Environment env) throws Exception {
		throw new Exception();
	}

	public String toString(){
		return string;
	}
}
