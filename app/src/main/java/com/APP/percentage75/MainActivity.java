package com.APP.percentage75;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView attendanceDetails;
    private TextView collegeNameView, studentNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        attendanceDetails = findViewById(R.id.attendanceDetails);
        collegeNameView = findViewById(R.id.collegeNameView);
        studentNameView = findViewById(R.id.studentNameView);

        // Retrieve the college and student names from the intent
        String collegeName = getIntent().getStringExtra("COLLEGE_NAME");
        String studentName = getIntent().getStringExtra("STUDENT_NAME");

        // Display the retrieved data
        collegeNameView.setText("College: " + collegeName);
        studentNameView.setText("Student: " + studentName);

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            // Handle date selection and display attendance details
            String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
            // Logic to display or update attendance details
        });
    }
}
