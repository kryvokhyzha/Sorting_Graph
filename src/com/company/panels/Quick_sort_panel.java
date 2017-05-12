package com.company.panels;

import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.array_for_quick;
import static com.company.variables.Variable.rectangle_array_for_quick;

/**
 * Created by Roman on 31.03.2017.
 */
public class Quick_sort_panel extends JPanel implements Runnable {

    Thread thread;
    boolean now_sort = false;
    boolean isFinish = false;

    public Quick_sort_panel() {
        now_sort = false;
        isFinish = false;
        repaint();
    }

    public void quick_sort() throws InterruptedException {
        now_sort = true;
        isFinish= false;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < Constant.getN(); i++) {

            if(true){
                if (i == Variable.getIndex_of_spaw_element_quick_buf() || i == Variable.getIndex_of_spaw_element_quick_general()) {
                    g2.setColor(Constant.getColorOfActyveRectangle());

                    g2.fill(rectangle_array_for_quick[i]);
                } else {
                    g2.setColor(Constant.getColorOfRectangle());
                    g2.fill(rectangle_array_for_quick[i]);
                }
            }
        }
    }

    private void doSort(int start, int end) {
        try {
        if (start >= end)
            return;

            int i = start, j = end;
            int cur = i - (i - j) / 2;
            while (i < j) {
                while (i < cur && (array_for_quick[i] <= array_for_quick[cur])) {
                    i++;
                }
                while (j > cur && (array_for_quick[cur] <= array_for_quick[j])) {
                    j--;
                }
                if (i < j) {

                    Variable.setIndex_of_spaw_element_quick_general(i);
                    Variable.setIndex_of_spaw_element_quick_buf(j);

                    repaint();

                    Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                    int temp = array_for_quick[i];
                    double posX = rectangle_array_for_quick[i].getX();

                    array_for_quick[i] = array_for_quick[j];
                    rectangle_array_for_quick[i].setFrame(rectangle_array_for_quick[j].getX() , rectangle_array_for_quick[i].getY(), rectangle_array_for_quick[i].getWidth() , rectangle_array_for_quick[i].getHeight());

                    array_for_quick[j] = temp;
                    rectangle_array_for_quick[j].setFrame(posX, rectangle_array_for_quick[j].getY(), rectangle_array_for_quick[j].getWidth(), rectangle_array_for_quick[j].getHeight());

                    Rectangle2D r = rectangle_array_for_quick[i];
                    rectangle_array_for_quick[i] = rectangle_array_for_quick[j];
                    rectangle_array_for_quick[j] = r;

                    if (i == cur)
                        cur = j;
                    else if (j == cur)
                        cur = i;
                }
            }
            doSort(start, cur);
            doSort(cur+1, end);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (start >= end)
            return;

    }

    @Override
    public void run() {
        while (now_sort) {
                int startIndex = 0;
                int endIndex = array_for_quick.length - 1;

                doSort(startIndex, endIndex);

                System.out.println("FINISH QUICK SORT !");

                for (int i = 0; i < Constant.getN(); i++){
                    System.out.print(array_for_quick[i] + " ");
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
