package org.example;

class Plus implements Expression
{
    Expression left, right;

    public Plus(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    public boolean interpreter(String data)
    {
        return left.interpreter(data) | right.interpreter(data);
    }
}