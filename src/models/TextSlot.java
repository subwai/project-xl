package models;

import expr.Environment;

public class TextSlot implements Slot{
	String string;
	
public TextSlot(String string){
		this.string = string;
	}

	@Override
	public double value(Environment env) throws Exception {
		throw new Exception();
	}

	
}
