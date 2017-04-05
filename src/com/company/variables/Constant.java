package com.company.variables;

import java.awt.*;

/**
 * Created by Roman on 20.03.2017.
 */
public class Constant {

    private static final int WIDTH_FRAME = 1920;
    private static final int HEIGHT_FRAME = 1280;
    private static final int INITIALIZE_DELAY = 4;
    private static final int[] DELAYS = new int[]{100 , 200, 250, 400, 500, 1000, 2000, 2500};
    private static final int N = 50;
    private static final int WIDTH_BETWEEN_RECTANGLE = 5;
    private static final int WIDTH_OF_RECTANGLE = 10;
    private static final Color COLOR_OF_RECTANGLE = new Color(87, 116, 155);
    private static final Color COLOR_OF_ACTYVE_RECTANGLE = new Color(200, 77, 72);
    private static final Color COLOR_OF_FULL_SORT_RECTANGLE = new Color(25, 118, 16);



    public static int getWidthFrame() {
        return WIDTH_FRAME;
    }

    public static int getHeightFrame() {
        return HEIGHT_FRAME;
    }

    public static int getInitializeDelay() {
        return INITIALIZE_DELAY;
    }

    public static int[] getDELAYS() {
        return DELAYS;
    }

    public static int getN() {
        return N;
    }

    public static int getWidthBetweenRectangle() {
        return WIDTH_BETWEEN_RECTANGLE;
    }

    public static int getWidthOfRectangle() {
        return WIDTH_OF_RECTANGLE;
    }

    public static Color getColorOfRectangle() {
        return COLOR_OF_RECTANGLE;
    }

    public static Color getColorOfActyveRectangle() {
        return COLOR_OF_ACTYVE_RECTANGLE;
    }

    public static Color getColorOfFullSortRectangle() {
        return COLOR_OF_FULL_SORT_RECTANGLE;
    }
}
