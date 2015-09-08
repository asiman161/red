package com.example.asiman.rules;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiman.rules.test.TestSetTextAndImage;



public class TestActivity extends Activity {

    private int numberOfWallet;
    private TextView testQuestion;
    private ImageView imageView;
    private int indexOfQuestion = 1;
    TestSetTextAndImage tsi = new TestSetTextAndImage();
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
        testQuestion.setText(tsi.getQuestions(numberOfWallet, indexOfQuestion));
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(tsi.getImage(numberOfWallet, indexOfQuestion));

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

    public void onShow(View view) {
        Toast toast = Toast.makeText(this, "test", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClick(View view) {
        testQuestion.setText(tsi.getQuestions(numberOfWallet, indexOfQuestion));
        imageView.setImageResource(tsi.getImage(numberOfWallet, indexOfQuestion));
        setAnswerButton(numberOfWallet, indexOfQuestion);
        indexOfQuestion += 1;
    }

    public void setAnswerButton(int numberOfWallet, int indexOfQuestion) {

        int num = tsi.getNumberOfAnswer(numberOfWallet, indexOfQuestion);
        if (num == 2) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (num == 3) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (num == 4) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.INVISIBLE);
        } else if (num == 5) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
        }
    }

}
