package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import models.EditModel;

public class Editor extends Observable implements ActionListener {
	
	public Editor(EditModel editor) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setChanged();
		this.notifyAll();
	}

}
