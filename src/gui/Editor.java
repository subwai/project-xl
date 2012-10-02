package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import models.CurrentModel;

public class Editor extends JTextField implements ActionListener, Observer {
	private CurrentModel model;
	
    public Editor(CurrentModel model) {
        setBackground(Color.WHITE);
        this.model = model;
        this.model.addObserver(this);
        addActionListener(this);
    }

	@Override
	public void update(Observable o, Object arg) {
		setText(model.getSlot().getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.getSlot().setExpression(getText());
	}
}