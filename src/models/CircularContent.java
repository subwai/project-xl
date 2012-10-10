package models;

import util.XLException;
import expr.Environment;
import expr.Expr;

public class CircularContent implements Content {
	Content content;
	
	public CircularContent(Content c){
		content = c;
	}
	
	public double value(Environment env) throws Exception {
		try{
			return content.value(env);
		} catch (StackOverflowError e){
			throw new XLException("Cirkulär referens");
		}
	}

}
