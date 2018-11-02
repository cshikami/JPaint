package controller;

import model.Point;

public interface ICommand {
	void run();

	void createShape(Point startPoint, Point endPoint);

	void selectShape(Point startPoint, Point endPoint);
	
}
