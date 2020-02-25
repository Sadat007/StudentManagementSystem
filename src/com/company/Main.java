package com.company;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {



    public static void displayMenu()
    {
        System.out.println();
        System.out.println("################### Student Management System (Console Application) ############# ");
        System.out.println();

        System.out.println("               1:- Register     ");
        System.out.println("               2:- View         ");
        System.out.println("               3:- Update       ");
        System.out.println("               4:- Delete       ");
        System.out.println("               5:- Search       ");
        System.out.println("               6:- Create File of Students         ");
          System.out.print("               7:- Choose a number   :       ");
    }


    public static void main(String[] args) {


        String input;
        Scanner sc = new Scanner(System.in);

        Crud crud = new Crud();
        displayMenu();

        do {
            input = "";
            input = sc.next();

            switch (input) {
                case "1":
                    crud.register();
                    displayMenu();
                    break;
                case "2":
                    crud.viewAll();
                    displayMenu();
                    break;
                case "3":
                    crud.upDate();
                    displayMenu();
                    break;
                case "4":
                    crud.delete();
                    displayMenu();
                    break;
                case "5":
                    crud.search();
                    displayMenu();
                    break;
                case "6":
                    System.out.print(" File Operation ");
                    break;
                case "7":
                    System.out.println("Good bye and see you soon ");
                    break;
                default: {
                    System.out.println("Please select a valid number ");
                }
            }
            // condition should be satisfied to keep iterating
        }while (input== "1" | input == "2" | input == "3" | input == "4" | input == "5" | input == "6" | (!input.equals("7")));


    }

}




