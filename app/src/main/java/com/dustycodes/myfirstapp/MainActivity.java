package com.dustycodes.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.dustycodes.myfirstapp.R;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.dustycodes..myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Requires:
     * -public
     * -void return
     * -View as only param
     */
    public void sendMessage(View view) {
        // Do something here
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
