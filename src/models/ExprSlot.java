package models;

import expr.Environment;
import expr.Expr;

public class ExprSlot implements Slot {
Expr expr;

ExprSlot(Expr expr){
	this.expr = expr;
	}

public double value(Environment env){
	return expr.value(env);
}
}
