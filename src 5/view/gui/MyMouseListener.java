package view.gui;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

import controller.ICommand;
import model.Point;
import model.interfaces.IApplicationState;

public class MyMouseListener extends MouseInputAdapter {
	Point startPoint;
	Point endPoint;
	private final IApplicationState applicationState; 
	private ICommand command;
	
	public MyMouseListener(IApplicationState applicationState, ICommand command) {
		this.applicationState = applicationState;
		this.command = command;
	}

	public void mousePressed(MouseEvent e) {
		startPoint = new Point(e.getX(), e.getY());
		System.out.println("Start point: (" + e.getX() + "," + e.getY() + ")");
	}
	
	public void mouseReleased(MouseEvent e) {
		endPoint = new Point(e.getX(), e.getY());
		System.out.println("End point: (" + e.getX() + "," + e.getY() + ")");
		command.createShape(startPoint, endPoint); 
		command.run();	
	}
	
	static void run(ICommand cmd){
		cmd.run();
	}

}