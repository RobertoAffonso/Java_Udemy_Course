package com.roberto.todolist;

import com.roberto.todolist.datamodel.TodoData;
import com.roberto.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller
{
    private List<TodoItem> todoItems = new ArrayList<>();
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label dueLabel;
    @FXML
    private MenuItem newReminder;
    @FXML
    private MenuItem exit;
    @FXML
    private BorderPane mainBorderPane;

    public void initialize()
    {

//        populateTodoItems(todoItems);
        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue)
            {
                if(newValue != null)
                {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    dueLabel.setText(df.format(item.getDeadline()));
                }
            }
        });
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

//    private void populateTodoItems(List<TodoItem> todoItems)
//    {
//        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
//                LocalDate.of(2017, Month.APRIL, 25));
//        TodoItem item2 = new TodoItem("Doctor's Appointment", "See Dr. Smith at 123 Street." +
//                "Bring Paperwork",
//                LocalDate.of(2017, Month.MAY, 11 ));
//        TodoItem item3 = new TodoItem("Finish design proposal for client",
//                "I promised Mike i'd email website proposal mockups",
//                LocalDate.of(2017, Month.JULY, 10));
//        TodoItem item4 = new TodoItem("Take my Cat to the vet", "Need to take my house cat for a check up",
//                LocalDate.of(2018, Month.MARCH, 25));
//        TodoItem item5 = new TodoItem("Return book", "Must return an overdue book to the public library",
//                LocalDate.of(2018, Month.MARCH, 15));
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//        TodoData.getInstance().setTodoItems(todoItems);
//    }

    public void showNewItemDialog()
    {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("todoItemDialog.fxml"));
            dialog.getDialogPane().setContent(root);
        }
        catch (IOException ex)
        {
            System.out.println("Error loading dialog");
            ex.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK)
        {
            System.out.println("OK Button pressed");
        }
        else
        {
            System.out.println("Cancel Button pressed");
        }
    }
    @FXML
    public void handleClickListView()
    {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        dueLabel.setText(item.getDeadline().toString());
    }
}
