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
    private static boolean is_start_bubble = false;
    private static boolean is_start_insertion = false;
    private static boolean is_start_merge = false;
    private static boolean is_start_quick = false;
    private static int is_act_panel;
    private static int index_of_spaw_element_bubble = 0;
    private static int index_of_spaw_element_insertion_general = 0;
    private static int index_of_spaw_element_insertion_buf = 0;
    private static int index_of_spaw_element_merge_general = 0;
    private static int index_of_spaw_element_merge_buf = 0;
    private static int index_of_spaw_element_quick_general = 0;
    private static int index_of_spaw_element_quick_buf = 0;
    private static int N = 0;
    private static int index_of_delay = 0;
    private static int index_of_delay_buf = 0;
    public static int array_for_bubble[];
    public static int array_for_merge[];
    public static int array_for_quick[];
    public static int array_for_insertion[];
    public static Rectangle2D rectangle_array_for_bubble[];
    public static Rectangle2D rectangle_array_for_merge[];
    public static Rectangle2D rectangle_array_for_quick[];
    public static Rectangle2D rectangle_array_for_insertion[];


    public static int getIndex_of_spaw_element_merge_buf() {
        return index_of_spaw_element_merge_buf;
    }

    public static int getIndex_of_spaw_element_quick_buf() {
        return index_of_spaw_element_quick_buf;
    }

    public static int getIndex_of_spaw_element_insertion_general() {
        return index_of_spaw_element_insertion_general;
    }

    public static int getIndex_of_spaw_element_insertion_buf() {
        return index_of_spaw_element_insertion_buf;
    }

    public static int getIndex_of_spaw_element_merge_general() {
        return index_of_spaw_element_merge_general;
    }

    public static int getIndex_of_spaw_element_quick_general() {
        return index_of_spaw_element_quick_general;
    }

    public static int getIndex_of_delay() {
        return index_of_delay;
    }

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

    public static int getIndex_of_delay_buf() {
        return index_of_delay_buf;
    }

    public static boolean is_start_bubble() {
        return is_start_bubble;
    }

    public static boolean is_start_insertion() {
        return is_start_insertion;
    }

    public static boolean is_start_merge() {
        return is_start_merge;
    }

    public static boolean is_start_quick() {
        return is_start_quick;
    }



    public static void setIs_act_panel(int is_act_panel) {
        Variable.is_act_panel = is_act_panel;
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

    public static void setIndex_of_delay(int index_of_delay) {
        Variable.index_of_delay = index_of_delay;
    }

    public static void setIndex_of_spaw_element_insertion(int index_of_spaw_element_insertion) {
        Variable.index_of_spaw_element_insertion_general = index_of_spaw_element_insertion;
    }

    public static void setIndex_of_spaw_element_merge_general(int index_of_spaw_element_merge_general) {
        Variable.index_of_spaw_element_merge_general = index_of_spaw_element_merge_general;
    }

    public static void setIndex_of_spaw_element_quick_general(int index_of_spaw_element_quick_general) {
        Variable.index_of_spaw_element_quick_general = index_of_spaw_element_quick_general;
    }

    public static void setIndex_of_spaw_element_insertion_general(int index_of_spaw_element_insertion_general) {
        Variable.index_of_spaw_element_insertion_general = index_of_spaw_element_insertion_general;
    }

    public static void setIndex_of_spaw_element_insertion_buf(int index_of_spaw_element_insertion_buf) {
        Variable.index_of_spaw_element_insertion_buf = index_of_spaw_element_insertion_buf;
    }

    public static void setIndex_of_delay_buf(int index_of_delay_buf) {
        Variable.index_of_delay_buf = index_of_delay_buf;
    }

    public static void setIs_start_bubble(boolean is_start_bubble) {
        Variable.is_start_bubble = is_start_bubble;
    }

    public static void setIs_start_insertion(boolean is_start_insertion) {
        Variable.is_start_insertion = is_start_insertion;
    }

    public static void setIs_start_merge(boolean is_start_merge) {
        Variable.is_start_merge = is_start_merge;
    }

    public static void setIs_start_quick(boolean is_start_quick) {
        Variable.is_start_quick = is_start_quick;
    }

    public static void setIndex_of_spaw_element_quick_buf(int index_of_spaw_element_quick_buf) {
        Variable.index_of_spaw_element_quick_buf = index_of_spaw_element_quick_buf;
    }

    public static void setIndex_of_spaw_element_merge_buf(int index_of_spaw_element_merge_buf) {
        Variable.index_of_spaw_element_merge_buf = index_of_spaw_element_merge_buf;
    }
}
