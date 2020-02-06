package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Message", s);
        startActivity(intent);
    }

    public void clickFunction(android.view.View view){
       // Log.i("Info", "button pressed");
        EditText myText = (EditText) findViewById(R.id.editText);
        //Toast.makeText(MainActivity.this, myText.getText().toString(), Toast.LENGTH_LONG).show();
        String str = myText.getText().toString();

        goToActivity2(str);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
