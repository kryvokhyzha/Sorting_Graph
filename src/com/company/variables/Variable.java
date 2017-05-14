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
    private static boolean shouldQuitBubble = true;
    private static boolean shouldQuitInsertion = true;
    private static boolean shouldQuitMerge = true;
    private static boolean shouldQuitQuick = true;
    private static int is_act_panel;
    private static int index_of_spaw_element_bubble = 0;
    private static int index_of_spaw_element_insertion_general = 0;
    private static int index_of_spaw_element_insertion_buf = 0;
    private static int index_of_spaw_element_merge_general = 0;
    private static int index_of_spaw_element_merge_buf = 0;
    private static int index_of_spaw_element_quick_general = 0;
    private static int index_of_spaw_element_quick_buf = 0;
    private static int N = 50;
    private static int K = 1000 / N;
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
    private static long start_for_bubble;
    private static long finish_for_bubble;
    private static long start_for_insertion;
    private static long finish_for_insertion;
    private static long start_for_merge;
    private static long finish_for_merge;
    private static long start_for_quick;
    private static long finish_for_quick;


    public static int getK() {
        return K;
    }

    public static boolean isShouldQuitBubble() {
        return shouldQuitBubble;
    }

    public static boolean isShouldQuitInsertion() {
        return shouldQuitInsertion;
    }

    public static boolean isShouldQuitQuick() {
        return shouldQuitQuick;
    }

    public static boolean isShouldQuitMerge() {
        return shouldQuitMerge;
    }

    public static long getStart_for_bubble() {
        return start_for_bubble;
    }

    public static long getFinish_for_bubble() {
        return finish_for_bubble;
    }

    public static long getStart_for_insertion() {
        return start_for_insertion;
    }

    public static long getFinish_for_insertion() {
        return finish_for_insertion;
    }

    public static long getStart_for_merge() {
        return start_for_merge;
    }

    public static long getFinish_for_merge() {
        return finish_for_merge;
    }

    public static long getStart_for_quick() {
        return start_for_quick;
    }

    public static long getFinish_for_quick() {
        return finish_for_quick;
    }

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

    public static void setStart_for_bubble(long start_for_bubble) {
        Variable.start_for_bubble = start_for_bubble;
    }

    public static void setFinish_for_bubble(long finish_for_bubble) {
        Variable.finish_for_bubble = finish_for_bubble;
    }

    public static void setStart_for_insertion(long start_for_insertion) {
        Variable.start_for_insertion = start_for_insertion;
    }

    public static void setFinish_for_insertion(long finish_for_insertion) {
        Variable.finish_for_insertion = finish_for_insertion;
    }

    public static void setStart_for_merge(long start_for_merge) {
        Variable.start_for_merge = start_for_merge;
    }

    public static void setFinish_for_merge(long finish_for_merge) {
        Variable.finish_for_merge = finish_for_merge;
    }

    public static void setStart_for_quick(long start_for_quick) {
        Variable.start_for_quick = start_for_quick;
    }

    public static void setFinish_for_quick(long finish_for_quick) {
        Variable.finish_for_quick = finish_for_quick;
    }

    public static void setShouldQuitMerge(boolean shouldQuitMerge) {
        Variable.shouldQuitMerge = shouldQuitMerge;
    }

    public static void setShouldQuitBubble(boolean shouldQuitBubble) {
        Variable.shouldQuitBubble = shouldQuitBubble;
    }

    public static void setShouldQuitInsertion(boolean shouldQuitInsertion) {
        Variable.shouldQuitInsertion = shouldQuitInsertion;
    }

    public static void setShouldQuitQuick(boolean shouldQuitQuick) {
        Variable.shouldQuitQuick = shouldQuitQuick;
    }

    public static void setK(int k) {
        K = k;
    }
}
