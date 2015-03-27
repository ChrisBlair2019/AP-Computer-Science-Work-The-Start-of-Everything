/*
 * @(#)PetShop.java 1.0 04/07/05
 */

import java.awt.*;
import java.awt.event.*;

class PetShop extends Frame {
	
	public PetShop() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		System.out.println("Starting PetShop...");
		PetShop mainFrame = new PetShop();
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("PetShop");
		mainFrame.setVisible(true);
	}
}
