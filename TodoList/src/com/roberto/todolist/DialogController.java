package com.roberto.todolist;

import com.roberto.todolist.datamodel.TodoData;
import com.roberto.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * @author Roberto Affonso, created on 21/03/18
 **/

public class DialogController {
    @FXML private TextField descTextField;

    @FXML private TextArea detailTextArea;

    @FXML private DatePicker deadlineDatePicker;

    public TodoItem processResult() {
        String description = descTextField.getText().trim();
        String details = detailTextArea.getText().trim();
        LocalDate date = deadlineDatePicker.getValue();
        TodoItem newItem = new TodoItem(description, details, date);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }

    public void updateItemFields(TodoItem item) {
        descTextField.setText(item.getDescription());
        detailTextArea.setText(item.getDetails());
        deadlineDatePicker.setValue(item.getDeadline());
    }
}
