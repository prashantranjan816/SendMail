package com.example.sendmail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Email(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "Please fill the details & send Me...", Toast.LENGTH_LONG).show();

    }
}
