package ua.course.view;

public class View {

    public static final String WELCOME = "Welcome";
    public static final String MENU = "Please select an item from the menu";
    public static final String CREATE_USER = "1. Create user";
    public static final String SEARCH_USER = "2. Search user";
    public static final String WRONG_INPUT_NUMBER = "Wrong input data! Repeat please!";



    public void printMessage(String message){
        System.out.println(message);
    }
}
