package models;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Map.Entry;
import java.util.Set;

import expr.Expr;

//TODO move to another package
public class XLPrintStream extends PrintStream {
    public XLPrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    // TODO Change Object to something appropriate
    public void save(Set<Entry<String, SlotModel>> set) {
        for (Entry<String, SlotModel> entry : set) {
            print(entry.getKey());
            print('=');
            println(entry.getValue());
        }
        flush();
        close();
    }
}
