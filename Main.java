package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();
    public static void main(String[] args) {

        int command = 0;
        boolean exit = false;
        printCommand();

        while (!exit)
        {
            System.out.println("Enter your command / choices: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0: {
                    printCommand();
                    break;
                }
                case 1:
                {
                    myTodoList.print();
                    break;
                }
                case 2:
                {
                    addItem();
                    break;
                }
                case 3:
                {
                    updateItem();
                    break;
                }
                case 4:
                {
                    removeItem();
                    break;
                }
                case 5:
                {
                    searchItem();
                    break;
                }
                case 6:
                {
                    exit = true;
                    break;
                }
                default:
                {
                    System.out.println("Please pick only from given commands");
                }
            }

        }


    }

    public static void  printCommand(){
        System.out.println("1: Press 1 for Printing the to do List. ");
        System.out.println("2: Press 2 for Add the to do List. ");
        System.out.println("3: Press 3 for Modify the to do List. ");
        System.out.println("4: Press 4 for Remove item the to do List. ");
        System.out.println("5: Press 5 for Search an Item in  the to do List. ");
        System.out.println("6 : Press 6 for exit from the app. ");
    }

    public static void addItem()
    {
        System.out.println("Enter the item to be added in todo list:");
        myTodoList.addItem(scanner.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter the item number:");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item which are u willing to add:");
        String myNewItem = scanner.nextLine();
        myTodoList.updateTodo(index-1, myNewItem);
        }
    public static void removeItem()
    {
        System.out.println("Enter the item number to be deleted");
        int index = scanner.nextInt();
        scanner.nextLine();
        myTodoList.removeItem(index-1);

    }

    public static void searchItem()
    {
        System.out.println("Enter a string which are u going to search:");
        String searchItem = scanner.nextLine();
       if (myTodoList.findItem(searchItem) == null)
           System.out.println("Item not found.");
       else
           System.out.println(searchItem + "is found in the list.");
    }



}
