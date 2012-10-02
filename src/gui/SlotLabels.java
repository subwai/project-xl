package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingConstants;

import models.CurrentSlot;

public class SlotLabels extends GridPanel implements Observer {
    private List<SlotLabel> labelList;
    private CurrentSlot current;

    public SlotLabels(int rows, int cols) {
        super(rows + 1, cols);
        current = new CurrentSlot();
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                SlotLabel label = new SlotLabel(current);
                add(label);
                labelList.add(label);
            }
        }
        current.addObserver(this);
        current.setCurrent(labelList.get(0));
        update(null, null);
    }
    
	@Override
	public void update(Observable o, Object arg) {
		current.getCurrent().setBackground(Color.YELLOW);
	}
}
