package models;

import util.XLException;
import expr.Environment;
import expr.Expr;

public class CircularContent implements Content {
	Content s;
	
	public CircularContent(Content s){
		this.s = s;
	}
	
	public double value(Environment env) throws XLException {
		if(s instanceof ExprContent){
			
		try{
			s.value(env);
		} catch (StackOverflowError e){
			throw new XLException("Cirkulär referens");
		}
	}
	return s.value(env);
	}
}
