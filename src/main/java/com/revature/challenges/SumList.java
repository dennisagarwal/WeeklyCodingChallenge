package com.revature.challenges;

import java.util.LinkedList;

public class SumList {

    public static LinkedList<Integer> sumLists(LinkedList<Integer> number1, LinkedList<Integer> number2){

        int add1 = 0;
        int add2 = 0;
        int number1Size = number1.size();
        int number2Size = number2.size();
        LinkedList<Integer> result = new LinkedList<>();

        for(int i =1, j=0; j < number1Size; i*=10,j++){
            add1+= number1.removeLast()* i;
        }

        for(int i =1, j=0; j < number2Size; i*=10,j++){
            add2+= number2.removeLast() * i;
        }

        Integer answer = add1 + add2;

        for(int i=0;i<answer.toString().length();i++){
            result.add(Character.getNumericValue(answer.toString().charAt(i)));
        }

        return result;
    }

    public static LinkedList<Integer> sumListsReverse(LinkedList<Integer> number1, LinkedList<Integer>number2){

        int add1 = 0;
        int add2 = 0;
        int number1Size = number1.size();
        int number2Size = number2.size();
        LinkedList<Integer> result = new LinkedList<>();


        for(int i =1, j=0; j < number1Size; i*=10,j++){
            add1+= number1.removeFirst()* i;
        }

        for(int i =1, j=0; j < number2Size; i*=10,j++){
            add2+= number2.removeFirst() * i;
        }

        Integer answer = add1 + add2;

        for(int i=0;i<answer.toString().length();i++){
            result.add(Character.getNumericValue(answer.toString().charAt(i)));
        }

        return result;

    }
}
