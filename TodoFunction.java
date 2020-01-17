package com.company;

import java.lang.String;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TodoFunction {
    private ArrayList<String>todoList = new ArrayList<String>();

    //Add to do list item

    public  void addItem(String item)
    {
        todoList.add(item);
    }

    //Remove to do list item

    public void removeItem(int index)
    {
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    // Print the entire list

    public void print() {
        System.out.println("Todo list consists of: " + todoList.size() + "item");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("Item at position " + (i + 1) + " is: " + todoList.get(i));
        }
    }
     // Update list

    public void updateTodo(int index, String List){

            todoList.set(index, List);
           System.out.println("Updation completed at position " + index+1);
    }

    // Search function for user

    public String findItem(String searchItem)
    {
     int index = todoList.indexOf(searchItem);

     if (index == -1) {
         return null;
     }else
         return todoList.get(index);
     }
}
