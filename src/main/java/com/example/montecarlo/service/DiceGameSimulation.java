package com.example.montecarlo.service;


import java.util.Random;

/**
 * The DiceGameSimulation class provides methods to simulate and analyze dice games.
 * It includes static methods to simulate two different dice games and calculate statistical results.
 *
 * Methods:
 * - simulateGame1(int rolls, int targetFace): Simulates the first type of dice game where the objective is
 *   to roll a specific target face within a given number of rolls.
 * - playGame1(int rolls, int targetFace): Helper method for simulateGame1, conducts a single round of the first game.
 * - simulateGame2(int rolls, int targetFace1, int targetFace2): Simulates the second type of dice game where the objective is
 *   to roll two specific target faces within a given number of rolls.
 * - playGame2(int rolls, int targetFace1, int targetFace2): Helper method for simulateGame2, conducts a single round of the second game.
 * - printStatistics(String gameName, double wins): Prints the statistical results of the simulation to the console.
 * - showStatistics(String gameName, int simulations, double wins): Returns a string with the statistical results of the simulation.
 *
 * Constants:
 * - SIMULATIONS: The default number of simulations to run for each game.
 * - random: An instance of Random to generate random faces.
 *
 * This class uses a Monte Carlo simulation approach to determine the likelihood of winning in each game scenario.
 */

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

    /**
     * This prints to the console
     * */
    public static void printStatistics(String gameName,  double wins) {
        double mean = wins / SIMULATIONS;
        double variance = mean * (1 - mean);
        double stdDeviation = Math.sqrt(variance);

        System.out.println(String.format("%s Statistics: Mean: %.5f Variance: %.5f Standard Deviation: %.5f", gameName, mean, variance, stdDeviation));
    }

    /**
     * This prints to the form
     * */
    public static String showStatistics(String gameName, int simulations, double wins) {
        double mean = wins / simulations;
        double variance = mean * (1 - mean);
        double stdDeviation = Math.sqrt(variance);

        double mean_trials = simulations * mean;
        double variance_trials = simulations * variance;
        double stdDeviation_trials = Math.sqrt(simulations*variance);

        String result = String.format(
                "%s Statistics:\n" +
                        "Mean: %.5f , Variance: %.5f , Standard Deviation: %.5f\n" +
                        "| Outcome with %d trials: Mean wins : $ %,.0f , Mean losses : %,.0f , Variance: $ %,.0f , Standard Deviation: $ %,.0f  ",
                gameName,
                mean, variance, stdDeviation,
                simulations, mean_trials, simulations - mean_trials, variance_trials, stdDeviation_trials
                );
        return result;
    }
}