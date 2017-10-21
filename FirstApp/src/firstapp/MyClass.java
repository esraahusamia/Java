/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

/**
 *
 * @author EsraaHus93
 */
public class MyClass {
    int count =0;
    public void printMsg(String name){
        System.out.print("Thank you " + name + " for teaching me Java  ");
    }
    
    public void guessMyNumber(int num){
        count++;
        int random =  (int) Math.floor(Math.random() *(10+1));
        if (num > 10 ){
            System.out.print("Please try a number between 0 and 10");
        }
        else if (num == random){
            System.out.print("Congratulation!! You win!!");
            System.out.print(count);
        }
        
    }
    
    
}
