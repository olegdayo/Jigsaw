package com.example.jigsaw.figures;

import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void getRandomFigure() {
        Figure figure = new Figure(Color.RED);
        assertEquals(figure.getColorOfFigure(), figure.getRandomFigure().getColorOfFigure());
    }

    @Test
    void getColorOfFigure() {
        Figure figure = new Figure(Color.RED);
        assertEquals(Color.RED, figure.getColorOfFigure());
    }

    @Test
    void getPoints() {
        Figure figure = new Figure(Color.RED);
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(1, 1),
        };
        figure.points = points;
        assertArrayEquals(points, figure.getPoints());
    }
}