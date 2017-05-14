package com.company.panels;

import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.rectangle_array_for_insertion;
import static com.company.variables.Variable.array_for_insertion;

/**
 * Created by Roman on 31.03.2017.
 */
public class Insertion_sort_panel extends JPanel implements Runnable {

    Thread thread;
    boolean now_sort = false;
    boolean isFinish = false;

    public Insertion_sort_panel() {
        now_sort = false;
        isFinish = false;
        repaint();
    }

    public void insertion_sort() throws InterruptedException {
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
                if (i == Variable.getIndex_of_spaw_element_insertion_general() || i == Variable.getIndex_of_spaw_element_insertion_buf()) {
                    g2.setColor(Constant.getColorOfActyveRectangle());

                    g2.fill(rectangle_array_for_insertion[Variable.getIndex_of_spaw_element_insertion_general()]);
                    if(Variable.getIndex_of_spaw_element_insertion_buf() != -1)
                        g2.fill(rectangle_array_for_insertion[Variable.getIndex_of_spaw_element_insertion_buf()]);
                } else {
                        g2.setColor(Constant.getColorOfRectangle());
                        g2.fill(rectangle_array_for_insertion[i]);
                    }
            }

        }
    }

    @Override
    public void run() {
        while (now_sort) {
            try {
                int temp, j;
                Rectangle2D r;

                Variable.setStart_for_insertion(System.currentTimeMillis());

                for (int i = 0; i < array_for_insertion.length - 1; i++){
                    if(array_for_insertion[i] > array_for_insertion[i + 1]){

                        while (!Variable.isShouldQuitInsertion()) {
                            Thread.sleep(50);
                        }

                        temp = array_for_insertion[i + 1];

                        r = new Rectangle2D.Double(rectangle_array_for_insertion[i+1].getX(), rectangle_array_for_insertion[i+1].getY(), rectangle_array_for_insertion[i+1].getWidth(), rectangle_array_for_insertion[i+1].getHeight());

                        array_for_insertion[i + 1] = array_for_insertion[i];

                        double posX = rectangle_array_for_insertion[i+1].getX();
                        rectangle_array_for_insertion[i+1].setFrame(posX, rectangle_array_for_insertion[i].getY(), rectangle_array_for_insertion[i].getWidth(), rectangle_array_for_insertion[i].getHeight());

                        Variable.setIndex_of_spaw_element_insertion(i+1);
                        Variable.setIndex_of_spaw_element_insertion_buf(i);

                        repaint();

                        Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                        j = i;

                        while (j > 0 && temp < array_for_insertion[j - 1]){

                            while (!Variable.isShouldQuitInsertion()) {
                                Thread.sleep(50);
                            }

                            array_for_insertion[j] = array_for_insertion[j - 1];

                            posX = rectangle_array_for_insertion[j].getX();
                            rectangle_array_for_insertion[j].setFrame(posX, rectangle_array_for_insertion[j-1].getY(), rectangle_array_for_insertion[j-1].getWidth(), rectangle_array_for_insertion[j-1].getHeight());

                            Variable.setIndex_of_spaw_element_insertion(j);
                            Variable.setIndex_of_spaw_element_insertion_buf(j-1);


                            repaint();

                            Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);

                            j--;
                        }
                        array_for_insertion[j] = temp;

                        double posX1 = rectangle_array_for_insertion[j].getX();
                        rectangle_array_for_insertion[j].setFrame(posX1, r.getY(), r.getWidth(), r.getHeight());

                        Variable.setIndex_of_spaw_element_insertion(j+1);
                        Variable.setIndex_of_spaw_element_insertion_buf(-1);

                        repaint();

                        Thread.sleep(Constant.getDELAYS()[Variable.getIndex_of_delay()]);
                    }
                }

                Variable.setFinish_for_insertion(System.currentTimeMillis());

                JOptionPane.showMessageDialog(null , "Время выполнения Insertion sort: " + ( Variable.getFinish_for_insertion() - Variable.getStart_for_insertion() ) + " мс");

                System.out.println("FINISH INSERTION SORT !");
                Rectangle2D e = rectangle_array_for_insertion[0];

                for (int i = 0; i < Constant.getN(); i++){
                    System.out.print(array_for_insertion[i] + " ");
                }
                System.out.println();

                now_sort = false;
                isFinish = true;
                repaint();
                thread.interrupt();

                System.out.println();

                Variable.setIs_start_insertion(false);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
