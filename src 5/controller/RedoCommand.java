package controller;

import model.Point;

public class RedoCommand implements ICommand{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		CommandHistory.redo();
	}

	@Override
	public void createShape(Point startPoint, Point endPoint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectShape(Point startPoint, Point endPoint) {
		// TODO Auto-generated method stub
		
	}
}
