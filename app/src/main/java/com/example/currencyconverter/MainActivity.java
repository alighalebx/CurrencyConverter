package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view) {
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        double egy = Double.parseDouble(editTextTextPersonName.getText().toString())*18.5;
        String str = Double.toString(egy);
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();

        Log.i("Info", editTextTextPersonName.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}