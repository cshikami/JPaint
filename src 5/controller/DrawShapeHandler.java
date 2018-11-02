package controller;

import java.util.ArrayList;
import java.util.List;

import model.IShape;
import model.Point;
import model.interfaces.IDrawShapeHandler;
import view.gui.PaintCanvas;

public class DrawShapeHandler implements IDrawShapeHandler{
	PaintCanvas paintCanvas;

	public DrawShapeHandler(PaintCanvas paintCanvas) {
		this.paintCanvas = paintCanvas;
	}

	public void update(ArrayList<IShape> shapeList) {
		for (IShape shape : shapeList) {
			Point startPoint = shape.getStartPoint();
			Point endPoint = shape.getEndPoint();

			int x1 = startPoint.getX();
			int y1 = startPoint.getY();
			int x2 = endPoint.getX();
			int y2 = endPoint.getY();
			int startX = Math.min(x1,x2);
			int startY = Math.min(y1,y2);
			int width = Math.abs(x1-x2);
			int height = Math.abs(y1-y2);

			shape.draw(paintCanvas, startX, startY, width, height);
		}
	}
}
