package controller;

import java.util.ArrayList;
import java.util.List;

import model.IShape;
import model.IShapeList;
import model.Point;
import model.SelectedShapeList;
import model.interfaces.IApplicationState;


public class SelectShapeCommand implements ICommand{
	private IShapeList shapeList;
	private ArrayList<ISelectedShape> selectedShapes = new ArrayList<ISelectedShape>();
	private IShape shape;
	private SelectedShapeList selectedShapeList;
	private IApplicationState applicationState;
	
	public SelectShapeCommand (IApplicationState applicationState, IShapeList shapeList, SelectedShapeList selectedShapeList) {
		this.applicationState = applicationState;
		this.shapeList = shapeList;
		this.selectedShapeList = selectedShapeList;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void selectShape(Point startPoint, Point endPoint) {
		//shape = IShapeFactory.selectShape(startPoint, endPoint, applicationState);
		System.out.println("hello");
		//deleteAll();	
//		for (IShape shape : shapeList.toArray()) 
//		{
//			if ( shape.getShapePoints().getStartX() < startingPoint.getX() +endingPoint.getX() - startingPoint.getX()
//					&& shape.getShapePoints().getStartX() + shape.getShapePoints().getWidth() > startingPoint.getX() 
//					&& shape.getShapePoints().getStartY() < startingPoint.getX() + endingPoint.getY() - startingPoint.getY()
//					&& shape.getShapePoints().getHeight() + shape.getShapePoints().getStartY() > startingPoint.getY())
//			{
//				selectedShapes.add(shape);
//				System.out.println("selected" + selectedShapes.size());
//			}
//		}
	
		
		//selectedShape = IShapeFactory.selectShape(startPoint, endPoint, applicationState);
		
		// TODO Auto-generated method stub
		//deleteAll();	
//		for (IDisplayableShape shape : shapeList) 
//		{
//			//if ( shape.getShapePoints().getStartX() < startingPoint.getX() +endingPoint.getX() - startingPoint.getX()
//			if ( shape. < startingPoint.getX() +endingPoint.getX() - startingPoint.getX()
//				&& shape.getShapePoints().getStartX() + shape.getShapePoints().getWidth() > startingPoint.getX() 
//					&& shape.getShapePoints().getStartY() < startingPoint.getX() + endingPoint.getY() - startingPoint.getY()
//					&& shape.getShapePoints().getHeight() + shape.getShapePoints().getStartY() > startingPoint.getY())
//			{
//				selectedShapes.add(shape);
//				System.out.println("selected" + selectedShapes.size());
//			}
//		}
//	}
	}

	@Override
	public void createShape(Point startPoint, Point endPoint) {
		// TODO Auto-generated method stub
		
	}

}
