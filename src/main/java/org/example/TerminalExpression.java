package org.example;

class TerminalExpression implements Expression
{
    String expression;

    public TerminalExpression(String expression)
    {
        this.expression = expression;
    }

    public boolean interpreter(String data)
    {
        return data.contains(expression);
    }
}
