package models;

import expr.Environment;

public abstract class Content{
	abstract double value(Environment env) throws Exception;
}
