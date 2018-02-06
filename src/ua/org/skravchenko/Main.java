package ua.org.skravchenko;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String enteredText = sc.nextLine();

        if (!enteredText.substring(0, 1).equals("(")) {
            System.out.println("False");
            return;
        } else {
            for (int i = 0; i < enteredText.length(); i++) {
                if (enteredText.charAt(i) == ('(')) {
                    st.push(enteredText.charAt(i));
                } else if (st.empty()) {
                    System.out.println("False");
                    return;
                } else st.pop();

            }

        }
        if (st.empty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

