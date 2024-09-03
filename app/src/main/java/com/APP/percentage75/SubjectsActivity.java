package com.APP.percentage75;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class SubjectsActivity extends AppCompatActivity {

    private LinearLayout subjectsLayout;
    private Button btnAddSubject, btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        subjectsLayout = findViewById(R.id.subjectsLayout);
        btnAddSubject = findViewById(R.id.btnAddSubject);
        btnFinish = findViewById(R.id.btnFinish);

        btnAddSubject.setOnClickListener(v -> addSubjectField());

        btnFinish.setOnClickListener(v -> {
            // Gather all subject inputs
            int subjectCount = subjectsLayout.getChildCount();
            for (int i = 0; i < subjectCount; i++) {
                View view = subjectsLayout.getChildAt(i);
                if (view instanceof EditText) {
                    String subject = ((EditText) view).getText().toString();
                    // Save or use the subject
                }
            }
            // Move to the main activity
            startActivity(new Intent(SubjectsActivity.this, MainActivity.class));
        });
    }

    private void addSubjectField() {
        EditText newSubject = new EditText(this);
        newSubject.setHint("Enter Subject");
        newSubject.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        subjectsLayout.addView(newSubject);
    }
}
