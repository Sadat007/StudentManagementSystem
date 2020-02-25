package com.company;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {

    ArrayList<Students> student = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void register()
    {
        boolean check = true;
        System.out.print("\n==========REGISTRATION===========  \n Enter the id : ");
        String id = sc.next();

        // Below Checking if the id already exist
        for (int i =0; i<student.size();i++) {
            if (id.equals(student.get(i).id)) {
                check = false;
                System.out.println("The id : " + id + " already exist ! \n");
            }
        }
             // If not exist then add student in the list
             if(check)
             {
                 System.out.print("Enter the Name : ");
                 String name1 = sc.next();
                 student.add(new Students(id,name1));
                 System.out.println("Registration Done ! ");
             }
        }
    //myArraylist.add(new Students(name,id));
    public void viewAll()
    {
        System.out.println(" \n =====View Student Information=====\n 2");
        if(student.size()!=0) {
            for (int i = 0; i < student.size(); i++) {
                System.out.println("Id : " + student.get(i).id + " Name : " + student.get(i).name);
            }
        }
        else
            System.out.println("The Student register is empty !");
    }
    public void upDate()
    {
        // The value will take false if the id already exist
        boolean check = true;
        System.out.println("\n =====UPDATE===== \n Enter the id : ");
        String id_Update = sc.next();
        // Below Checking if the id already exist in the ArrayList
        for(int i =0;i<student.size();i++) {
            if (id_Update.equals(student.get(i).id)) {
                check = false;
                System.out.println("Enter a new name : ");
                String name = sc.next();
                student.set(i, new Students(id_Update, name));
            }
        }
            if(check)
            {
                System.out.println(" The id" + id_Update +" doesn't exist");
            }else System.out.println("Update done! ");
    }
    public void delete()
    {
        boolean check = true;
        System.out.println("\n =====DELETE===== \n Enter the id to delete item : ");
        String id_delete = sc.next();
        // Check availability of the id
        for (int i = 0; i<student.size();i++)
        {
            if(id_delete.equals(student.get(i).id))
            {
                check = false;
                student.remove(i);
            }
        }
        if(check)
        {
            System.out.println(" The id "+id_delete +" does not exist");
        }else
            System.out.println(" Delete done");
    }
    public void search()
    {
        boolean checkAvailable = true;
        System.out.println("\n =====SEARCH===== \n Enter the id to SEARCH item : ");
        String id_search = sc.next();
        for (int i = 0; i<student.size() ; i++)
        {
            if(id_search.equals(student.get(i).id))
            {
                checkAvailable = false;
                System.out.println("Id : " +  student.get(i).id + "Name : " + student.get(i).name);
            }
        }
        if(checkAvailable)
            System.out.println("The id : " + id_search + " doesn't exist ");
        else
            System.out.println(" Search Done! ");
    }
  }

