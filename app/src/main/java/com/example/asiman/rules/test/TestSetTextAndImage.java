package com.example.asiman.rules.test;


import com.example.asiman.rules.R;

/**
 * Created by Asiman on 27.06.2015.
 */
public class TestSetTextAndImage {

    private int indexOfRightAnswer;
    private String questions;
    private int image;
    private int numberOfAnswer;
    private String buttonAnswer1;
    private String buttonAnswer2;
    private String buttonAnswer3;
    private String buttonAnswer4;
    private String buttonAnswer5;

    public String getButtonAnswer1(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return buttonAnswer1;
    }

    public String getButtonAnswer2(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return buttonAnswer2;
    }

    public String getButtonAnswer3(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return buttonAnswer3;
    }

    public String getButtonAnswer4(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return buttonAnswer4;
    }

    public String getButtonAnswer5(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return buttonAnswer5;
    }

    public int getImage(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return image;
    }

    public String getQuestions(int indexOfWallet, int indexOfQuestion){
        setProperties(indexOfWallet, indexOfQuestion);
        return questions;
    }

    public int getNumberOfAnswer(int indexOfWallet, int indexOfQuestion){
        setProperties(indexOfWallet, indexOfQuestion);
        return numberOfAnswer;
    }

    public int getIndexOfRightAnswer(int indexOfWallet, int indexOfQuestion) {
        setProperties(indexOfWallet, indexOfQuestion);
        return indexOfRightAnswer;
    }

    public int getRightImage(boolean flag){
        if(flag)
            return R.drawable.green;
        else
            return R.drawable.red;
    }

    public void setProperties(int indexOfWallet, int indexOfQuestion){
        switch(indexOfWallet){
            case 1 : Ticket1 t1 = new Ticket1(indexOfQuestion);
                this.image = t1.getImage();
                this.questions = t1.getQuestion();
                this.numberOfAnswer = t1.getNumberOfAnswer();
                this.indexOfRightAnswer = t1.getIndexOfRightAnswer();
                this.buttonAnswer1 = t1.getButtonAnswer1();
                this.buttonAnswer2 = t1.getButtonAnswer2();
                this.buttonAnswer3 = t1.getButtonAnswer3();
                this.buttonAnswer4 = t1.getButtonAnswer4();
                this.buttonAnswer5 = t1.getButtonAnswer5();
                break;
            case 2 : Ticket2 t2 = new Ticket2(indexOfQuestion);
                this.image = t2.getImage();
                this.questions = t2.getQuestion();
                this.numberOfAnswer = t2.getNumberOfAnswer();
                this.indexOfRightAnswer = t2.getIndexOfRightAnswer();
                break;
            case 3 : Ticket3 t3 = new Ticket3(indexOfQuestion);
                this.image = t3.getImage();
                this.questions = t3.getQuestion();
                this.numberOfAnswer = t3.getNumberOfAnswer();
                this.indexOfRightAnswer = t3.getIndexOfRightAnswer();
                break;
        }
    }






}
