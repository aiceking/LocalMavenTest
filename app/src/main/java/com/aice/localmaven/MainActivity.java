package com.aice.localmaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aice.test.LibraryTestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LibraryTestUtil.test();
    }
}