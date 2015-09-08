package com.example.asiman.rules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Asiman on 07.06.2015.
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void goToTicketsActivity(View view){
        Intent intent = new Intent(this, TicketsActivity.class);
        startActivity(intent);
    }

    public void goToExamActivity(View view){
        Intent intent = new Intent(this, ExamActivity.class);
        startActivity(intent);
    }
    public void goToRulesActivity(View view){
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }
    public void goToStatisticActivity(View view){
        Intent intent = new Intent(this, StatisticActivity.class);
        startActivity(intent);
    }

}
