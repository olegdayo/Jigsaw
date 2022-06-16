package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Lil corner right down.
 */
public class LilCornerRightDown extends Figure {
    /**
     * Instantiates a new Lil corner right down.
     *
     * @param color the color
     */
    LilCornerRightDown(Color color) {
        super(color);
        points = new Point[3];
        points[0] = new Point(1, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
    }
}
