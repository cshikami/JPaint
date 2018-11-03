package view.gui;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

import controller.CreateShapeCommand;
import controller.ICommand;
import controller.SelectShapeCommand;
import model.Point;
import model.ShapeList;
import model.ShapeType;
import model.StartAndEndPointMode;
import model.interfaces.IApplicationState;

public class MyMouseListener extends MouseInputAdapter {
	Point startPoint;
	Point endPoint;
	private final IApplicationState applicationState; 
	private ICommand command;
	private ShapeList shapeList;
	private SelectShapeCommand selectShapeCommand;
	
	public MyMouseListener(IApplicationState applicationState, ICommand command, SelectShapeCommand selectShapeCommand) {
		this.applicationState = applicationState;
		this.command = command;
		this.selectShapeCommand = selectShapeCommand;
	}

	public void mousePressed(MouseEvent e) {
		startPoint = new Point(e.getX(), e.getY());
		System.out.println("Start point: (" + e.getX() + "," + e.getY() + ")");
	}
	
	public void mouseReleased(MouseEvent e) {
		endPoint = new Point(e.getX(), e.getY());
		System.out.println("End point: (" + e.getX() + "," + e.getY() + ")");
		StartAndEndPointMode startAndEndPointMode = applicationState.getActiveStartAndEndPointMode();
		switch (startAndEndPointMode) {
		case DRAW:
			command.createShape(startPoint, endPoint); 
		case SELECT:
			System.out.println("In select of mouse listener");
			command.selectShape(startPoint, endPoint);
		}
		
		
			//command = new CreateShapeCommand(applicationState, shapeList, startPoint, endPoint);
		
		command.run();	
	}
	
	static void run(ICommand cmd){
		cmd.run();
	}

}