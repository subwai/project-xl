package controllers;

import gui.ColoredLabel;
import gui.SlotLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import models.LabelModel;

public class LabelController implements MouseListener {

	private LabelModel label;
	
	public LabelController(LabelModel label) {
		this.label = label;
	}
	
	
		
	@Override
	public void mouseClicked(MouseEvent arg0) {
		label.setCurrent();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
