package ru.mirea.inbo_05_19.Kuznetsov.Task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex() {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}