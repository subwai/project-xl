package models;

import expr.Environment;

public abstract class Slot{
	abstract double value(Environment env) throws Exception;
}
