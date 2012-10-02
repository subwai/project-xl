package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import models.CurrentSlot;
import models.Sheet;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer {
	private CurrentSlot current;
	
    public SlotLabel(CurrentSlot current) {
        super("                    ", Color.WHITE, RIGHT);
        this.current = current;
        addMouseListener(this);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		current.setCurrent((SlotLabel)e.getSource());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void update(Observable o, Object arg) {
		if(arg instanceof Sheet){
			Sheet sheet = (Sheet) arg;
		try{
			setText(String.valueOf(sheet.value(new String("A1"))));}  catch (Exception e){
				setText(sheet.toString("a1"));
			}
		}
	}
		
	
	
	
}