package com.company.forms;

import com.company.sortes.Random_sort;
import com.company.sortes.bubble.BubbleSort;
import com.company.states.*;
import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.*;


/**
 * Created by Roman on 27.03.2017.
 */
public class General_Form extends JFrame {

    private JTabbedPane tabbedPane1;
    private JButton buttonStart;
    private JButton buttonRandomize;
    private JButton buttonRestart;
    private JButton buttonStop;
    private JPanel panel;
    private JButton buttonDelayDown;
    private JButton buttonNext;
    private JButton buttonAuto;
    private JButton buttonDelayUp;
    private JLabel labelDelay;
    private JTextField input;


    public General_Form() {
        setTitle("Сортировки");
        setSize(Constant.getWidthFrame() , Constant.getHeightFrame());
        setVisible(Variable.isFrame_visible());
        setFocusable(Variable.isFrame_focus());
//        setResizable(Variable.isFrame_resizable());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setContentPane(panel);

        JPanel bubble_sort_panel = new Bubble_sort_panel();
        tabbedPane1.addTab("Bubble sort" , bubble_sort_panel);
        JPanel insertion_sort_panel = new Insertion_sort_panel();
        tabbedPane1.addTab("Insertion sort", insertion_sort_panel);
        JPanel merge_sort_panel = new Merge_sort_panel();
        tabbedPane1.addTab("Merge sort", merge_sort_panel);
        JPanel quick_sort_panel = new Quick_sort_panel();
        tabbedPane1.addTab("Quick sort", quick_sort_panel);


        init_menu();
        init_listener();
        init_var();

        input.setEnabled(false);
    }

    private void init_listener(){
        tabbedPane1.addMouseListener(new MyMouse() );

        buttonStart.addActionListener(new MyButton() );
        buttonAuto.addActionListener(new MyButton() );
        buttonDelayDown.addActionListener(new MyButton() );
        buttonDelayUp.addActionListener(new MyButton() );
        buttonNext.addActionListener(new MyButton() );
        buttonRandomize.addActionListener(new MyButton() );
        buttonRestart.addActionListener(new MyButton() );
        buttonStop.addActionListener(new MyButton() );

        input.addActionListener(new MyKey() );
    }

    private void init_var(){
        Variable.setIs_act_panel(0);

        array_for_bubble = new int[Constant.getN()];
        fillchar(array_for_bubble);
        Random_sort.start_randomize_for_bubble();

        array_for_insertion = new int[Constant.getN()];
        fillchar(array_for_insertion);
        Random_sort.start_randomize_for_insertion();

        array_for_merge = new int[Constant.getN()];
        fillchar(array_for_merge);
        Random_sort.start_randomize_for_merge();

        array_for_quick = new int[Constant.getN()];
        fillchar(array_for_quick);
        Random_sort.start_randomize_for_quick();

        rectangle_array_for_bubble = new Rectangle2D[Constant.getN()];
        rectangle_array_for_insertion = new Rectangle2D[Constant.getN()];
        rectangle_array_for_merge = new Rectangle2D[Constant.getN()];
        rectangle_array_for_quick = new Rectangle2D[Constant.getN()];
        for(int i = 0; i < Constant.getN(); i++){
            rectangle_array_for_bubble[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle() ) * i , 500 - 4 * array_for_bubble[i] , Constant.getWidthOfRectangle(), 4 * array_for_bubble[i] );
            rectangle_array_for_insertion[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle() ) * i , 500 - 4 * array_for_insertion[i] , Constant.getWidthOfRectangle(), 4 * array_for_insertion[i] );
            rectangle_array_for_merge[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle() ) * i , 500 - 4 * array_for_merge[i] , Constant.getWidthOfRectangle(), 4 * array_for_merge[i] );
            rectangle_array_for_quick[i] = new Rectangle2D.Double(100 + (Constant.getWidthBetweenRectangle() + Constant.getWidthOfRectangle() ) * i , 500 - 4 * array_for_quick[i] , Constant.getWidthOfRectangle(), 4 * array_for_quick[i] );
        }
    }

    private void init_menu(){
        NewMenu newMenu = new NewMenu();
        setMenuBar(newMenu);
    }

    public void fillchar(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = 0;
        }
    }


    public JButton getButtonStart() {
        return buttonStart;
    }

    public JButton getButtonRandomize() {
        return buttonRandomize;
    }

    public JButton getButtonRestart() {
        return buttonRestart;
    }

    public JButton getButtonStop() {
        return buttonStop;
    }

    public JButton getButtonDelayDown() {
        return buttonDelayDown;
    }

    public JButton getButtonNext() {
        return buttonNext;
    }

    public JButton getButtonAuto() {
        return buttonAuto;
    }

    public JButton getButtonDelayUp() {
        return buttonDelayUp;
    }

    public JLabel getLabelDelay() {
        return labelDelay;
    }



    private class MyMouse extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){

            super.mouseClicked(e);

            if(tabbedPane1.getSelectedIndex() == 0){
                Variable.setIs_act_panel(0);
                System.out.println("Bubble");
            }

            if(tabbedPane1.getSelectedIndex() == 1){
                Variable.setIs_act_panel(1);
                System.out.println("Insertion");
            }

            if(tabbedPane1.getSelectedIndex() == 2){
                Variable.setIs_act_panel(2);
                System.out.println("Merge");
            }

            if(tabbedPane1.getSelectedIndex() == 3){
                Variable.setIs_act_panel(3);
                System.out.println("Quick");
            }
        }
    }
    private class MyButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            String stLabel;


            if(source == buttonStart){
                System.out.println("Press buttonStart!");

                if(Variable.getIs_act_panel() == 0){
                    System.out.println('\t' + "Start Bubble sort...");

//                    BubbleSort bubbleSort = new BubbleSort();
//                    bubbleSort.bubble_sort();
                    Bubble_sort_panel bubble_sort_panel = new Bubble_sort_panel();
                    try {
                        bubble_sort_panel.bubble_sort();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                if(Variable.getIs_act_panel() == 1){
                    // Start Insertion sort
                }
                if(Variable.getIs_act_panel() == 2){
                    // Start Merge sort
                }
                if(Variable.getIs_act_panel() == 3){
                    // Start Quick sort
                }

            }

            if(source == buttonAuto){
                System.out.println("Press buttonAuto");
            }


            if(source == buttonDelayDown){
                System.out.println("Press buttonDelayDown");
            }


            if(source == buttonDelayUp){
                System.out.println("Press buttonDelayUp");
            }


            if(source == buttonNext){
                System.out.println("Press buttonNext");
            }


            if(source == buttonRandomize){
                System.out.println("Press buttonRandomize");

                if(Variable.getIs_act_panel() == 0)
                    Random_sort.start_randomize_for_bubble();

                if(Variable.getIs_act_panel() == 1)
                    Random_sort.start_randomize_for_insertion();

                if(Variable.getIs_act_panel() == 2)
                    Random_sort.start_randomize_for_merge();

                if(Variable.getIs_act_panel() == 3)
                    Random_sort.start_randomize_for_quick();
            }


            if(source == buttonRestart){
                System.out.println("Press buttonRestart");
            }


            if(source == buttonStop){
                System.out.println("Press buttonStop");
            }

        }
    }
    private class MyKey implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if(source == input) {
            }

        }
    }
}
