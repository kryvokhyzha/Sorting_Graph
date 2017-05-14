package com.company.forms;

import com.company.random.Random_sort;
import com.company.panels.*;
import com.company.variables.Constant;
import com.company.variables.Variable;

import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import static com.company.variables.Variable.*;


/**
 * Created by Roman on 27.03.2017.
 */
public class General_Form extends JFrame implements Runnable {

    private JTabbedPane tabbedPane1;
    private JButton buttonStart;
    private JButton buttonRandomize;
    private JPanel panel;
    private JButton buttonDelayDown;
    private JButton buttonDelayUp;
    private JLabel labelDelay;
    private JTextField input;
    private JButton buttonStop;
    private Thread thread;


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

        input.setText("50");
        input.setEnabled(false);
        Variable.setN(100);
        Variable.setK(100/Variable.getN());

       // buttonStop.setEnabled(false);

        thread = new Thread(this);
        thread.start();
    }

    private void init_listener(){
        tabbedPane1.addMouseListener(new MyMouse() );

        buttonStart.addActionListener(new MyButton() );
        buttonStop.addActionListener(new MyButton() );
        buttonDelayDown.addActionListener(new MyButton() );
        buttonDelayUp.addActionListener(new MyButton() );
        buttonRandomize.addActionListener(new MyButton() );
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

        Variable.setIndex_of_delay(0);
        labelDelay.setText("Delay: " + Constant.getDELAYS()[Variable.getIndex_of_delay()]);
        enabled_button_of_delay();
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

    public JButton getButtonDelayDown() {
        return buttonDelayDown;
    }

    public JButton getButtonDelayUp() {
        return buttonDelayUp;
    }

    public JLabel getLabelDelay() {
        return labelDelay;
    }

    @Override
    public void run() {
        while (true){
            repaint();
            try {
                Thread.sleep(25);
                int l = input.getText().length();
                String string1 = input.getText();

                try {
                    for (int i = 0; i < l; i++) {
                        if (!Character.isDigit(string1.charAt(i))) {
                            string1 = string1.substring(0, i) + string1.substring(i + 1);
                        }

                    }
                    if(Integer.parseInt(string1) >= 1000 || Integer.parseInt(string1) <= 0)
                        string1 = string1.substring(0, string1.length() - 1);

                } catch (Exception ex){
                }

                input.setText(string1);
                input.setCaretPosition(input.getText().length());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void enabled_button_of_delay(){
        if(Variable.getIndex_of_delay() == 0)
            buttonDelayDown.setEnabled(false);
        else
            buttonDelayDown.setEnabled(true);

        if(Variable.getIndex_of_delay() == (Constant.getInitializeDelay() - 2) )
            buttonDelayUp.setEnabled(false);
        else
            buttonDelayUp.setEnabled(true);
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

                if(Variable.getIs_act_panel() == 0 && !Variable.is_start_bubble()){
                    System.out.println('\t' + "Start Bubble sort...");

                    if(!Variable.is_start_bubble() && !Variable.is_start_insertion() && !Variable.is_start_merge() && !Variable.is_start_quick()){
                        Variable.setN(Integer.parseInt(input.getText()));
                    }

                    Variable.setIs_start_bubble(true);

                    Bubble_sort_panel bubble_sort_panel = new Bubble_sort_panel();
                    try {
                        bubble_sort_panel.bubble_sort();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                if(Variable.getIs_act_panel() == 1 && !Variable.is_start_insertion()){
                    System.out.println('\t' + "Start Insertion sort...");

                    Variable.setIs_start_insertion(true);

                    Insertion_sort_panel insertion_sort_panel = new Insertion_sort_panel();
                    try {
                        insertion_sort_panel.insertion_sort();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                if(Variable.getIs_act_panel() == 2 && !Variable.is_start_merge()){
                    System.out.println('\t' + "Start Merge sort...");

                    Variable.setIs_start_merge(true);

                    Merge_sort_panel merge_sort_panel = new Merge_sort_panel();
                    try {
                        merge_sort_panel.merge_sort();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                if(Variable.getIs_act_panel() == 3 && !Variable.is_start_quick()){
                    System.out.println('\t' + "Start Quick sort...");

                    Variable.setIs_start_quick(true);

                    Quick_sort_panel quick_sort_panel = new Quick_sort_panel();
                    try {
                        quick_sort_panel.quick_sort();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }

            }

            if(source == buttonStop ){
                System.out.println("Press buttonStop");

                if(Variable.getIs_act_panel() == 0 && Variable.is_start_bubble())
                    Variable.setShouldQuitBubble(!Variable.isShouldQuitBubble());

                if(Variable.getIs_act_panel() == 1 && Variable.is_start_insertion())
                    Variable.setShouldQuitInsertion(!Variable.isShouldQuitInsertion());

                if(Variable.getIs_act_panel() == 2 && Variable.is_start_merge())
                    Variable.setShouldQuitMerge(!Variable.isShouldQuitMerge());

                if(Variable.getIs_act_panel() == 3 && Variable.is_start_quick())
                    Variable.setShouldQuitQuick(!Variable.isShouldQuitQuick());
            }

            if(source == buttonDelayDown){
                System.out.println("Press buttonDelayDown");

                if(Variable.getIndex_of_delay() != 0) {
                    Variable.setIndex_of_delay(Variable.getIndex_of_delay() - 1);

                    labelDelay.setText("Delay: " + Constant.getDELAYS()[Variable.getIndex_of_delay()]);
                }

                enabled_button_of_delay();
            }


            if(source == buttonDelayUp){
                System.out.println("Press buttonDelayUp");

                if(Variable.getIndex_of_delay() != (Constant.getInitializeDelay() - 2) ) {
                    Variable.setIndex_of_delay(Variable.getIndex_of_delay() + 1);

                    labelDelay.setText("Delay: " + Constant.getDELAYS()[Variable.getIndex_of_delay()]);
                }

                enabled_button_of_delay();
            }

            if(source == buttonRandomize){
                System.out.println("Press buttonRandomize");

                if(Variable.getIs_act_panel() == 0 && !Variable.is_start_bubble())
                    Random_sort.start_randomize_for_bubble();

                if(Variable.getIs_act_panel() == 1 && !Variable.is_start_insertion())
                    Random_sort.start_randomize_for_insertion();

                if(Variable.getIs_act_panel() == 2 && !Variable.is_start_merge())
                    Random_sort.start_randomize_for_merge();

                if(Variable.getIs_act_panel() == 3 && !Variable.is_start_quick())
                    Random_sort.start_randomize_for_quick();
            }

        }
    }
}
