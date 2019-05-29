package com.example.quizappandroid;


public class QuestionLibrary {

    private String mQuestions [] = {
            "Who is pakistan prime minister now?",
            "Who is pakistan President?",
            "Who is cricket team caption for worldcup",
            "how many balls in one over"

    };


    private String mChoices [][] = {
            {"Imran khan", "Nawaz shareef", "Bilawal bhutto"},
            {"Zardari", "Mamnoon Hussain", "Arif alvi"},
            {"Afridi", "Hafeez", "Misbah"},
            {"Five", "six", "Seven"}
    };



    private String mCorrectAnswers[] = {"Imran khan", "Arif alvi", "Hafeez", "six"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
