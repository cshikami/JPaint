package controller;

import java.util.ArrayList;

import model.IShape;
import model.Point;
import view.gui.PaintCanvas;

public class SelectShapeHandler implements ISelectShapeHandler{

	public SelectShapeHandler(PaintCanvas paintCanvas) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(ArrayList<IShape> selectedShapeList) {
		// TODO Auto-generated method stub
		for (IShape shape : selectedShapeList) {
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
		}
	}
}