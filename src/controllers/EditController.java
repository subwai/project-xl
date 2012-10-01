package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import models.EditModel;

public class EditController implements ActionListener {
	
	private EditModel model;
	
	public EditController(EditModel editor) {
		model = editor;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setText(((Editor)e.getSource()).toString());
	}

}
