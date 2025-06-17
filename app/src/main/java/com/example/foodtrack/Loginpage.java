package com.example.foodtrack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Loginpage extends AppCompatActivity {
    private EditText emailInput, passwordInput;
    private Button signupButton;
    TextView loginRedirect1;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginpage);

//        navigateButton.setOnClickListener(v -> {
//            System.out.print("method is called");
//            Intent intent = new Intent(Loginpage.this, Againlogin.class);
//            startActivity(intent);
//        });

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        signupButton = findViewById(R.id.signupButton);
        loginRedirect1 = findViewById(R.id.loginRedirect1);
        Log.d("DEBUG", "TextView reference: " + loginRedirect1);
        if (loginRedirect1 != null) {
            loginRedirect1.setOnClickListener(v -> {
                System.out.print("method is called");
                Intent intent = new Intent(Loginpage.this, Againlogin.class);
                startActivity(intent);
            });
        } else {
            Log.e("DEBUG", "TextView is null! Check XML ID.");
        }

        //  sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);

//        // Load stored values
//        emailInput.setText(sharedPreferences.getString("email", ""));
//        passwordInput.setText(sharedPreferences.getString("password", ""));

        signupButton.setOnClickListener(v -> saveLoginData());
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
    private void saveLoginData() {
        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();

        if (email.isEmpty()) {
            emailInput.setError("Please enter email");
            emailInput.setHintTextColor(Color.RED);
            return;
        }

        if (password.isEmpty()) {
            passwordInput.setError("Please enter password");
            passwordInput.setHintTextColor(Color.RED);
            return;
        }
        signupButton.setOnClickListener(v -> {
            System.out.print("method is called");
            Intent intent = new Intent(Loginpage.this, Homepage1.class);
            startActivity(intent);
        });
        //Toast.makeText(this, "Login info saved!", Toast.LENGTH_SHORT).show();
    }
}