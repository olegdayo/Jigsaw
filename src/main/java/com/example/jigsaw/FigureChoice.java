package com.example.jigsaw;

import com.example.jigsaw.figures.Figure;
import com.example.jigsaw.figures.Point;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * The Figure choice is a figure located on left side and can be moved by a user.
 */
public class FigureChoice extends Pane {
    /**
     * The Shape of figure.
     */
    Cell[][] shape;
    /**
     * The Figure.
     */
    Figure figure;
    /**
     * The x-position.
     */
    int x;
    /**
     * The y-position.
     */
    int y;
    /**
     * The rectangles.
     */
    ArrayList<Rectangle> rects;
    /**
     * The constant SHAPE_SIDE which shows shape's size.
     */
    public static final int SHAPE_SIDE = 3;

    /**
     * Instantiates a new Figure choice.
     * @param x      the x-position.
     * @param y      the y-position.
     * @param figure the figure itself.
     */
    FigureChoice(int x, int y, Figure figure) {
        super();
        this.x = x;
        this.y = y;
        setLayoutX(this.x);
        setLayoutY(this.y);
        rects = new ArrayList<Rectangle>();
        shape = new Cell[SHAPE_SIDE][SHAPE_SIDE];
        this.figure = figure;
        initializeShape();
    }

    /**
     * Updates shape: recreates its figure.
     */
    void updateShape() {
        for (Point point : figure.getPoints()) {
            Rectangle rect = new Rectangle(Cell.SIDE, Cell.SIDE);
            rect.setX(shape[point.getX()][point.getY()].getX());
            rect.setY(shape[point.getX()][point.getY()].getY());
            rect.setFill(figure.getColorOfFigure());
            rect.setStroke(Color.BLACK);
            rects.add(rect);
            getChildren().add(rect);
        }
    }

    /**
     * Updates figure: creates a new random one.
     */
    public void updateFigure() {
        figure = figure.getRandomFigure();
        rects.clear();
        getChildren().clear();
        updateShape();
    }

    /**
     * Initializes shape.
     */
    void initializeShape() {
        for (int i = 0; i < SHAPE_SIDE; ++i) {
            for (int j = 0; j < SHAPE_SIDE; ++j) {
                shape[i][j] = new Cell(Cell.SIDE * i + (2 * i + 2), Cell.SIDE * j + (2 * j + 2));
            }
        }
        updateShape();
    }

    /**
     * Gives rectangles.
     * @return the list of rectangles.
     */
    public ArrayList<Rectangle> getRects() {
        return rects;
    }
}
