package com.example.dao;

import com.example.model.TodoItem;

import java.util.List;

public interface ItemManagement {

    public void addTodoItem(TodoItem item);

    public void updateTodoItem(List<TodoItem> items);

}