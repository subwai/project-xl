package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;
import models.CurrentModel;

public class StatusPanel extends BorderPanel {
    protected StatusPanel(StatusLabel statusLabel, CurrentModel current) {
        add(WEST, new CurrentLabel(current));
        add(CENTER, statusLabel);
    }
}