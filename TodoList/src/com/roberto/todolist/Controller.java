package com.roberto.todolist;

import com.roberto.todolist.datamodel.TodoData;
import com.roberto.todolist.datamodel.TodoItem;
import javafx.application.Platform;
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
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
=======
import java.util.Comparator;
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
import java.util.Optional;
import java.util.function.Predicate;

public class Controller {

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    @FXML
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
    private ToggleButton filterToggleButton;

    private FilteredList<TodoItem> filteredList;

<<<<<<< HEAD
    private SortedList<TodoItem> sortedList;
=======
<<<<<<< HEAD
    private SortedList<TodoItem> sortedList;
=======
    private Predicate<TodoItem> wantAllItems;

    private Predicate<TodoItem> wantTodaysItems;
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de

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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
        sortedList = new SortedList<>(TodoData.getInstance().getTodoItems(), new Comparator<TodoItem>() {
            @Override
            public int compare(TodoItem o1, TodoItem o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        });

        listContextMenu.getItems().addAll(deleteMenuItem, editMenuItem);
//        todoListView.setItems(TodoData.getInstance().getTodoItems());
        todoListView.setItems(sortedList);
<<<<<<< HEAD
=======
=======
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        wantAllItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem todoItem) {
                return true;
            }
        };

        wantTodaysItems = new Predicate<TodoItem>() {
            @Override
            public boolean test(TodoItem todoItem) {
                return todoItem.getDeadline().equals(LocalDate.now());
            }
        };

        filteredList = new FilteredList<TodoItem>(TodoData.getInstance().getTodoItems(), wantAllItems);

        SortedList<TodoItem> sortedList = new SortedList<TodoItem>(filteredList, new Comparator<TodoItem>() {
                    @Override
                    public int compare(TodoItem o1, TodoItem o2) {
                        return o1.getDeadline().compareTo(o2.getDeadline());
                    }
                });

        todoListView.setItems(sortedList);
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory(new Callback<ListView<TodoItem>, ListCell<TodoItem>>() {

            @Override
            public ListCell<TodoItem> call(ListView<TodoItem> param) {
                ListCell<TodoItem> cell = new ListCell<TodoItem>() {
                    @Override
                    protected void updateItem(TodoItem item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(item.getDescription());
                            if (item.getDeadline().equals(LocalDate.now())) {
                                setTextFill(Color.RED);
                            } else if (item.getDeadline().equals(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.ORANGE);
                            }
                        }
                    }
                };

                cell.emptyProperty().addListener((obs, wasEmpty, isEmpty) -> {
                    if (isEmpty == true) {
                        cell.setContextMenu(null);
                    } else {
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

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException ex) {
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

    @FXML
    public void handleKeyPressed(KeyEvent keyEvent) {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        if (item != null) {
            if (keyEvent.getCode().equals(KeyCode.DELETE)) {
                deleteItem(item);
            }
        }
    }

    @FXML
    public void handleFilterButton() {
        TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();

        if(filterToggleButton.isSelected()) {
            filteredList.setPredicate(wantTodaysItems);
            if(filteredList.isEmpty()){
                itemDetailsTextArea.clear();
                dueLabel.setText("");
            }
            else if(filteredList.contains(selectedItem)){
                todoListView.getSelectionModel().select(selectedItem);
            }
            else{
                todoListView.getSelectionModel().selectFirst();
            }
        }
        else{
            filteredList.setPredicate(wantAllItems);
        }
    }

    public void deleteItem(TodoItem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Item");
        alert.setHeaderText("Delete Item: " + item.getDescription());
        alert.setContentText("Are you sure? Press OK to delete or Press Cancel to back out.");
        Optional<ButtonType> button = alert.showAndWait();
        if (button.isPresent() && button.get() == ButtonType.OK) {
            TodoData.getInstance().deleteTodoItem(item);
        }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
    public void handleFilterButton() {
        if(filterToggleButton.isSelected()){

        }
        else{

        }

<<<<<<< HEAD
=======
=======
    @FXML
    public void handleExit(){
        Platform.exit();
>>>>>>> 212d624da5a8dcee0d62e55ed9fcdb1bb9a80c07
>>>>>>> 7bb27f7994646d1057eb5ee260eb8caff24018de
    }
}
