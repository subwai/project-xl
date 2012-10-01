package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import models.CurrentSlot;

public class SlotLabel extends ColoredLabel implements MouseListener {
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
}