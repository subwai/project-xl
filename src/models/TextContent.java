package models;

import expr.Environment;

public class TextContent extends Content{
	String string;
	
public TextContent(String string){
		this.string = string;
	}

	public double value(Environment env) throws Exception {
		throw new Exception();
	}

	public String toString(){
		return string;
	}
}
