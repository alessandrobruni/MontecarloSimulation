package com.example.montecarlo.controller;

import com.example.montecarlo.model.DiceGameForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import static com.example.montecarlo.service.DiceGameSimulation.*;

/**
 * DiceGameController is a Spring MVC controller that manages the web requests for a dice game simulation.
 * It handles the display of the dice game form and the processing of the simulation results.
 *
 * The controller has two main request mappings:
 * 1. A GetMapping for the root ("/") path that displays the dice game form.
 * 2. A PostMapping for the "/simulate" path that processes the submitted dice game form,
 *    simulates the dice games, and displays the results.
 *
 * The controller relies on a DiceGameForm object to capture user input for the simulations.
 * It includes methods for simulating two different dice games and displaying their statistical results.
 */

@Controller
public class DiceGameController {


    @GetMapping("/")
    public String showForm(Model model) {
        if(model.getAttribute("diceGameForm") == null)
            model.addAttribute("diceGameForm", new DiceGameForm());
        return "dicegame";
    }

    @PostMapping("/simulate")
    public String simulate(DiceGameForm diceGameForm, Model model) {
        // Call  simulation logic here and get results

        double resultGame1 = simulateGame1(diceGameForm.getFirstGameRolls(), diceGameForm.getFirstGameFace() );
        model.addAttribute("resultGame1", showStatistics( "| ", diceGameForm.getIterations(),resultGame1).replace("\n", "<br>"));

        double resultGame2 = simulateGame2(diceGameForm.getSecondGameRolls(), diceGameForm.getSecondGameFace1(),diceGameForm.getSecondGameFace2() );
        model.addAttribute("resultGame2", showStatistics( "|", diceGameForm.getIterations(),resultGame2).replace("\n", "<br>"));

        return "dicegame";
    }


}

