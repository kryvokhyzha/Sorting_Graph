package com.company.states;

import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman on 31.03.2017.
 */
public class Insertion_sort_panel extends JPanel {

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Constant.getColorOfRectangle());
        for (int i = 0; i < Constant.getN(); i++)
            g2.fill(Variable.rectangle_array_for_insertion[i]);

        System.out.println("Was paint in Insertion_sort_panel");;
    }
}
