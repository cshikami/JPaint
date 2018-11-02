package model;

import view.gui.PaintCanvas;

public interface IShape {
	
	void setShapeShadingType();
    void setShapePrimaryColor();
    void setShapeSecondaryColor();

    Point getStartPoint();
    Point getEndPoint();
    
    ShapeColor getShapePrimaryColor();
    ShapeColor getShapeSecondaryColor();
    
    ShapeShadingType getShapeShadingType();
    ShapeType getShapeType();
    
    void draw(PaintCanvas paintCanvas, int startX, int startY, int width, int height);
}
