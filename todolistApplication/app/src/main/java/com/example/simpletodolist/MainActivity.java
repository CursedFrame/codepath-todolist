package com.example.simpletodolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> items;

    Button buttonAdd;
    EditText editTextItem;
    RecyclerView recyclerViewItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        editTextItem = findViewById(R.id.editTextItem);
        recyclerViewItems = findViewById(R.id.recyclerViewItems);

        items = new ArrayList<>();
        items.add("Buy apples");
        items.add("Buy broccoli");
        items.add("Change the oil");

        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        recyclerViewItems.setAdapter(itemsAdapter);
        recyclerViewItems.setLayoutManager(new LinearLayoutManager(this));
    }
}