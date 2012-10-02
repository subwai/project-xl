package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingConstants;

import models.CurrentModel;
import models.SlotModel;

public class SlotLabels extends GridPanel {
    private List<SlotLabel> labelList;
    private List<SlotModel> modelList;
    private CurrentModel currentModel;

    public SlotLabels(int rows, int cols, CurrentModel currentModel) {
        super(rows + 1, cols);
        labelList = new ArrayList<SlotLabel>(rows * cols);
        modelList = new ArrayList<SlotModel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
            	SlotModel slot = new SlotModel(ch + String.valueOf(row));
                SlotLabel label = new SlotLabel(slot, currentModel);
                add(label);
                labelList.add(label);
                modelList.add(slot);
            }
        }
        currentModel.setCurrent(modelList.get(0));        
    }
}
