package com.APP.percentage75;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private EditText email, password;
    private Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignIn.setOnClickListener(v -> {
            // Validate and sign in the user
            startActivity(new Intent(SignInActivity.this, EducationDetailsActivity.class));
        });

        btnSignUp.setOnClickListener(v -> {
            // Navigate to Sign Up page
            startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        });
    }
}
