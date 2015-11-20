/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ronak Bakshi
 */
public class BalancedParens {
    
    public static void main(String[] args) throws FileNotFoundException {
        AStack<Character> parenStack = new AStack<>();
        Scanner sc = new Scanner(new File("expressions.txt"));
        String str = "";
        String msg;
        int count1;
        int count2;
        while (sc.hasNext()) {
            count1 = 0;
            count2 = 0;
            msg = ": VALID";
            str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    parenStack.push(str.charAt(i));
                    count1++;
                } else if ((str.charAt(i) == ')') && (!parenStack.isEmpty())) {
                    parenStack.pop();
                    count2++;
                    if (count1 < count2) {
                        msg = ": INVALID:\nTrying to pop, but the stack is empty!";
                    }
                }
                else if ((str.charAt(i) == ')') && (parenStack.isEmpty())){
                    count2++;
                    if (count1 < count2) {
                        msg = ": INVALID:\nTrying to pop, but the stack is empty!";
                    }
                }
            }
            if (count1 <= count2) {
                System.out.println(str + msg);
                System.out.println();
            } else if (count1 > count2) {
                System.out.println(str + ": INVALID:" + "\nParsing complete, but the stack is not empty!");
                System.out.println();
            }  
            while(!(parenStack.isEmpty()))
                parenStack.pop();
            System.out.println(parenStack.peek());
        }
    }
}
