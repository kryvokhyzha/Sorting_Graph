package com.company.sortes;

import com.company.variables.Constant;

import static com.company.variables.Variable.array_for_bubble;
import static com.company.variables.Variable.array_for_insertion;
import static com.company.variables.Variable.array_for_merge;
import static com.company.variables.Variable.array_for_quick;

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
    }

    public static void start_randomize_for_insertion(){
        System.out.println('\n' + "Randomize array_for_insertion: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_insertion[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_insertion[i] + " ");
        }
        System.out.println();
    }

    public static void start_randomize_for_merge(){
        System.out.println('\n' + "Randomize array_for_merge: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_merge[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_merge[i] + " ");
        }
        System.out.println();
    }

    public static void start_randomize_for_quick(){
        System.out.println('\n' + "Randomize array_for_quick: ");
        System.out.print('\t');
        for (int i = 0; i < Constant.getN(); i++){
            array_for_quick[i] = (int)(2 * (Constant.getN() - 1) * Math.random());
            System.out.print(array_for_quick[i] + " ");
        }
        System.out.println();
    }
}
