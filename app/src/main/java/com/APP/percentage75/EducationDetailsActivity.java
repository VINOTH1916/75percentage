package com.APP.percentage75;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EducationDetailsActivity extends AppCompatActivity {

    private EditText collegeName, studentName, course, yearOfStudy;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_details);

        collegeName = findViewById(R.id.collegeName);
        studentName = findViewById(R.id.studentName);
        course = findViewById(R.id.course);
        yearOfStudy = findViewById(R.id.yearOfStudy);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            // Retrieve the data entered by the user
            String college = collegeName.getText().toString();
            String student = studentName.getText().toString();

            // Create an intent to start MainActivity
            Intent intent = new Intent(EducationDetailsActivity.this, MainActivity.class);

            // Pass the data to MainActivity
            intent.putExtra("COLLEGE_NAME", college);
            intent.putExtra("STUDENT_NAME", student);

            // Start MainActivity
            startActivity(intent);
        });
    }
}
