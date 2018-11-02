package controller;

import model.Point;

public class UndoCommand implements ICommand {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		CommandHistory.undo();
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
