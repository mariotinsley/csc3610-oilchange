package edu.aurora.oilchange;

import javafx.application.Application;

import edu.aurora.oilchange.ui.AppLauncher;

/**
 * Entry point of the application, used to initialize the database connection
 * and run the javafx app.
 */
public class Main {
    public static void main(String[] args) {
        Application.launch(AppLauncher.class, args);
    }
}
