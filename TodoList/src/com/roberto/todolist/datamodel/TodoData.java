package com.roberto.todolist.datamodel;

import javafx.collections.FXCollections;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Roberto Affonso, created on 19/03/18
 **/
public class TodoData
{
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";
    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    public static TodoData getInstance()
    {
        return instance;
    }

    private TodoData()
    {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public List<TodoItem> getTodoItems()
    {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems)
    {
        this.todoItems = todoItems;
    }

    public void loadTodoItems() throws IOException
    {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;
        try
        {
            while((input = br.readLine()) != null)
            {
                String[] itemPieces = input.split("\t");

                String description = itemPieces[0];
                String details = itemPieces[1];
                String deadline = itemPieces[2];

                LocalDate date = LocalDate.parse(deadline, formatter);
                TodoItem todoItem = new TodoItem(description, details, date);
                todoItems.add(todoItem);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if(br != null)
            {
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException
    {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try
        {
            for(TodoItem item : todoItems)
            {
                bw.write(String.format("%s\t%s\t%s",
                        item.getDescription(),
                        item.getDetails(),
                        item.getDeadline()));
                bw.newLine();
            }
        }
        finally
        {
            if(bw != null)
            {
                bw.close();
            }
        }
    }
}
