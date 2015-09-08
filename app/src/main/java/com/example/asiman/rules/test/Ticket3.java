package com.example.asiman.rules.test;

import com.example.asiman.rules.R;

/**
 * Created by Asiman on 27.06.2015.
 */
public class Ticket3 {

    private int index;
    private String question;
    private int image;
    private int numberOfAnswer;

    public Ticket3(int index) {
        this.index = index;
    }

    public int getImage() {
        question(index);
        return image;
    }

    public String getQuestion() {
        question(index);
        return question;
    }

    public int getNumberOfAnswer() {
        question(index);
        return numberOfAnswer;
    }

    public void question(int index) {
        switch (index) {
            case 1:
                this.question = "вопрос 1 билет 3";
                this.image = R.drawable.image1t3;
                this.numberOfAnswer = 2;
                break;
            case 2:
                this.question = "вопрос 2 билет 3";
                this.image = R.drawable.image2t3;
                this.numberOfAnswer = 5;
                break;
            case 3:
                this.question = "вопрос 3 билет 3";
                this.image = R.drawable.image2t3;
                this.numberOfAnswer = 2;
                break;
            case 4:
                this.question = "вопрос 4 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 5:
                this.question = "вопрос 5 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 6:
                this.question = "вопрос 6 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 7:
                this.question = "вопрос 7 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 8:
                this.question = "вопрос 8 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 9:
                this.question = "вопрос 9 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 10:
                this.question = "вопрос 10 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 11:
                this.question = "вопрос 11 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 12:
                this.question = "вопрос 12 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 13:
                this.question = "вопрос 13 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 14:
                this.question = "вопрос 14 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 15:
                this.question = "вопрос 15 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 16:
                this.question = "вопрос 16 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 17:
                this.question = "вопрос 17 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 18:
                this.question = "вопрос 18 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 19:
                this.question = "вопрос 19 билет 3";
                this.image = R.drawable.image2t3;
                break;
            case 20:
                this.question = "вопрос 20 билет 3";
                this.image = R.drawable.image2t3;
                break;
        }
    }


}
