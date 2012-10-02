package models;

import expr.Environment;

public interface Slot {
	double value(Environment env) throws Exception;
}
