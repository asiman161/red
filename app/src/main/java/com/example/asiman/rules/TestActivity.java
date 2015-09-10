package com.example.asiman.rules;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiman.rules.test.CheckTheAnswer;
import com.example.asiman.rules.test.TestSetTextAndImage;


public class TestActivity extends Activity {

    private int numberOfWallet;
    private TextView testQuestion;
    private ImageView imageView;
    private int indexOfQuestion = 1;
    TestSetTextAndImage tstai = new TestSetTextAndImage();
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        numberOfWallet = getIntent().getIntExtra("numberWallet", 0);

        testQuestion = (TextView) findViewById(R.id.testQuestion);
        testQuestion.setText(tstai.getQuestions(numberOfWallet, indexOfQuestion));
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(tstai.getImage(numberOfWallet, indexOfQuestion));

        btn1 = (Button) findViewById(R.id.btnAnswer1);
        btn2 = (Button) findViewById(R.id.btnAnswer2);
        btn3 = (Button) findViewById(R.id.btnAnswer3);
        btn4 = (Button) findViewById(R.id.btnAnswer4);
        btn5 = (Button) findViewById(R.id.btnAnswer5);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        setAnswerButton(numberOfWallet, indexOfQuestion);

        indexOfQuestion += 1;
    }


    public void onClick(View view) {
        testQuestion.setText(tstai.getQuestions(numberOfWallet, indexOfQuestion));
        imageView.setImageResource(tstai.getImage(numberOfWallet, indexOfQuestion));
        setAnswerButton(numberOfWallet, indexOfQuestion);
        checkTheAnswer(numberOfWallet, indexOfQuestion, view);
        indexOfQuestion += 1;
    }

    public void setAnswerButton(int numberOfWallet, int indexOfQuestion) {

        int index = tstai.getNumberOfAnswer(numberOfWallet, indexOfQuestion);
        if (index == 2) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (index == 3) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (index == 4) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (index == 5) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
        }
    }

    public void checkTheAnswer(int numberOfWallet, int indexOfQuestion, View view){
        CheckTheAnswer check = new CheckTheAnswer();
        if(check.checkTheAnswer(numberOfWallet,indexOfQuestion,view))
            Toast.makeText(this, "Верный ответ", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Неверный ответ", Toast.LENGTH_SHORT).show();
        }


}
