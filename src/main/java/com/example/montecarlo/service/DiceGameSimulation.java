package com.example.montecarlo.service;


import java.util.Random;

public class DiceGameSimulation {

    private static final int SIMULATIONS = 1_000_000;
    private static final Random random = new Random();



    public static double simulateGame1(int rolls, int targetFace) {
        int wins = 0;
        for (int i = 0; i < SIMULATIONS; i++) {
            if (playGame1(rolls, targetFace)) {
                wins++;
            }
        }
        return wins;
    }

    private static boolean playGame1(int rolls, int targetFace) {
        for (int i = 0; i < rolls; i++) {
            if (random.nextInt(6) + 1 == targetFace) {
                return true;
            }
        }
        return false;
    }

    public static double simulateGame2(int rolls, int targetFace1, int targetFace2) {
        int wins = 0;
        for (int i = 0; i < SIMULATIONS; i++) {
            if (playGame2(rolls, targetFace1, targetFace2)) {
                wins++;
            }
        }
        return wins;
    }

    private static boolean playGame2(int rolls, int targetFace1, int targetFace2) {
        for (int i = 0; i < rolls; i++) {
            if (random.nextInt(6) + 1 == targetFace1 && random.nextInt(6) + 1 == targetFace2) {
                return true;
            }
        }
        return false;
    }

    public static void printStatistics(String gameName,  double wins) {
        double mean = wins / SIMULATIONS;
        double variance = mean * (1 - mean);
        double stdDeviation = Math.sqrt(variance);

        System.out.println(String.format("%s Statistics: Mean: %.5f Variance: %.5f Standard Deviation: %.5f", gameName, mean, variance, stdDeviation));
    }

    public static String showStatistics(String gameName, int simulations, double wins) {
        double mean = wins / simulations;
        double variance = mean * (1 - mean);
        double stdDeviation = Math.sqrt(variance);

        return String.format("%s Statistics: Mean: %.5f Variance: %.5f  Standard Deviation: %.5f ", gameName, mean, variance, stdDeviation);
    }
}