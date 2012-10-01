package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import models.LabelModel;

public class ColoredLabel extends JLabel {
	
    public ColoredLabel(String text) {
    	this(text, Color.WHITE, SwingConstants.LEFT);
    }

    public ColoredLabel(String text, Color color) {
        this(text, color, SwingConstants.LEFT);
    }

    public ColoredLabel(String text, Color color, int alignment) {
        super(text, alignment);
        setBackground(color);
        setOpaque(true);
    }

}