package com.example.androidl.itsecurityquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app is IT Security Quiz
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void end_Test(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        question_1();

        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @return text of the test result
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;


        return test_result;
    }

    /**
     * This method counter correct answers in question 1
     * Which of the following are the primary goals of network security? (Choose 3 best answers)
     */
    public void question_1() {
        // Figure out if the user chose "Availability" answer
        CheckBox AvailabilityCheckBox = (CheckBox) findViewById(R.id.availability_checkbox);
        boolean hasAvailability = AvailabilityCheckBox.isChecked();

        if (hasAvailability) {
            increment_score();
        }

        // Figure out if the user chose "Integrity" answer
        CheckBox IntegrityCheckBox = (CheckBox) findViewById(R.id.integrity_checkbox);
        boolean hasIntegrity = IntegrityCheckBox.isChecked();

        if (hasIntegrity) {
            increment_score();
        }

        // Figure out if the user chose "Confidentiality" answer
        CheckBox ConfidentialityCheckBox = (CheckBox) findViewById(R.id.confidentiality_checkbox);
        boolean hasConfidentiality = ConfidentialityCheckBox.isChecked();

        if (hasConfidentiality) {
            increment_score();
        }
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}
