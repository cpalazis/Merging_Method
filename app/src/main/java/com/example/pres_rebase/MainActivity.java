package com.example.pres_rebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Αυτό είναι το Branch2");
        System.out.println("Αυτό είναι το δεύτερο commit του Branch2");
    }
}