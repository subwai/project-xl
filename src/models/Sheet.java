package models;

import java.util.HashMap;
import java.util.Map;

import expr.Environment;
import expr.Expr;

public class Sheet implements Environment {
	
	private Map<String, Expr> matrix;
	
	public Sheet() {
		this.matrix = new HashMap<String, Expr>();
	}
	
	@Override
	public double value(String name) {
		return matrix.get(name).value(this);
	}

}
