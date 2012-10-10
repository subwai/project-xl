package models;

import expr.Environment;
import expr.Expr;

public class ExprContent implements Content {
	Expr expr;

	ExprContent(Expr expr){
		this.expr = expr;
	}

	public double value(Environment env){
		return expr.value(env);
	}

	public String toString(){
		return expr.toString();
	}
}
