import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    int score=0;
    int total=0;

Scanner input= new Scanner(System.in);
    public void getQuestion() {
        int [] array= new int[6];
        ArrayList<Integer> list = new ArrayList<>();
        for (int counter=1; counter<7; counter++) {
            list.add(counter);
        }
        Collections.shuffle(list);
        for (int counter=0; counter<6 ;counter++) {
            array[counter]=list.get(counter);
        }

        while(total!=6) {
            switch (array[total]) {
                case 1 -> {
                 try{   int answer = Integer.parseInt(JOptionPane.showInputDialog("The value of x + x(x^x) when x = 2 is:"));

                     getSolution(array[total], answer);
                        total+=1;}
                 catch (NumberFormatException numberFormatException){
                     JOptionPane.showMessageDialog(null,"Enter the a valid number");

                 }
                }
                case 2 -> {
                   try{ String answer = (JOptionPane.showInputDialog("Which is the largest number?\n" +
                           "\n" +
                           " A: 403 B: 4600 C: 406 D: 4060 E: None of these"));
                    getSolution(array[total],  answer.toLowerCase());
                        total+=1;}  catch (NumberFormatException numberFormatException){
                       JOptionPane.showMessageDialog(null,"Enter the a valid number");

                   }

                }
                case 3 -> {
                    try{String answer = JOptionPane.showInputDialog("The sum of three numbers is 98. The ratio of the first to the second is 2/3, and the ratio of the second to the third is 5/8. The second number is:\n" +
                            "\n" +
                            "(a) 15, (b) 20, (c) 30, (d) 32, (e) 33\n");
                    getSolution(array[total],  answer.toLowerCase());
                        total+=1;
                    }  catch (NumberFormatException numberFormatException){
                        JOptionPane.showMessageDialog(null,"Enter the a valid number");

                    }
                }

                case 4 -> {
                    try{int answer = Integer.parseInt(JOptionPane.showInputDialog("What is the solution to the question 2%1:"));
                    getSolution(array[total], answer);
                        total+=1;}  catch (NumberFormatException numberFormatException){
                        JOptionPane.showMessageDialog(null,"Enter the a valid number");
                    }
                }
                case 5 -> {
                   String given =  JOptionPane.showInputDialog("Jones covered a distance of 50 miles on his first trip. On a later trip he traveled 300 miles while going three times as fast. His new time compared with the old time was:\n" +
                           "\n" +
                           "(a) three times as much, (b) twice as much, (c) the same, (d) half as much, (e) a third as much");
                    getSolution(array[total], given.toLowerCase());
                       total+=1;
                }
                case 6->{
                    String given =  JOptionPane.showInputDialog("10^2y = 25, then 10^-y equals" +"\n"+
                            "(a) -1/5, (b) 1/625, (c) 1/50, (d) 1/25, (e) 1/5");
                       getSolution(array[total], given.toLowerCase());
                       total+=1;
                }
                default -> {}
            }

        }
getTotalScore();
        }

    private void getSolution(int questionNumber,int questionAnswer) {
        if( questionNumber==1 && questionAnswer ==10){

            JOptionPane.showMessageDialog(null, "Correct");
            score+=1;
        }  if( questionNumber==1 && questionAnswer !=10){
            JOptionPane.showMessageDialog(null, "Wrong");
        }


        if( questionNumber==4 && questionAnswer ==0){
            score+=1;

            JOptionPane.showMessageDialog(null, "Correct");
        }
        if( questionNumber==4 && questionAnswer !=0){
            JOptionPane.showMessageDialog(null, "Wrong");
        }
    }
    private void getSolution(int questionNumber,String questionAnswer){
        switch (questionNumber){
            case 2->{if(questionAnswer.equals("b")){
                score+=1;
                JOptionPane.showMessageDialog(null, "Correct");}
                else {
                JOptionPane.showMessageDialog(null, "Wrong");
            }}
            case 3-> {if(questionAnswer.equals("c")){
                    score+=1;
                    JOptionPane.showMessageDialog(null, "Correct");
                }
               else {
                    JOptionPane.showMessageDialog(null, "Wrong");
                }
                }

            case 5 ->{
                if(questionAnswer.equals("b")){
                    JOptionPane.showMessageDialog(null, "Correct");
                    score+=1;
                }
                else
                    JOptionPane.showMessageDialog(null, "Wrong");
            }
            case 6 ->{
                if(questionAnswer.equals("e")){

                    JOptionPane.showMessageDialog(null, "Correct");
                    score+=1;
                }
                else
                    JOptionPane.showMessageDialog(null, "Wrong");
            }
            default ->{}
        }

    }
    public String getIndividualScore(){
        return String.format("%d of %d",score,total);}

    public void getTotalScore(){
        if(score<3){
    JOptionPane.showMessageDialog(null, "Your Total Score is " +getIndividualScore(),
            "TOTAL SCORE", JOptionPane.ERROR_MESSAGE);}
        if(score>3){
            JOptionPane.showMessageDialog(null, "Your Total Score is " +getIndividualScore(),
                    "TOTAL SCORE", JOptionPane.INFORMATION_MESSAGE);}
        if(score==3){
            JOptionPane.showMessageDialog(null, "Your Total Score is " +getIndividualScore(),
                    "TOTAL SCORE", JOptionPane.WARNING_MESSAGE);}
}


}
