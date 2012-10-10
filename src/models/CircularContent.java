package models;

import util.XLException;
import expr.Environment;
import expr.Expr;

public class CircularContent implements Content {
	SlotModel s;
	
	public CircularContent(SlotModel s){
		this.s = s;
	}
	
	public double value(Environment env) throws Exception {
		try{
			return s.getValue(env);
		} catch (StackOverflowError e){
			throw new XLException("Cirkulär referens");
		}
	}

}
