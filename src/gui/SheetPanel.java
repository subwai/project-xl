package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;
import models.CurrentModel;

public class SheetPanel extends BorderPanel {
    public SheetPanel(int rows, int columns, CurrentModel currentModel) {
        add(WEST, new RowLabels(rows));
        add(CENTER, new SlotLabels(rows, columns, currentModel));
    }
}