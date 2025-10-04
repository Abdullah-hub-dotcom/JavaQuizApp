package org.example;

public class Question {
    String questiontext;
    String[] options;
    int correctanswer;

    public Question(String questiontext, String[] options, int correctanswer) {
        this.questiontext = questiontext;
        this.options = options;
        this.correctanswer = correctanswer;
    }
    public boolean iscorrect(int answer){
        return correctanswer==answer;
    }
    public void displayquestion(){
        System.out.println(" "+questiontext);
        for(int i=0;i< options.length;i++){
            System.out.println((i+1)+"."+options[i]);
        }
    }
}
