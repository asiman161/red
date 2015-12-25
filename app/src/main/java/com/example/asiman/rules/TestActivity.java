package com.example.asiman.rules;

import android.app.Activity;
import android.content.Intent;
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
    private int numberOfRightAnswers = 0;
    private int numberOfQuestion = 1;
    private TestSetTextAndImage tstai = new TestSetTextAndImage();
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17, img18, img19, img20;
    private boolean back = false; //проверка, не вернулся ли пользователь назад что бы набрать больше очков


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        numberOfWallet = getIntent().getIntExtra("numberWallet", 0);

        testQuestion = (TextView) findViewById(R.id.testQuestion);
        testQuestion.setText(tstai.getQuestions(numberOfWallet, numberOfQuestion));
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(tstai.getImage(numberOfWallet, numberOfQuestion));

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
        setAnswerButton(numberOfWallet, numberOfQuestion);

        btn1.setText(tstai.getButtonAnswer1(numberOfWallet, numberOfQuestion));
        btn2.setText(tstai.getButtonAnswer2(numberOfWallet, numberOfQuestion));
        btn3.setText(tstai.getButtonAnswer3(numberOfWallet, numberOfQuestion));
        btn4.setText(tstai.getButtonAnswer4(numberOfWallet, numberOfQuestion));
        btn5.setText(tstai.getButtonAnswer5(numberOfWallet, numberOfQuestion));

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);
        img13 = (ImageView) findViewById(R.id.img13);
        img14 = (ImageView) findViewById(R.id.img14);
        img15 = (ImageView) findViewById(R.id.img15);
        img16 = (ImageView) findViewById(R.id.img16);
        img17 = (ImageView) findViewById(R.id.img17);
        img18 = (ImageView) findViewById(R.id.img18);
        img19 = (ImageView) findViewById(R.id.img19);
        img20 = (ImageView) findViewById(R.id.img20);

        numberOfQuestion += 1;
    }


    public void onClick(View view) {
        if (numberOfQuestion <= 20) {
            back = false;
            testQuestion.setText(tstai.getQuestions(numberOfWallet, numberOfQuestion));
            imageView.setImageResource(tstai.getImage(numberOfWallet, numberOfQuestion));
            setAnswerButton(numberOfWallet, numberOfQuestion);
            checkTheAnswer(numberOfWallet, numberOfQuestion - 1, view);
            numberOfQuestion += 1;
        } else {
            checkTheAnswer(numberOfWallet, numberOfQuestion - 1, view);
            Intent intent = new Intent(this, EndActivity.class);
            intent.putExtra("numberOfRightAnswers", numberOfRightAnswers);
            startActivity(intent);
        }
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

        btn1.setText(tstai.getButtonAnswer1(numberOfWallet, numberOfQuestion));
        btn2.setText(tstai.getButtonAnswer2(numberOfWallet, numberOfQuestion));
        btn3.setText(tstai.getButtonAnswer3(numberOfWallet, numberOfQuestion));
        btn4.setText(tstai.getButtonAnswer4(numberOfWallet, numberOfQuestion));
        btn5.setText(tstai.getButtonAnswer5(numberOfWallet, numberOfQuestion));
    }

    public void checkTheAnswer(int numberOfWallet, int numberOfQuestion, View view) {
        CheckTheAnswer check = new CheckTheAnswer();
        if (!back) {
            if(numberOfQuestion == 20)
            back = true;
            if (check.checkTheAnswer(numberOfWallet, numberOfQuestion, view)) {
                numberOfRightAnswers += 1;

                setImageRedOrGreen(numberOfQuestion, true);
                Toast.makeText(this, "Верный ответ", Toast.LENGTH_SHORT).show();
            } else {
                setImageRedOrGreen(numberOfQuestion, false);
                Toast.makeText(this, "Неверный ответ", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void setImageRedOrGreen(int index, boolean flag) {
        switch (index) {
            case 1:
                img1.setImageResource(tstai.getRightImage(flag));
                break;
            case 2:
                img2.setImageResource(tstai.getRightImage(flag));
                break;
            case 3:
                img3.setImageResource(tstai.getRightImage(flag));
                break;
            case 4:
                img4.setImageResource(tstai.getRightImage(flag));
                break;
            case 5:
                img5.setImageResource(tstai.getRightImage(flag));
                break;
            case 6:
                img6.setImageResource(tstai.getRightImage(flag));
                break;
            case 7:
                img7.setImageResource(tstai.getRightImage(flag));
                break;
            case 8:
                img8.setImageResource(tstai.getRightImage(flag));
                break;
            case 9:
                img9.setImageResource(tstai.getRightImage(flag));
                break;
            case 10:
                img10.setImageResource(tstai.getRightImage(flag));
                break;
            case 11:
                img11.setImageResource(tstai.getRightImage(flag));
                break;
            case 12:
                img12.setImageResource(tstai.getRightImage(flag));
                break;
            case 13:
                img13.setImageResource(tstai.getRightImage(flag));
                break;
            case 14:
                img14.setImageResource(tstai.getRightImage(flag));
                break;
            case 15:
                img15.setImageResource(tstai.getRightImage(flag));
                break;
            case 16:
                img16.setImageResource(tstai.getRightImage(flag));
                break;
            case 17:
                img17.setImageResource(tstai.getRightImage(flag));
                break;
            case 18:
                img18.setImageResource(tstai.getRightImage(flag));
                break;
            case 19:
                img19.setImageResource(tstai.getRightImage(flag));
                break;
            case 20:
                img20.setImageResource(tstai.getRightImage(flag));
                break;
        }
    }

}
