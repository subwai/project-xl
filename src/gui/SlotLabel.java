package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import models.CurrentModel;
import models.Sheet;
import models.SlotModel;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer {
	private SlotModel model;
	private CurrentModel currentModel;
	
    public SlotLabel(SlotModel model, CurrentModel currentModel) {
        super("                    ", Color.WHITE, RIGHT);
        this.model = model;
        this.currentModel = currentModel;
        addMouseListener(this);
        model.addObserver(this);
        currentModel.addObserver(this);
    }

    @Override
	public void update(Observable o, Object arg) {
    	if (arg.equals(0)) {
    		if (currentModel.getSlot().equals(model)) {
    			setBackground(Color.YELLOW);
    		} else {
    			setBackground(Color.WHITE);
    		}
    	}
		
    	if(arg instanceof Sheet){
			try {
				setText(String.valueOf(model.getValue((Sheet)arg)));
			} catch (Exception e) {
				setText(model.getText());
			}
		}
	}
    
	@Override
	public void mouseClicked(MouseEvent e) {
		currentModel.setCurrent(model);
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