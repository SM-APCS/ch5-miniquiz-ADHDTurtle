/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz.miniquiz;

/**
 *
 * @author Ivan Day
 */
import java.util.Scanner;

public class MiniQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question q1, q2;
        String possible;
        Scanner scan = new Scanner(System.in);
        
        q1 = new Question("What is the capital of Jamaica?", "Kingston");
        
        q1.setComplexity(4);
        
        q2 = new Question("Which is worse, ignorance or apathy?", "I don't know and I don't care");
        
        q2.setComplexity(10);
        
        System.out.println(q1.getQuestion());
        System.out.println(" (Level: " + q1.getComplexity() + ")");
        possible = scan.nextLine();
        if (q1.answerCorrect(possible)){
            System.out.println("Correct");
        } else System.out.println ("No, the answer is " + q2.getAnswer());
        
        System.out.println();
        System.out.print (q2.getQuestion());
        System.out.println(" (Level: " + q2.getComplexity() + ")");
        possible = scan.nextLine();
        if (q2.answerCorrect(possible)){
            System.out.println("Correct");
        } else System.out.println("No, the answer is " + q2.getAnswer());
        
    }
    
}
