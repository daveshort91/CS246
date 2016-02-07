package com.example.dave.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "yo yo yo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendScripture(View view) {
        Intent intent = new Intent(this, displayScripture.class);
        EditText book_input = (EditText) findViewById(R.id.book_input);
        EditText chapter_input = (EditText) findViewById(R.id.chapter_input);
        EditText verse_input = (EditText) findViewById(R.id.verse_input);


        String book = book_input.getText().toString();
        String chapter = chapter_input.getText().toString();
        String verse = verse_input.getText().toString();
        String message = "Your favorite scripture is " + book + " " + chapter + ":" + verse;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
