package com.company.variables;

import java.awt.geom.Rectangle2D;

/**
 * Created by Roman on 20.03.2017.
 */
public class Variable {

    private static boolean frame_focus = true;
    private static boolean frame_visible = true;
    private static boolean frame_resizable = false;
    private static boolean is_spaw_bubble = true;
    private static int is_act_panel;
    private static int index_of_spaw_element_bubble;
    private static int N = 0;
    public static int array_for_bubble[];
    public static int array_for_merge[];
    public static int array_for_quick[];
    public static int array_for_insertion[];
    public static Rectangle2D rectangle_array_for_bubble[];
    public static Rectangle2D rectangle_array_for_merge[];
    public static Rectangle2D rectangle_array_for_quick[];
    public static Rectangle2D rectangle_array_for_insertion[];


    public static int getN() {
        return N;
    }

    public static boolean is_spaw_bubble() {
        return is_spaw_bubble;
    }

    public static int getIndex_of_spaw_element_bubble() {
        return index_of_spaw_element_bubble;
    }

    public static boolean isFrame_focus() {
        return frame_focus;
    }

    public static boolean isFrame_visible() {
        return frame_visible;
    }

    public static boolean isFrame_resizable() {
        return frame_resizable;
    }

    public static int getIs_act_panel() {
        return is_act_panel;
    }

    public static Rectangle2D[] getRectangle_array_for_bubble() {
        return rectangle_array_for_bubble;
    }

    public static int[] getArray_for_bubble() {
        return array_for_bubble;
    }

    public static int[] getArray_for_merge() {
        return array_for_merge;
    }

    public static int[] getArray_for_quick() {
        return array_for_quick;
    }

    public static int[] getArray_for_insertion() {
        return array_for_insertion;
    }

    public static Rectangle2D[] getRectangle_array_for_merge() {
        return rectangle_array_for_merge;
    }

    public static Rectangle2D[] getRectangle_array_for_quick() {
        return rectangle_array_for_quick;
    }

    public static Rectangle2D[] getRectangle_array_for_insertion() {
        return rectangle_array_for_insertion;
    }



    public static void setIs_act_panel(int is_act_panel) {
        Variable.is_act_panel = is_act_panel;
    }

    public static void setRectangle_array_for_bubble(Rectangle2D[] rectangle_array_for_bubble) {
        Variable.rectangle_array_for_bubble = rectangle_array_for_bubble;
    }

    public static void setArray_for_bubble(int[] array_for_bubble) {
        Variable.array_for_bubble = array_for_bubble;
    }

    public static void setArray_for_merge(int[] array_for_merge) {
        Variable.array_for_merge = array_for_merge;
    }

    public static void setArray_for_quick(int[] array_for_quick) {
        Variable.array_for_quick = array_for_quick;
    }

    public static void setArray_for_insertion(int[] array_for_insertion) {
        Variable.array_for_insertion = array_for_insertion;
    }

    public static void setRectangle_array_for_merge(Rectangle2D[] rectangle_array_for_merge) {
        Variable.rectangle_array_for_merge = rectangle_array_for_merge;
    }

    public static void setRectangle_array_for_quick(Rectangle2D[] rectangle_array_for_quick) {
        Variable.rectangle_array_for_quick = rectangle_array_for_quick;
    }

    public static void setRectangle_array_for_insertion(Rectangle2D[] rectangle_array_for_insertion) {
        Variable.rectangle_array_for_insertion = rectangle_array_for_insertion;
    }

    public static void setIndex_of_spaw_element_bubble(int index_of_spaw_element_bubble) {
        Variable.index_of_spaw_element_bubble = index_of_spaw_element_bubble;
    }

    public static void setIs_spaw_bubble(boolean is_spaw_bubble) {
        Variable.is_spaw_bubble = is_spaw_bubble;
    }

    public static void setN(int n) {
        N = n;
    }
}
