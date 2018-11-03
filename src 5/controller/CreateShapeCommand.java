package controller;

import java.awt.Graphics2D;

import model.IShape;
import model.IShapeList;
import model.Point;
import model.ShapeList;

import model.interfaces.IApplicationState;
import view.gui.PaintCanvas;


public class CreateShapeCommand implements ICommand, IUndoable {

	private IApplicationState applicationState;
	private ShapeList shapeList;
	private IShape shape;
	PaintCanvas paintCanvas;
	Graphics2D graphics;
	
	public CreateShapeCommand(IApplicationState applicationState, ShapeList shapeList) {
		this.applicationState = applicationState;
		this.shapeList = shapeList;
	}
	
	@Override
	public void createShape(Point startPoint, Point endPoint) {
		shape = IShapeFactory.createShape(startPoint, endPoint, applicationState);	
	}
	
	@Override
	public void run(){
		//createShape(startPoint, endPoint);
		shapeList.addShape(shape);
		System.out.println(shapeList.toString());
		System.out.println("in createshapecommand");
		CommandHistory.add(this);
		System.out.println("added to commandhistory");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("In undo");
		shapeList.removeShape(shape);
		//new UndoCommand().run();
		//CommandHistory.undo();
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		shapeList.addShape(shape);
		//CommandHistory.redo();
	}

	@Override
	public void selectShape(Point startPoint, Point endPoint) {
		// TODO Auto-generated method stub
		
	}

}
