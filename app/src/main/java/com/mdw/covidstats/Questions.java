package com.mdw.covidstats;

public class Questions {

    public String mQuestions[] = {
         "How is covid 19 passed on?",
            "How can people iving with HIV protect themselves from covid 19?",
            "which of the following is an example of physical distancing?",
            "can covid 19 be cured?",
            "when should fabric face masks be worn?",
            "can washing your hands protect you from covid 19?",
            "can you always tell if somoene has covid 19?",
            "what are the common symptoms of covid 19?",
            "How does weather seem to affect the novel coronavirus?"

    };
    private String mChoices[][] = {
            {"Thtough droplets that come from your mouth or nose when you cough or breathe out","in sexual fluids","by drinking unclean water"},
            {"wash their hands regulary","keep taking their antiretroviral treatement","all of the above"},
            {"stop going to crowded places and visiting others","stop talking to people you live with","stop speaking to your friends on the phone"},
            {"yes, hot drinks can cure it","no, it's a death sentence","no, butmost people get better by themselves"},
            {"on public transport","in small shops","all of the above"},
            {"yes but only if you use strong bleach","yes normal soap and water is enough","no washing your hands doesnt stop covid 19"},
            {"no not everyone with covid 19 has symptoms","yes it will be obvious, he will coughs a lot","yes you can tell by his race"},
            {"continuous cough","fever and tiredness","all of the above"},
            {"The virus can’t survive in hot, humid climates","Cold temperatures can kill the virus","It is not yet known"}

    };
    private String mCorrectAnswers[] = {"Thtough droplets that come from your mouth or nose when you cough or breathe out","all of the above","stop going to crowded places and visiting others","no, butmost people get better by themselves","all of the above","yes normal soap and water is enough","no not everyone with covid 19 has symptoms","all of the above","It is not yet known"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return  choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return  choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return  choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
