package org.example;

class Multiply implements Expression
{
    Expression left, right;

    public Multiply(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    public boolean interpreter(String data)
    {
        return left.interpreter(data) & right.interpreter(data);
    }
}