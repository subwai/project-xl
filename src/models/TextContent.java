package models;

import util.XLException;
import expr.Environment;

public class TextContent implements Content{
	String string;
	
public TextContent(String string){
		this.string = string;
	}

	public double value(Environment env) throws XLException {
		return 0;
		//throw new XLException("Kan inte utföra räkneoperationer med textruta");
	}

	public String toString(){
		return string;
	}
}
