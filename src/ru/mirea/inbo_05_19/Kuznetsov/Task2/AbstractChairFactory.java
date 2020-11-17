package ru.mirea.inbo_05_19.Kuznetsov.Task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicCHair();

    FunctionalChair createFunctionChair();
}