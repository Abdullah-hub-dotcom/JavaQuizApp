package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Question> questions=new ArrayList<>();
        questions.add(new Question("1. What are Java loops?",
                new String[]{"Used for iteration", "Used for exceptions", "Used for classes", "None of these"}, 1));
        questions.add(new Question("2. What is an enhanced for-loop?",
                new String[]{"Loop for arrays/collections", "Infinite loop", "While loop", "Switch loop"}, 1));
        questions.add(new Question("3. How do you handle multiple user inputs?",
                new String[]{"Using Scanner", "Using Thread", "Using FileReader", "Using Loops"}, 4));
        questions.add(new Question("4. How is switch-case different from if-else?",
                new String[]{"Switch is faster", "If-else is faster", "Both same", "None"}, 1));
        questions.add(new Question("5. What is ArrayList?",
                new String[]{"Resizable array", "Immutable list", "Thread-safe list", "Linked list"}, 1));
        int score=0;
        System.out.println("===Java Quiz App===");
        for (Question q:questions){
            q.displayquestion();
            System.out.println("Your Answer(1-4):");
            int answer=scanner.nextInt();
            if(q.iscorrect(answer)){
                System.out.println("Your Answer is Correct");
                score++;
            }
            else {
                System.out.println("Your Answer is Wrong");
            }
        }
        System.out.println("===Quiz Finished===");
        System.out.println("Your Score is"+score+"/"+questions.size());
        scanner.close();

    }
}