package com.example.montecarlo.controller;

import com.example.montecarlo.model.DiceGameForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import static com.example.montecarlo.service.DiceGameSimulation.simulateGame1;
import static com.example.montecarlo.service.DiceGameSimulation.simulateGame2;
import static com.example.montecarlo.service.DiceGameSimulation.showStatistics;

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

        double resultGame1 = simulateGame1(diceGameForm.getFirstGameRolls(), diceGameForm.getFirstGameFace() );;
        model.addAttribute("resultGame1", showStatistics( "| ", diceGameForm.getIterations(),resultGame1));

        double resultGame2 = simulateGame2(diceGameForm.getSecondGameRolls(), diceGameForm.getSecondGameFace1(),diceGameForm.getSecondGameFace2() );;
        model.addAttribute("resultGame2", showStatistics( "|", diceGameForm.getIterations(),resultGame2));

        return "dicegame";
    }


}

