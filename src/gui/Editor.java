package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import expr.Environment;

import models.CurrentModel;
import models.Sheet;
import models.SlotModel;

public class Editor extends JTextField implements ActionListener, Observer {
	private CurrentModel model;
	private Sheet env;
	
    public Editor(CurrentModel model, Sheet env) {
        setBackground(Color.WHITE);
        this.model = model;
        this.model.addObserver(this);
        this.env = env;
        addActionListener(this);
    }

	@Override
	public void update(Observable o, Object arg) {
		setText(model.getSlot().getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		SlotModel sm = model.getSlot();
		sm.setContent(getText(), env);
		env.add(sm.getName(), sm);
	}
}