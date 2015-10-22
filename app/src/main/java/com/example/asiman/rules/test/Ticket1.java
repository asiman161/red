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
                this.question = "Эта разметка, нанесенная на полосе движения:";
                this.image = R.drawable.image5t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Предоставляет Вам преимущество при перестроении на правую полосу.";
                this.buttonAnswer2 = "2. Информирует Вас о том, что дорога поворачивает направо.";
                this.buttonAnswer3 = "+3. Предупреждает Вас о приближении к сужению проезжей части.";
                this.buttonAnswer4 = "ответ4в5т1-";
                this.buttonAnswer5 = "ответ5в5т1+";
                break;
            case 6:
                this.question = "Что означает мигание зеленого сигнала светофора?";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "1. Предупреждает о неисправности светофора.";
                this.buttonAnswer2 = "+2. Разрешает движение и информирует о том, что вскоре будет включен запрещающий сигнал.";
                this.buttonAnswer3 = "3. Запрещает дальнейшее движение.";
                this.buttonAnswer4 = "ответ4в6т1-";
                this.buttonAnswer5 = "ответ5в6т1-";
                break;
            case 7:
                this.question = "Обязаны ли Вы в данной ситуации подать сигнал правого поворота?";
                this.image = R.drawable.image7t1;
                this.numberOfAnswer = 5;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Да.";
                this.buttonAnswer2 = "2. Да, но только при наличии движущихся сзади транспортных средств.";
                this.buttonAnswer3 = "+3. Нет.";
                this.buttonAnswer4 = "ответ4в7т1-";
                this.buttonAnswer5 = "ответ5в7т1-";
                break;
            case 8:
                this.question = "Кто должен уступить дорогу при одновременном перестроении?";
                this.image = R.drawable.image8t1;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "+1. Водитель легкового автомобиля.";
                this.buttonAnswer2 = "2. Водитель мотоцикла.";
                this.buttonAnswer3 = "ответ3в8т1+";
                this.buttonAnswer4 = "ответ4в8т1-";
                this.buttonAnswer5 = "ответ5в8т1-";
                break;
            case 9:
                this.question = "По какой траектории Вам разрешено выполнить разворот?";
                this.image = R.drawable.image9t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "+1. Только по А.";
                this.buttonAnswer2 = "2. Только по Б.";
                this.buttonAnswer3 = "3. По любой.";
                this.buttonAnswer4 = "ответ4в9т1+";
                this.buttonAnswer5 = "ответ5в9т1-";
                break;
            case 10:
                this.question = "С какой скоростью Вы можете продолжить движение вне населенного пункта по левой полосе на легковом автомобиле?";
                this.image = R.drawable.image10t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Не более 50 км/ч.";
                this.buttonAnswer2 = "2. Не менее 50 км/ч и не более 70 км/ч.";
                this.buttonAnswer3 = "+3. Не менее 50 км/ч и не более 90 км/ч.";
                this.buttonAnswer4 = "ответ4в10т1-";
                this.buttonAnswer5 = "ответ5в10т1+";
                break;
            case 11:
                this.question = "Может ли водитель легкового автомобиля в населенном пункте выполнить опережение грузовых автомобилей по такой траектории?";
                this.image = R.drawable.image11t1;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "+1. Да.";
                this.buttonAnswer2 = "2. Нет.";
                this.buttonAnswer3 = "ответ3в11т1-";
                this.buttonAnswer4 = "ответ4в11т1-";
                this.buttonAnswer5 = "ответ5в11т1-";
                break;
            case 12:
                this.question = "Разрешено ли водителю поставить автомобиль на стоянку в указанном месте?";
                this.image = R.drawable.image12t1;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "+1. Да.";
                this.buttonAnswer2 = "2. Нет.";
                this.buttonAnswer3 = "ответ3в12т1-";
                this.buttonAnswer4 = "ответ4в12т1-";
                this.buttonAnswer5 = "ответ5в12т1-";
                break;
            case 13:
                this.question = "Вы намерены повернуть направо. Следует ли уступить дорогу автобусу?";
                this.image = R.drawable.image13t1;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 1;
                this.buttonAnswer1 = "+1. Да.";
                this.buttonAnswer2 = "2. Нет.";
                this.buttonAnswer3 = "ответ3в13т1+";
                this.buttonAnswer4 = "ответ4в13т1-";
                this.buttonAnswer5 = "ответ5в13т1-";
                break;
            case 14:
                this.question = "Вы намерены проехать перекресток в прямом направлении. Ваши действия?";
                this.image = R.drawable.image14t1;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "1. Уступите дорогу легковому автомобилю, поскольку он первым въехал на перекресток.";
                this.buttonAnswer2 = "+2. Убедитесь, что легковой автомобиль уступает дорогу, и проедете перекресток первым.";
                this.buttonAnswer3 = "ответ3в14т1-";
                this.buttonAnswer4 = "ответ4в14т1+";
                this.buttonAnswer5 = "ответ5в14т1-";
                break;
            case 15:
                this.question = "Вы намерены повернуть налево. Кому следует уступить дорогу?";
                this.image = R.drawable.image15t1;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Только автобусу.";
                this.buttonAnswer2 = "2. Только легковому автомобилю.";
                this.buttonAnswer3 = "+3. Никому.";
                this.buttonAnswer4 = "ответ4в15т1-";
                this.buttonAnswer5 = "ответ5в15т1+";
                break;
            case 16:
                this.question = "С какой максимальной скоростью Вы можете продолжить движение за знаком?";
                this.image = R.drawable.image16t1;
                this.numberOfAnswer = 4;
                this.indexOfRightAnswer = 4;
                this.buttonAnswer1 = "1. 60 км/ч.";
                this.buttonAnswer2 = "2. 50 км/ч.";
                this.buttonAnswer3 = "3. 30 км/ч.";
                this.buttonAnswer4 = "+4. 20 км/ч.";
                this.buttonAnswer5 = "ответ5в16т1-";
                break;
            case 17:
                this.question = "Какие внешние световые приборы Вы можете использовать при движении в темное время суток на неосвещенных участках дорог?";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Только фары ближнего света.";
                this.buttonAnswer2 = "2. Только фары дальнего света.";
                this.buttonAnswer3 = "+3. Фары ближнего или дальнего света.";
                this.buttonAnswer4 = "ответ4в17т1-";
                this.buttonAnswer5 = "ответ5в17т1-";
                break;
            case 18:
                this.question = "При какой неисправности разрешается эксплуатация транспортного средства?";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 4;
                this.indexOfRightAnswer = 4;
                this.buttonAnswer1 = "1. Не работают запоры горловин топливных баков.";
                this.buttonAnswer2 = "2. Не работает механизм регулировки сиденья водителя.";
                this.buttonAnswer3 = "3. Не работает устройство обогрева и обдува стекла.";
                this.buttonAnswer4 = "+4. Не работает стеклоподъемник.";
                this.buttonAnswer5 = "ответ5в18т1-";
                break;
            case 19:
                this.question = "В случае, когда правые колеса автомобиля наезжают на неукрепленную влажную обочину, рекомендуется:";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 3;
                this.indexOfRightAnswer = 3;
                this.buttonAnswer1 = "1. Затормозить и полностью остановиться.";
                this.buttonAnswer2 = "2. Затормозить и плавно направить автомобиль в левую сторону.";
                this.buttonAnswer3 = "+3. Не прибегая к торможению, плавно вернуть автомобиль на проезжую часть.";
                this.buttonAnswer4 = "ответ4в19т1+";
                this.buttonAnswer5 = "ответ5в19т1-";
                break;
            case 20:
                this.question = "Когда следует проводить сердечно-легочную реанимацию пострадавшего?";
                this.image = R.drawable.image0;
                this.numberOfAnswer = 2;
                this.indexOfRightAnswer = 2;
                this.buttonAnswer1 = "1. При потере пострадавшим сознания, независимо от наличия пульса на сонной артерии и дыхания.";
                this.buttonAnswer2 = "+2. При потере пострадавшим сознания и отсутствии пульса на сонной артерии, а также признаков дыхания.";
                this.buttonAnswer3 = "ответ3в20т1-";
                this.buttonAnswer4 = "ответ4в20т1-";
                this.buttonAnswer5 = "ответ5в20т1+";
                break;
        }
    }

}
