package com.example.foodtrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button navigateButton = findViewById(R.id.signupbutton);
        navigateButton.setOnClickListener(v -> {
            System.out.print("method is called");
            Intent intent = new Intent(MainActivity.this, Loginpage.class);
            startActivity(intent);
        });

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
////            Button navigateButton = findViewById(R.id.navigateButton);
////            navigateButton.setOnClickListener(v -> {
////                Intent intent = new Intent(Homepage1.this, NextActivity.class);
////                startActivity(intent);
////            });
//            return insets;
//        });
    }
}