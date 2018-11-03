package controller;

import model.Ellipse;
import model.IShape;
import model.Point;
import model.Rectangle;
import model.ShapeType;
import model.Triangle;
import model.interfaces.IApplicationState;

public class IShapeFactory {
	private IShapeFactory() {
		
	}
	
	//Strategy Pattern
	public static IShape createShape(Point startPoint, Point endPoint, IApplicationState applicationState) {
		IShape shape = null;
		
		ShapeType thisShape = applicationState.getActiveShapeType();
		
		if (thisShape == ShapeType.ELLIPSE) {
            shape = new Ellipse(applicationState, startPoint, endPoint);
        }
        else if (thisShape == ShapeType.RECTANGLE) {
            shape = new Rectangle(applicationState, startPoint, endPoint);
        }
        else if (thisShape == ShapeType.TRIANGLE) {
            shape = new Triangle(applicationState, startPoint, endPoint);
        }
		
		return shape;
	}

	public static Object selectShape(Point startPoint, Point endPoint, IApplicationState applicationState) {
		// TODO Auto-generated method stub
		return null;
	}
}
