package com.company.panels;

import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.array_for_bubble;
import static com.company.variables.Variable.rectangle_array_for_bubble;

/**
 * Created by Roman on 30.03.2017.
 */
public class Bubble_sort_panel extends JPanel implements Runnable {

    Thread thread;
    boolean now_sort = false;
    boolean isFinish = false;

    public Bubble_sort_panel() {
        now_sort = false;
        isFinish = false;
        repaint();
    }

    public void bubble_sort() throws InterruptedException {
        now_sort = true;
        isFinish= false;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < Constant.getN(); i++) {

            if(isFinish){
                g2.setColor(Constant.getColorOfFullSortRectangle());
                g2.fill(rectangle_array_for_bubble[i]);
            }else {
                if (i == Variable.getIndex_of_spaw_element_bubble()) {
                    g2.setColor(Constant.getColorOfActyveRectangle());
                    g2.fill(rectangle_array_for_bubble[i]);
                } else {
                    g2.setColor(Constant.getColorOfRectangle());
                    g2.fill(rectangle_array_for_bubble[i]);
                }
            }

        }
    }

    @Override
    public void run() {
        while (now_sort) {
            try {

                for (int i = array_for_bubble.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (array_for_bubble[j] > array_for_bubble[j + 1]) {
                            Variable.setIndex_of_spaw_element_bubble(j);

                            repaint();

                            Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                            int t = array_for_bubble[j];
                            double posX = rectangle_array_for_bubble[j].getX();

                            array_for_bubble[j] = array_for_bubble[j + 1];
                            rectangle_array_for_bubble[j].setFrame(rectangle_array_for_bubble[j+1].getX() , rectangle_array_for_bubble[j].getY(), rectangle_array_for_bubble[j].getWidth() , rectangle_array_for_bubble[j].getHeight());

                            array_for_bubble[j + 1] = t;
                            rectangle_array_for_bubble[j+1].setFrame(posX, rectangle_array_for_bubble[j+1].getY(), rectangle_array_for_bubble[j+1].getWidth(), rectangle_array_for_bubble[j+1].getHeight());

                            Rectangle2D r = rectangle_array_for_bubble[j];
                            rectangle_array_for_bubble[j] = rectangle_array_for_bubble[j + 1];
                            rectangle_array_for_bubble[j + 1] = r;
                        }
                    }
                }



                System.out.println("FINISH BUBBLE SORT !");

                for (int i = 0; i < Constant.getN(); i++){
                    System.out.print(array_for_bubble[i] + " ");
                }
                System.out.println();

                now_sort = false;
                isFinish = true;
                repaint();
                thread.interrupt();

                System.out.println();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
