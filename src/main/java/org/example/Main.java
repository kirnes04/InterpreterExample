package org.example;

public class Main {
    public static void main(String[] args) {
        Expression c = new TerminalExpression("C++");
        Expression csharp = new TerminalExpression("C#");

        Expression orExpression = new Plus(c, csharp);

        System.out.println(orExpression.interpreter("C++"));
        System.out.println(orExpression.interpreter("C#"));
        System.out.println(orExpression.interpreter("C"));

        Expression java = new TerminalExpression("Java");
        Expression javaScript = new TerminalExpression("JavaScript");

        Expression andExpression = new Multiply(java, javaScript);

        System.out.println(andExpression.interpreter("Java, JavaScript"));
        System.out.println(andExpression.interpreter("Python, Pascal"));
    }
}