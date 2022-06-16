package com.example.jigsaw;

import com.example.jigsaw.figures.Figure;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FigureChoiceTest {

    @Test
    void getRects() {
        FigureChoice figureChoice = new FigureChoice(0, 0, new Figure(Color.RED).getRandomFigure());
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
        rects.add(new Rectangle(0, 0, 1, 1));
        rects.add(new Rectangle(1, 1, 2, 2));
        figureChoice.rects = rects;
        for (int i = 0; i < rects.size(); i++) {
            assertEquals(rects.get(i), figureChoice.getRects().get(i));
        }
    }
}