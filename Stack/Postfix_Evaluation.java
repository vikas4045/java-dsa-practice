import java.util.Scanner;
import java.util.Stack;

public class Postfix_Evaluation {

    static int evaluate(String postfix) {

        Stack<Integer> stack = new Stack<>();
        

        for (int i = 0; i < postfix.length(); i++) {

            char c = postfix.charAt(i);

            // If character is an operand
            if (Character.isDigit(c)) {

                int num = c - '0';

                stack.push(num);

            }
            // If character is an operator
            else {
                
                int opnd2 = stack.pop();
                int opnd1 = stack.pop();

                int result = 0;
                
                switch (c) {

                    case '+':
                        result += opnd1 + opnd2 ;
                        break;

                    case '-':
                        result += opnd1 - opnd2;
                        break;

                    case '*':
                        result += opnd1 * opnd2;
                        break;

                    case '/':
                        result += opnd1 / opnd2;
                        break;

                    case '%':
                        result += opnd1 % opnd2;
                        break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String postfix = sc.next();

        int result = evaluate(postfix);

        System.out.println("Result = " + result);

        sc.close();
    }
}

