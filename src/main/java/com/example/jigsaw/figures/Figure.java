package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

import java.util.Random;

/**
 * The type Figure.
 */
public class Figure {

    /**
     * The Points.
     */
    protected Point[] points;
    /**
     * The Color of figure.
     */
    protected Color colorOfFigure;

    /**
     * Instantiates a new Figure.
     *
     * @param color the color
     */
    public Figure(Color color) {
        colorOfFigure = color;
    }

    /**
     * Gets random figure.
     *
     * @return the random figure
     */
    public Figure getRandomFigure() {
        Figure[] allFigures = {
                new CornerLeftDown(colorOfFigure),
                new CornerLeftUp(colorOfFigure),
                new CornerRightDown(colorOfFigure),
                new CornerRightUp(colorOfFigure),
                new Dot(colorOfFigure),
                new GDown(colorOfFigure),
                new GLeft(colorOfFigure),
                new GRight(colorOfFigure),
                new GUp(colorOfFigure),
                new JDown(colorOfFigure),
                new JLeft(colorOfFigure),
                new JRight(colorOfFigure),
                new JUp(colorOfFigure),
                new LilCornerLeftDown(colorOfFigure),
                new LilCornerLeftUp(colorOfFigure),
                new LilCornerRightDown(colorOfFigure),
                new LilCornerRightUp(colorOfFigure),
                new LilTDown(colorOfFigure),
                new LilTLeft(colorOfFigure),
                new LilTRight(colorOfFigure),
                new LilTUp(colorOfFigure),
                new LineHorizontal(colorOfFigure),
                new LineVertical(colorOfFigure),
                new NDown(colorOfFigure),
                new NLeft(colorOfFigure),
                new NRight(colorOfFigure),
                new NUp(colorOfFigure),
                new TDown(colorOfFigure),
                new TLeft(colorOfFigure),
                new TRight(colorOfFigure),
                new TUp(colorOfFigure),
        };
        Random gen = new Random();
        return allFigures[gen.nextInt(allFigures.length) % allFigures.length];
    }

    /**
     * Gets color of figure.
     *
     * @return the color of figure
     */
    public Color getColorOfFigure() {
        return colorOfFigure;
    }

    /**
     * Get points point [ ].
     *
     * @return the point [ ]
     */
    public Point[] getPoints() {
        return points;
    }
}
