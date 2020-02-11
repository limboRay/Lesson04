package ua.course.controllers;

import ua.course.model.Model;
import ua.course.view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

public class MainController {
    private Model model;
    private View view;
    private ResourceBundle resourceBundle;



    public MainController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public MainController(Model model, View view, ResourceBundle resourceBundle) {
        this.model = model;
        this.view = view;
        this.resourceBundle = resourceBundle;
    }

    public void proccesUser() {
        Scanner scan = new Scanner(System.in);
        view.printMessage(View.WELCOME);
        view.printMessage(View.MENU);
        view.printMessage(View.CREATE_USER);
        view.printMessage(View.SEARCH_USER);

        int inputNumber = scan.nextInt();

        while (inputNumber != 1 || inputNumber != 2){

        switch (inputNumber) {
            case 1:
                createUser();
                break;
            case 2:
                searchUser();
                break;
            default:
                view.printMessage(View.WRONG_INPUT_NUMBER);

        }

        }
    }

    private void createUser() {

    }

    private void searchUser(){

    }
}
