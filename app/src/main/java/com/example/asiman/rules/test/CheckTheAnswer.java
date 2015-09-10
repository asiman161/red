package com.example.asiman.rules.test;

import android.view.View;

import com.example.asiman.rules.R;

/**
 * Created by Asiman on 10.09.2015.
 */
public class CheckTheAnswer {
    public boolean checkTheAnswer(int numberOfWallet, int indexOfQuestion, View view){
        TestSetTextAndImage tstai = new TestSetTextAndImage();
        int index = tstai.getIndexOfRightAnswer(numberOfWallet, indexOfQuestion);
        int id;
        switch (view.getId()) {
            case R.id.btnAnswer1:
                id = 1;
                return index == id;
            case R.id.btnAnswer2:
                id = 2;
                return index == id;
            case R.id.btnAnswer3:
                id = 3;
                return index == id;
            case R.id.btnAnswer4:
                id = 4;
                return index == id;
            case R.id.btnAnswer5:
                id = 5;
                return index == id;
            default:
                return false;
        }
    }
}
