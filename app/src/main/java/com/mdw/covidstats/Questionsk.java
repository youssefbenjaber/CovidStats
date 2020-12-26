package com.mdw.covidstats;

public class Questionsk {

    public String mQuestionsk[] = {
            "How can you wash your hands?",
            "you should wash your hands for",
            "how can you wear your mask?",
            "what's a covid-19",
            "haw can you salute your friends?",
            "how far shoud you stay to your friends?",
            "can we see the covid-19?",
            "how many times should you wash your hands?",


    };
    private String mChoicesk[][] = {
            {"by water","by water and soap"},
            {"10 seconds","20 seconds"},
            {"on your mouth only","on your mouth and nose"},
            {"virus","bacteria"},
            {"waving from distance","shaking hands"},
            {"2 meters","20 meters"},
            {"yes","no"},
            {"one time a day","always"},

    };
    private String mCorrectAnswersk[] = {"by water and soap","20 seconds","on your mouth and nose","virus","waving from distance","2 meters","no","always"};

    public String getQuestionk(int a){
        String questionk = mQuestionsk[a];
        return questionk;
    }

    public String getChoice1k(int a){
        String choicek = mChoicesk[a][0];
        return  choicek;
    }
    public String getChoice2k(int a){
        String choicek = mChoicesk[a][1];
        return  choicek;
    }
    public String getChoice3k(int a){
        String choicek = mChoicesk[a][2];
        return  choicek;
    }

    public String getCorrectAnswerk(int a){
        String answerk = mCorrectAnswersk[a];
        return answerk;
    }
}
