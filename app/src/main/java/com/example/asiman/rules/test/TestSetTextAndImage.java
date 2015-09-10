package com.example.asiman.rules.test;


/**
 * Created by Asiman on 27.06.2015.
 */
public class TestSetTextAndImage {

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

    private int indexOfRightAnswer;
    private String questions;
    private int image;
    private int numberOfAnswer;

    public void setProperties(int indexOfWallet, int indexOfQuestion){
        switch(indexOfWallet){
            case 1 : Ticket1 t1 = new Ticket1(indexOfQuestion);
                this.image = t1.getImage();
                this.questions = t1.getQuestion();
                this.numberOfAnswer = t1.getNumberOfAnswer();
                this.indexOfRightAnswer = t1.getIndexOfRightAnswer();
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
