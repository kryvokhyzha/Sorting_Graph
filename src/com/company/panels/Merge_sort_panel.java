package com.company.panels;

import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.array_for_merge;
import static com.company.variables.Variable.rectangle_array_for_merge;

/**
 * Created by Roman on 31.03.2017.
 */
public class Merge_sort_panel extends JPanel implements Runnable {

    Thread thread;
    boolean now_sort = false;
    boolean isFinish = false;
    private int[] tempMergArr;
    private int length;
    private Rectangle2D temp_rectangle_array_for_merge[];

    public Merge_sort_panel() {
        now_sort = false;
        isFinish = false;
        repaint();
    }

    public void merge_sort() throws InterruptedException {
        now_sort = true;
        isFinish= false;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < Constant.getN(); i++) {               // активные прямоугольники выделить другим цветом
            if(true){
                if (i == Variable.getIndex_of_spaw_element_merge_general() || i == Variable.getIndex_of_spaw_element_merge_buf() && i != 0) {
                    g2.setColor(Constant.getColorOfActyveRectangle());

                    g2.fill(rectangle_array_for_merge[i]);
                } else {
                    g2.setColor(Constant.getColorOfRectangle());
                    g2.fill(rectangle_array_for_merge[i]);
                }
            }

        }
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);

            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        try {
            Thread.sleep(0);

            for (int i = lowerIndex; i <= higherIndex; i++) {
                tempMergArr[i] = array_for_merge[i];
                temp_rectangle_array_for_merge[i] = new Rectangle2D.Double(rectangle_array_for_merge[i].getX(), rectangle_array_for_merge[i].getY(), rectangle_array_for_merge[i].getWidth(), rectangle_array_for_merge[i].getHeight());
            }
            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            double posX;
            while (i <= middle && j <= higherIndex) {
                if (tempMergArr[i] <= tempMergArr[j]) {
                    array_for_merge[k] = tempMergArr[i];

                    posX = rectangle_array_for_merge[k].getX();
                    rectangle_array_for_merge[k].setFrame(posX, temp_rectangle_array_for_merge[i].getY(), temp_rectangle_array_for_merge[i].getWidth(), temp_rectangle_array_for_merge[i].getHeight());

                    Variable.setIndex_of_spaw_element_merge_general(k);
                    Variable.setIndex_of_spaw_element_merge_general(i);

                    repaint();

                    Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                    i++;
                } else {
                    array_for_merge[k] = tempMergArr[j];

                    posX = rectangle_array_for_merge[k].getX();
                    rectangle_array_for_merge[k].setFrame(posX, temp_rectangle_array_for_merge[j].getY(), temp_rectangle_array_for_merge[j].getWidth(), temp_rectangle_array_for_merge[j].getHeight());

                    Variable.setIndex_of_spaw_element_merge_general(k);
                    Variable.setIndex_of_spaw_element_merge_general(j);

                    repaint();

                    Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                    j++;
                }
                k++;
            }
            while (i <= middle) {
                array_for_merge[k] = tempMergArr[i];

                posX = rectangle_array_for_merge[k].getX();
                rectangle_array_for_merge[k].setFrame(posX, temp_rectangle_array_for_merge[i].getY(), temp_rectangle_array_for_merge[i].getWidth(), temp_rectangle_array_for_merge[i].getHeight());

                Variable.setIndex_of_spaw_element_merge_general(k);
                Variable.setIndex_of_spaw_element_merge_general(i);

                repaint();

                Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                k++;
                i++;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {
        while (now_sort) {
            this.length = array_for_merge.length;
            this.tempMergArr = new int[length];
            temp_rectangle_array_for_merge = new Rectangle2D[Constant.getN()];
            doMergeSort(0, length - 1);

            System.out.println("FINISH MERGE SORT !");

            for (int i = 0; i < Constant.getN(); i++){
                System.out.print(array_for_merge[i] + " ");
            }
            System.out.println();

            now_sort = false;
            isFinish = true;
            repaint();
            thread.interrupt();

            System.out.println();
        }

    }
}
