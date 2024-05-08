package com.itfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // The code below initializes an object to read input from the keyboard.
        Scanner scanner = new Scanner(System.in);

// Display a message asking for text input from the keyboard.
// The text should be entered followed by pressing the Enter key.
        System.out.print("Enter your name: ");

// The line of code that will actually read the text from the keyboard.
// Define a variable of type String to store the entered text.
        String personName = scanner.nextLine();

// Display the name entered by the user.
        System.out.println("The entered name is: " + personName);


    }

}
