package view.interfaces;

import java.awt.Color;

import model.ShapeColor;

public interface IDialogChoice<T> {
    String getDialogTitle();

    String getDialogText();

    T[] getDialogOptions();

    T getCurrentSelection();
}
