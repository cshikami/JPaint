package model;

import java.util.ArrayList;

import controller.DrawShapeHandler;
import view.gui.PaintCanvas;

public class ShapeList implements IShapeList{
	
	private final ArrayList<IShape> shapeList = new ArrayList<IShape>();
	private DrawShapeHandler drawShapeHandler;
	
	public ShapeList(DrawShapeHandler drawShapeHandler) {
		this.drawShapeHandler = drawShapeHandler;
	}
	
	@Override
    public void addShape(IShape shape) {
        shapeList.add(shape);
        drawShapeHandler.update(shapeList);
    }

	@Override
    public void removeShape(IShape shape) {
        shapeList.remove(shape);
        drawShapeHandler.update(shapeList);
    }
}
