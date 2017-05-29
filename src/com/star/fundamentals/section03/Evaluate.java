package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {

    public static void main(String[] args) {

        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

        while (!StdIn.isEmpty()) {

            String string = StdIn.readString();

            if ("(".equals(string)) {

            } else if ("+".equals(string) || "-".equals(string) || "*".equals(string) ||
                    "/".equals(string) || "sqrt".equals(string)) {
                operators.push(string);
            }  else if (")".equals(string)) {

                String operator = operators.pop();
                double secondValue = values.pop();
                double result;

                switch (operator) {
                    case "+":
                        result = values.pop() + secondValue;
                        break;
                    case "-":
                        result = values.pop() - secondValue;
                        break;
                    case "*":
                        result = values.pop() * secondValue;
                        break;
                    case "/":
                        result = values.pop() / secondValue;
                        break;
                    case "sqrt":
                        result = Math.sqrt(secondValue);
                        break;
                    default:
                        result = 0;
                }

                values.push(result);
            } else {
                values.push(Double.parseDouble(string));
            }
        }

        StdOut.println(values.pop());
    }
}
