/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;

import javax.swing.*;

public class NameSurfer extends GraphicsProgram implements NameSurferConstants {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	public void init() {
		createController();
		   addActionListeners(); getMouseListeners();
	    // You fill this in, along with any helper methods //
	}
	private void createController() {
		  nameField = new JTextField(25); nameField.addActionListener(this); addButton = new JButton("Add"); removeButton = new JButton("Remove"); clearButton = new JButton("Clear"); add(new JLabel("Name"), SOUTH); add(nameField, SOUTH);
	      add(addButton, SOUTH);
	      add(removeButton, SOUTH);
	      add(clearButton, SOUTH);
		}
/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		// You fill this in //
	}
	   private JTextField nameField;
	   private JButton addButton;
	   private JButton removeButton;
	   private JButton clearButton;
	
}
