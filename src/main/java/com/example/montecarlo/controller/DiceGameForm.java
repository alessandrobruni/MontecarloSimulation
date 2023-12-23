package com.example.montecarlo.controller;


public class DiceGameForm {
    private int iterations = 1_000_000;
    private int firstGameRolls = 4;

    private int firstGameFace = 6;

    private int secondGameRolls = 24;
    private int secondGameFace1 =6;
    private int secondGameFace2 =6;

    // Getters and setters

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getFirstGameRolls() {
        return firstGameRolls;
    }

    public void setFirstGameRolls(int firstGameRolls) {
        this.firstGameRolls = firstGameRolls;
    }

    public int getFirstGameFace() {
        return firstGameFace;
    }

    public void setFirstGameFace(int firstGameFace) {
        this.firstGameFace = firstGameFace;
    }

    public int getSecondGameRolls() {
        return secondGameRolls;
    }

    public void setSecondGameRolls(int secondGameRolls) {
        this.secondGameRolls = secondGameRolls;
    }

    public int getSecondGameFace1() {
        return secondGameFace1;
    }

    public void setSecondGameFace1(int secondGameFace1) {
        this.secondGameFace1 = secondGameFace1;
    }

    public int getSecondGameFace2() {
        return secondGameFace2;
    }

    public void setSecondGameFace2(int secondGameFace2) {
        this.secondGameFace2 = secondGameFace2;
    }
}