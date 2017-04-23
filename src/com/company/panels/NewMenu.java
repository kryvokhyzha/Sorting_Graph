package com.company.panels;

import java.awt.*;

/**
 * Created by Roman on 26.03.2017.
 */
public class NewMenu extends MenuBar {

    public NewMenu() throws HeadlessException {

        Menu file = new Menu("File");
        file.add(new MenuItem("New..."));
        file.add(new MenuItem("Open..."));

        Menu about =  new Menu("About");
        about.add(new MenuItem("About..."));

        add(file);
        add(about);
    }
}
