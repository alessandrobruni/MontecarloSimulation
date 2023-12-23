package com.example.montecarlo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.montecarlo.service.DiceGameSimulation.*;

@SpringBootApplication
public class MontecarloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MontecarloApplication.class, args);

        // Example parameters for Game 1: 4 rolls, target face 6
        double payoutGame1 = simulateGame1(4, 6);

        // Example parameters for Game 2: 24 rolls, target faces 6 and 6
        double payoutGame2 = simulateGame2(24, 6, 6);

        printStatistics("Game 1 One Six", payoutGame1);
        printStatistics("Game 2 Double Six", payoutGame2);
    }

}
