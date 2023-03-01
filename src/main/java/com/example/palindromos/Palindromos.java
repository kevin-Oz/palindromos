package com.example.palindromos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Palindromos extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String cadena ="main";
        boolean esPalindromo = true;
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

        int longitud = cadena.length();
        for(int i = 0; i < longitud / 2; i++) {
            if(cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                esPalindromo = false;
                break;
            }
        }

        if(esPalindromo)
            System.out.println("La palabra "+cadena + " Es un palíndromo");
        else
            System.out.println("La palabra "+ cadena + " No es un palíndromo");
    }

    public static void main(String[] args) {
        launch();
    }
}