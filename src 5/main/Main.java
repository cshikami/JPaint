package main;

import controller.CreateShapeCommand;
import controller.DrawShapeHandler;
import controller.IJPaintController;
import controller.JPaintController;
import controller.RedoCommand;
import controller.SelectShapeCommand;
import controller.SelectShapeHandler;
import controller.UndoCommand;
import model.Point;
import model.SelectedShapeList;
import model.ShapeList;
import model.persistence.ApplicationState;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.gui.MyMouseListener;
import view.interfaces.IGuiWindow;
import view.interfaces.IUiModule;

public class Main {
    public static void main(String[] args){
        PaintCanvas paintCanvas = new PaintCanvas();
        IGuiWindow guiWindow = new GuiWindow(paintCanvas);
        IUiModule uiModule = new Gui(guiWindow);
        ApplicationState appState = new ApplicationState(uiModule);
        IJPaintController controller = new JPaintController(uiModule, appState);
        controller.setup();

        DrawShapeHandler drawShapeHandler = new DrawShapeHandler(paintCanvas);
        SelectShapeHandler selectShapeHandler = new SelectShapeHandler(paintCanvas);
        ShapeList shapeList = new ShapeList(drawShapeHandler);
        SelectedShapeList selectedShapeList = new SelectedShapeList(selectShapeHandler);
		CreateShapeCommand createShapeCommand = new CreateShapeCommand(appState, shapeList);
		SelectShapeCommand selectShapeCommand = new SelectShapeCommand(appState, shapeList, selectedShapeList);
        UndoCommand undoCommand = new UndoCommand();
        RedoCommand redoCommand = new RedoCommand();
        MyMouseListener mouseListener = new MyMouseListener(appState, createShapeCommand, selectShapeCommand);
        paintCanvas.addMouseListener(mouseListener);
        
        
        //hello!!!
        // For example purposes only; remove from your final project.
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Graphics2D graphics2d = paintCanvas.getGraphics2D();
//        graphics2d.setColor(Color.GREEN);
//        graphics2d.fillRect(12, 13, 200, 400);
//        graphics2d.setStroke(new BasicStroke(5));
//        graphics2d.setColor(Color.BLUE);
//        graphics2d.drawRect(12, 13, 200, 400);
    }
}
