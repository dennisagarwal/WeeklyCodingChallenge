package com.revature.main;
import com.revature.challenges.OriginalStack;
import com.revature.challenges.SumList;
import java.util.LinkedList;

public class Driver{
    public static void main(String[] args) {
        System.out.println("Testing the Sum List...");
        LinkedList<Integer> numbers1 = new LinkedList<Integer>();
        LinkedList<Integer> numbers2 = new LinkedList<Integer>();

        numbers1.push(7);
        numbers1.push(1);
        numbers1.push(6);

        numbers2.push(5);
        numbers2.push(9);
        numbers2.push(2);

        System.out.println(SumList.sumLists(numbers1,numbers2));


        System.out.println("Testing the Sum List Reverse...");
        LinkedList<Integer> numbers3 = new LinkedList<Integer>();
        LinkedList<Integer> numbers4 = new LinkedList<Integer>();

        numbers3.push(6);
        numbers3.push(1);
        numbers3.push(7);

        numbers4.push(2);
        numbers4.push(9);
        numbers4.push(5);

        System.out.println(SumList.sumListsReverse(numbers3,numbers4));

        System.out.println("Testing the Minimum Stack...");
        OriginalStack originalStack = new OriginalStack();

        originalStack.push(17);
        originalStack.push(13);
        originalStack.push(9);
        originalStack.push(-26);
        originalStack.push(18);

        System.out.println("The minimum number should be -26 and originalStack reveals the minimum as  "+originalStack.getMinimum());

        originalStack.pop(-26);

        System.out.println("The minimum number should be 9 and originalStack reveals the minimum as  "+originalStack.getMinimum());

    }
}
