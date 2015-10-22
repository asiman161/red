package com.example.asiman.rules.test;

import com.example.asiman.rules.R;

/**
 * Created by Asiman on 27.06.2015.
 */
public class Ticket1 {

    public Ticket1(int index) {
        this.index = index;
    }

    private int index;
    private String question;
    private String buttonAnswer1;
    private String buttonAnswer2;
    private String buttonAnswer3;
    private String buttonAnswer4;
    private String buttonAnswer5;

    public String getButtonAnswer1() {
        question(index);
        return buttonAnswer1;
    }

    public String getButtonAnswer2() {
        question(index);
        return buttonAnswer2;
    }

    public String getButtonAnswer3() {
        question(index);
        return buttonAnswer3;
    }

    public String getButtonAnswer4() {
        question(index);
        return buttonAnswer4;
    }

    public String getButtonAnswer5() {
        question(index);
        return buttonAnswer5;
    }

    private int image;
    private int numberOfAnswer;
    private int indexOfRightAnswer;

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

    public int getIndexOfRightAnswer(){
        question(index);
        return indexOfRightAnswer;
    }




    public void question(int index) {
        switch (index) {
            case 1:
                this.question = "Какие транспортные средства по Правилам относятся к маршрутным транспортным средствам?";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "1. Все автобусы.";
                this.buttonAnswer2 = "+2. Автобусы, троллейбусы и трамваи, предназначенные для перевозки людей и движущиеся по установленному маршруту с обозначенными местами остановок.";
                this.buttonAnswer3 = "3. Любые транспортные средства, перевозящие пассажиров.";
                this.buttonAnswer4 = "ответ4в1т1-";
                this.buttonAnswer5 = "ответ5в1т1-";
                break;
            case 2:
                this.question = "В каких направлениях Вам разрешено продолжить движение?";
                this.image = R.drawable.image2t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "1. Только Б.";
                this.buttonAnswer2 = "+2. Только А или Б.";
                this.buttonAnswer3 = "3. В любых.";
                this.buttonAnswer4 = "ответ4в2т1-";
                this.buttonAnswer5 = "ответ5в2т1-";
                break;
            case 3:
                this.question = "Этот дорожный знак указывает:";
                this.image = R.drawable.image3t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Расстояние до конца тоннеля.";
                this.buttonAnswer2 = "2. Расстояние до места аварийной остановки.";
                this.buttonAnswer3 = "+3. Направление движения к аварийному выходу и расстояние до него.";
                this.buttonAnswer4 = "ответ4в3т1-";
                this.buttonAnswer5 = "ответ5в3т1-";
                break;
            case 4:
                this.question = "Этот знак разрешает Вам ставить на стоянку легковой автомобиль с использованием тротуара:";
                this.image = R.drawable.image4t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Только на правой стороне дороги до ближайшего по ходу движения перекрестка.";
                this.buttonAnswer2 = "2. Только на правой стороне дороги до знака «Конец зоны регулируемой стоянки».";
                this.buttonAnswer3 = "+3. На любой стороне дорог, расположенных в зоне регулируемой стоянки.";
                this.buttonAnswer4 = "ответ4в4т1-";
                this.buttonAnswer5 = "ответ5в4т1-";
                break;
            case 5:
                this.question = "вопрос 5 билет 1";
                this.image = R.drawable.image5t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 5;
                this.buttonAnswer1 = "ответ1в5т1-";
                this.buttonAnswer2 = "ответ2в5т1-";
                this.buttonAnswer3 = "ответ3в5т1-";
                this.buttonAnswer4 = "ответ4в5т1-";
                this.buttonAnswer5 = "ответ5в5т1+";
                break;
            case 6:
                this.question = "вопрос 6 билет 1";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "ответ1в6т1+";
                this.buttonAnswer2 = "ответ2в6т1-";
                this.buttonAnswer3 = "ответ3в6т1-";
                this.buttonAnswer4 = "ответ4в6т1-";
                this.buttonAnswer5 = "ответ5в6т1-";
                break;
            case 7:
                this.question = "вопрос 7 билет 1";
                this.image = R.drawable.image7t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "ответ1в7т1-";
                this.buttonAnswer2 = "ответ2в7т1+";
                this.buttonAnswer3 = "ответ3в7т1-";
                this.buttonAnswer4 = "ответ4в7т1-";
                this.buttonAnswer5 = "ответ5в7т1-";
                break;
            case 8:
                this.question = "вопрос 8 билет 1";
                this.image = R.drawable.image8t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "ответ1в8т1-";
                this.buttonAnswer2 = "ответ2в8т1-";
                this.buttonAnswer3 = "ответ3в8т1+";
                this.buttonAnswer4 = "ответ4в8т1-";
                this.buttonAnswer5 = "ответ5в8т1-";
                break;
            case 9:
                this.question = "вопрос 9 билет 1";
                this.image = R.drawable.image9t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 4;
                this.buttonAnswer1 = "ответ1в9т1-";
                this.buttonAnswer2 = "ответ2в9т1-";
                this.buttonAnswer3 = "ответ3в9т1-";
                this.buttonAnswer4 = "ответ4в9т1+";
                this.buttonAnswer5 = "ответ5в9т1-";
                break;
            case 10:
                this.question = "вопрос 10 билет 1";
                this.image = R.drawable.image10t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 5;
                this.buttonAnswer1 = "ответ1в10т1-";
                this.buttonAnswer2 = "ответ2в10т1-";
                this.buttonAnswer3 = "ответ3в10т1-";
                this.buttonAnswer4 = "ответ4в10т1-";
                this.buttonAnswer5 = "ответ5в10т1+";
                break;
            case 11:
                this.question = "вопрос 11 билет 1";
                this.image = R.drawable.image11t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "ответ1в11т1+";
                this.buttonAnswer2 = "ответ2в11т1-";
                this.buttonAnswer3 = "ответ3в11т1-";
                this.buttonAnswer4 = "ответ4в11т1-";
                this.buttonAnswer5 = "ответ5в11т1-";
                break;
            case 12:
                this.question = "вопрос 12 билет 1";
                this.image = R.drawable.image12t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "ответ1в12т1-";
                this.buttonAnswer2 = "ответ2в12т1+";
                this.buttonAnswer3 = "ответ3в12т1-";
                this.buttonAnswer4 = "ответ4в12т1-";
                this.buttonAnswer5 = "ответ5в12т1-";
                break;
            case 13:
                this.question = "вопрос 13 билет 1";
                this.image = R.drawable.image13t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "ответ1в13т1-";
                this.buttonAnswer2 = "ответ2в13т1-";
                this.buttonAnswer3 = "ответ3в13т1+";
                this.buttonAnswer4 = "ответ4в13т1-";
                this.buttonAnswer5 = "ответ5в13т1-";
                break;
            case 14:
                this.question = "вопрос 14 билет 1";
                this.image = R.drawable.image14t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 4;
                this.buttonAnswer1 = "ответ1в14т1-";
                this.buttonAnswer2 = "ответ2в14т1-";
                this.buttonAnswer3 = "ответ3в14т1-";
                this.buttonAnswer4 = "ответ4в14т1+";
                this.buttonAnswer5 = "ответ5в14т1-";
                break;
            case 15:
                this.question = "вопрос 15 билет 1";
                this.image = R.drawable.image15t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 5;
                this.buttonAnswer1 = "ответ1в15т1-";
                this.buttonAnswer2 = "ответ2в15т1-";
                this.buttonAnswer3 = "ответ3в15т1-";
                this.buttonAnswer4 = "ответ4в15т1-";
                this.buttonAnswer5 = "ответ5в15т1+";
                break;
            case 16:
                this.question = "вопрос 16 билет 1";
                this.image = R.drawable.image16t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "ответ1в16т1+";
                this.buttonAnswer2 = "ответ2в16т1-";
                this.buttonAnswer3 = "ответ3в16т1-";
                this.buttonAnswer4 = "ответ4в16т1-";
                this.buttonAnswer5 = "ответ5в16т1-";
                break;
            case 17:
                this.question = "вопрос 17 билет 1";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "ответ1в17т1-";
                this.buttonAnswer2 = "ответ2в17т1+";
                this.buttonAnswer3 = "ответ3в17т1-";
                this.buttonAnswer4 = "ответ4в17т1-";
                this.buttonAnswer5 = "ответ5в17т1-";
                break;
            case 18:
                this.question = "вопрос 18 билет 1";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "ответ1в18т1-";
                this.buttonAnswer2 = "ответ2в18т1-";
                this.buttonAnswer3 = "ответ3в18т1+";
                this.buttonAnswer4 = "ответ4в18т1-";
                this.buttonAnswer5 = "ответ5в18т1-";
                break;
            case 19:
                this.question = "вопрос 19 билет 1";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 4;
                this.buttonAnswer1 = "ответ1в19т1-";
                this.buttonAnswer2 = "ответ2в19т1-";
                this.buttonAnswer3 = "ответ3в19т1-";
                this.buttonAnswer4 = "ответ4в19т1+";
                this.buttonAnswer5 = "ответ5в19т1-";
                break;
            case 20:
                this.question = "вопрос 20 билет 1";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 5;
                this.buttonAnswer1 = "ответ1в20т1-";
                this.buttonAnswer2 = "ответ2в20т1-";
                this.buttonAnswer3 = "ответ3в20т1-";
                this.buttonAnswer4 = "ответ4в20т1-";
                this.buttonAnswer5 = "ответ5в20т1+";
                break;
        }
    }

}
