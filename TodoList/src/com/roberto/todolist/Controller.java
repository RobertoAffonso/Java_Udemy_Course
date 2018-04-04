package com.roberto.todolist;

import com.roberto.todolist.datamodel.TodoData;
import com.roberto.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Controller {
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

    @FXML
    private ContextMenu listContextMenu;

    private ToggleButton filterToggleButton;

    private FilteredList<TodoItem> filteredList;

    private SortedList<TodoItem> sortedList;

    public void initialize() {

        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        MenuItem editMenuItem = new MenuItem("Edit");

        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });
        editMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                editItemDialog(item);
            }
        });

        sortedList = new SortedList<>(TodoData.getInstance().getTodoItems(), new Comparator<TodoItem>() {
            @Override
            public int compare(TodoItem o1, TodoItem o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        });

        listContextMenu.getItems().addAll(deleteMenuItem, editMenuItem);
//        todoListView.setItems(TodoData.getInstance().getTodoItems());
        todoListView.setItems(sortedList);
        todoListView.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<TodoItem>() {
                    @Override
                    public void changed(
                            ObservableValue<? extends TodoItem> observable,
                            TodoItem oldValue, TodoItem newValue) {
                        if (newValue != null) {
                            TodoItem item = todoListView.getSelectionModel()
                                    .getSelectedItem();
                            itemDetailsTextArea.setText(item.getDetails());
                            DateTimeFormatter df = DateTimeFormatter
                                    .ofPattern("d/MM/yyyy");
                            dueLabel.setText(df.format(item.getDeadline()));
                        }
                    }
                });

        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {
            @Override
            public ListCell<TodoItem> call(ListView<TodoItem> param) {
                ListCell<TodoItem> cell = new ListCell<>() {
                    @Override
                    protected void updateItem(TodoItem item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(item.getDescription());
                            if (item.getDeadline().equals(LocalDate.now())) {
                                setTextFill(Color.RED);
                            } else if(item.getDeadline().equals(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.ORANGE);
                            }
                        }
                    }
                };

                cell.emptyProperty().addListener((obs, wasEmpty, isEmpty) -> {
                    if(isEmpty == true) {
                        cell.setContextMenu(null);
                    }else {
                        cell.setContextMenu(listContextMenu);
                    }
                });
                return cell;
            }
        });
    }

    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Insert new Todo Item.");
        dialog.setHeaderText("Use this form to add a new item.");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException ex) {
            System.out.println("Error loading dialog");
            ex.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();
            TodoItem newItem = controller.processResult();
            todoListView.getSelectionModel().select(newItem);
        } else {
            System.out.println("Cancel Button pressed");
        }
    }

    public void editItemDialog(TodoItem item) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Edit " + item.getDescription());
        dialog.setHeaderText("Use this form to edit the selected item");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));

        try{
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch (IOException ex) {
            System.out.println("Error loading form");
            ex.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        DialogController controller = fxmlLoader.getController();
        controller.updateItemFields(item);
        Optional<ButtonType> result = dialog.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            TodoItem newItem = controller.processResult();
            todoListView.getSelectionModel().select(newItem);

        } else {
            System.out.println("Cancel Button pressed");
        }
    }

    @FXML
    public void handleKeyPressed(KeyEvent event){
         TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
         if(selectedItem != null){
             if(event.getCode().equals(KeyCode.DELETE)){
                 deleteItem(selectedItem);
             }
         }
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        dueLabel.setText(item.getDeadline().toString());
    }

    public void deleteItem(TodoItem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Item");
        alert.setHeaderText("Delete Item: " + item.getDescription());
        alert.setContentText("Are you sure? Press OK to delete or Press Cancel to back out.");
        Optional<ButtonType> button = alert.showAndWait();
        if(button.isPresent() && button.get() == ButtonType.OK) {
            TodoData.getInstance().deleteTodoItem(item);
        }
    }

    public void handleFilterButton() {
        if(filterToggleButton.isSelected()){

        }
        else{

        }

    }
}
