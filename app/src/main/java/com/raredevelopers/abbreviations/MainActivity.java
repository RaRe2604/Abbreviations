package com.raredevelopers.abbreviations;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};
    RecyclerView recyclerView;

    private static final String TOAST_TEXT = "Clicked ";

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.search_text);
        recyclerView = findViewById(R.id.recycler_view);
        ImageButton searchButton = findViewById(R.id.search_button);
        searchButton.setEnabled(true);
        searchButton.setOnClickListener(e -> showToast());
        
        addIcons();
    }

    private void showToast() {
        System.out.println(TOAST_TEXT + editText.getText());
        Toast.makeText(getApplicationContext(), TOAST_TEXT, Toast.LENGTH_LONG).show();
    }

    public void addIcons() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        AlphabetAdapter adapter = new AlphabetAdapter(getApplicationContext(), alphabets);
        recyclerView.setAdapter(adapter);
    }
}