package ru.mirea.inbo_05_19.Kuznetsov.Task2;

public class ChairFactory implements AbstractChairFactory {
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    public MagicChair createMagicCHair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionChair() {
        return new FunctionalChair();
    }
}
