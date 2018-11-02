package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.IShape;
import model.Point;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.interfaces.IApplicationState;
import view.gui.PaintCanvas;

public class Ellipse implements IShape {
	private final ShapeType shapeType;
	private ShapeColor shapePrimaryColor;
	private ShapeColor shapeSecondaryColor;
	private ShapeShadingType shapeShadingType;
	private final IApplicationState applicationState;
	private Point startPoint;
	private Point endPoint;

	public Ellipse(IApplicationState applicationState, Point startPoint, Point endPoint){
		this.applicationState = applicationState;
		shapeType = applicationState.getActiveShapeType();
		shapePrimaryColor = applicationState.getActivePrimaryColor();
		shapeSecondaryColor = applicationState.getActiveSecondaryColor();
		shapeShadingType = applicationState.getActiveShapeShadingType();
		this.startPoint = startPoint;
		this.endPoint  = endPoint;
	}

	@Override
	public void setShapeShadingType() {
		this.shapeShadingType = shapeShadingType;
	}

	@Override
	public void setShapePrimaryColor() {
		// TODO Auto-generated method stub
		this.shapePrimaryColor = shapePrimaryColor;

	}

	@Override
	public void setShapeSecondaryColor() {
		// TODO Auto-generated method stub
		this.shapeSecondaryColor = shapeSecondaryColor;

	}

	@Override
	public Point getStartPoint() {
		// TODO Auto-generated method stub
		return startPoint;
	}

	@Override
	public Point getEndPoint() {
		// TODO Auto-generated method stub
		return endPoint;
	}

	@Override
	public ShapeColor getShapePrimaryColor() {
		// TODO Auto-generated method stub
		return shapePrimaryColor;
	}

	@Override
	public ShapeColor getShapeSecondaryColor() {
		// TODO Auto-generated method stub
		return shapeSecondaryColor;
	}

	@Override
	public ShapeShadingType getShapeShadingType() {
		// TODO Auto-generated method stub
		return shapeShadingType;
	}

	@Override
	public ShapeType getShapeType() {
		// TODO Auto-generated method stub
		return shapeType;
	}

	@Override
	public void draw(PaintCanvas paintCanvas, int startX, int startY, int width, int height) {
		Graphics2D graphics2d = paintCanvas.getGraphics2D();
		Color primaryColor;
		Color secondaryColor;

		switch (shapePrimaryColor) {
		case BLUE:  
			primaryColor = Color.blue;
			break;
		case CYAN:  
			primaryColor = Color.cyan;
			break;
		case DARK_GRAY:  
			primaryColor = Color.darkGray;
			break;
		case GRAY:  
			primaryColor = Color.gray;
			break;
		case GREEN:  
			primaryColor = Color.green;
			break;
		case LIGHT_GRAY:  
			primaryColor = Color.lightGray;
			break;
		case MAGENTA:  
			primaryColor = Color.magenta;
			break;
		case ORANGE:  
			primaryColor = Color.orange;
			break;
		case PINK:  
			primaryColor = Color.pink;
			break;
		case RED:  
			primaryColor = Color.red;
			break;
		case WHITE:  
			primaryColor = Color.white;
			break;
		case YELLOW:  
			primaryColor = Color.yellow;
			break;
		default:  
			primaryColor = Color.black;
			break;
		}
		
		graphics2d.setColor(primaryColor);

		switch (shapeSecondaryColor) {
		case BLUE:  
			secondaryColor = Color.blue;
			break;
		case CYAN:  
			secondaryColor = Color.cyan;
			break;
		case DARK_GRAY:  
			secondaryColor = Color.darkGray;
			break;
		case GRAY:  
			secondaryColor = Color.gray;
			break;
		case GREEN:  
			secondaryColor = Color.green;
			break;
		case LIGHT_GRAY:  
			secondaryColor = Color.lightGray;
			break;
		case MAGENTA:  
			secondaryColor = Color.magenta;
			break;
		case ORANGE:  
			secondaryColor = Color.orange;
			break;
		case PINK:  
			secondaryColor = Color.pink;
			break;
		case RED:  
			secondaryColor = Color.red;
			break;
		case WHITE:  
			secondaryColor = Color.white;
			break;
		case YELLOW:  
			secondaryColor = Color.yellow;
			break;
		default:  
			secondaryColor = Color.black;
			break;
		}
		
		graphics2d.setColor(secondaryColor);

		switch (shapeShadingType) {
		case OUTLINE:
			graphics2d.setColor(secondaryColor);
			graphics2d.setStroke(new BasicStroke(5));
			graphics2d.drawOval(startX, startY, width, height);
			break;
		case OUTLINE_AND_FILLED_IN:
			graphics2d.setColor(secondaryColor);
			graphics2d.fillOval(startX, startY, width, height);
			graphics2d.setStroke(new BasicStroke(5));
			graphics2d.setColor(primaryColor);
			graphics2d.drawOval(startX, startY, width, height);
			break;
		default:
			graphics2d.fillOval(startX, startY, width, height);
			break;
		}
	}

}
