package com.company.sortes;

import com.company.states.Bubble_sort_panel;
import com.company.states.Insertion_sort_panel;
import com.company.states.Merge_sort_panel;
import com.company.states.Quick_sort_panel;
import com.company.variables.Constant;

import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.*;

/**
 * Created by Roman on 21.03.2017.
 */
public class Random_sort {

    public static void start_randomize_for_bubble(){
        System.out.println('\n' + "Randomize array_for_bubble: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_bubble[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_bubble[i] + " ");
        }
        System.out.println();

        rectangle_array_for_bubble = null;
        rectangle_array_for_bubble = new Rectangle2D[Constant.getN()];

        for(int i = 0; i < Constant.getN(); i++) {
            rectangle_array_for_bubble[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle()) * i, 500 - 4 * array_for_bubble[i], Constant.getWidthOfRectangle(), 4 * array_for_bubble[i]);
        }

        Bubble_sort_panel bubble_sort_panel = new Bubble_sort_panel();
    }

    public static void start_randomize_for_insertion(){
        System.out.println('\n' + "Randomize array_for_insertion: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_insertion[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_insertion[i] + " ");
        }
        System.out.println();

        rectangle_array_for_insertion = null;
        rectangle_array_for_insertion = new Rectangle2D[Constant.getN()];

        for(int i = 0; i < Constant.getN(); i++) {
            rectangle_array_for_insertion[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle()) * i, 500 - 4 * array_for_insertion[i], Constant.getWidthOfRectangle(), 4 * array_for_insertion[i]);
        }

        Insertion_sort_panel insertion_sort_panel = new Insertion_sort_panel();
    }

    public static void start_randomize_for_merge(){
        System.out.println('\n' + "Randomize array_for_merge: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_merge[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_merge[i] + " ");
        }
        System.out.println();

        rectangle_array_for_merge = null;
        rectangle_array_for_merge = new Rectangle2D[Constant.getN()];

        for(int i = 0; i < Constant.getN(); i++) {
            rectangle_array_for_merge[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle()) * i, 500 - 4 * array_for_merge[i], Constant.getWidthOfRectangle(), 4 * array_for_merge[i]);
        }

        Merge_sort_panel merge_sort_panel = new Merge_sort_panel();
    }

    public static void start_randomize_for_quick(){
        System.out.println('\n' + "Randomize array_for_quick: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_quick[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_quick[i] + " ");
        }
        System.out.println();

        rectangle_array_for_quick = null;
        rectangle_array_for_quick = new Rectangle2D[Constant.getN()];

        for(int i = 0; i < Constant.getN(); i++) {
            rectangle_array_for_quick[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle()) * i, 500 - 4 * array_for_quick[i], Constant.getWidthOfRectangle(), 4 * array_for_quick[i]);
        }

        Quick_sort_panel quick_sort_panel = new Quick_sort_panel();
    }
}
