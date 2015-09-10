package com.example.asiman.rules;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Asiman on 10.09.2015.
 */
public class EndActivity extends Activity{

    private TextView numberOfRightAnswersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_layout);

        int numberOfRightAnswers = getIntent().getIntExtra("numberOfRightAnswers", 99);
        numberOfRightAnswersTextView = (TextView) findViewById(R.id.textView6);
        numberOfRightAnswersTextView.setText(String.valueOf(numberOfRightAnswers));

    }
}
