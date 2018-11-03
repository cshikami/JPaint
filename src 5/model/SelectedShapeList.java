package model;

import java.util.ArrayList;

import controller.DrawShapeHandler;
import controller.SelectShapeHandler;

public class SelectedShapeList implements IShapeList{
	private final ArrayList<IShape> shapeList = new ArrayList<IShape>();
	private SelectShapeHandler selectShapeHandler;

	public SelectedShapeList(SelectShapeHandler selectShapeHandler) {
		this.selectShapeHandler = selectShapeHandler;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addShape(IShape shape) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeShape(IShape shape) {
		// TODO Auto-generated method stub
		
	}

}
