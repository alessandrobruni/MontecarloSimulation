
# Probability of One Six in 4 Roll of a Single Dice vs Double-Six in 24 Rolls of a Pair Dice

The questions are classic problems in probability theory and they highlight the counterintuitive nature of probability in certain situations.

1. **Losing the Bet on Rolling at Least One Six in Four Rolls of a Single Die**:

   The gambler's expectation to frequently see six in four rolls of a single die is a common misconception. The probability of NOT rolling a six in a single roll is
   $(\frac{5}{6})$
   (since 5 outcomes are not six). To find the probability of not rolling a six in four consecutive rolls, we multiply the probability of not rolling a six in each roll:

   $[ P(\text{No six in 4 rolls}) = \left(\frac{5}{6}\right)^4 ]$

   Calculating this:

   $[ P(\text{No six in 4 rolls}) \approx 0.482 ]$

   So, the probability of rolling at least one six in four tries is the complement of this:

   $[ P(\text{At least one six in 4 rolls}) = 1 - P(\text{No six in 4 rolls}) \approx 1 - 0.482 \approx 0.518 ]$

   Although this probability is slightly over 50%, it's not as high as most people intuitively expect. This is why the gambler lost this bet more often than anticipated.

2. **Winning the Bet on Getting at Least One Double-Six in 24 Rolls of a Pair of Dice**:

   For a pair of dice, the probability of NOT rolling a double-six in a single roll is $( \frac{35}{36} )$ (since 35 outcomes are not a double-six out of the 36 possible outcomes).

   To find the probability of not rolling a double-six in 24 rolls, we multiply the probability of not rolling a double-six in each roll:

   $[ P(\text{No double-six in 24 rolls}) = \left(\frac{35}{36}\right)^{24} ]$

   Calculating this:

   $[ P(\text{No double-six in 24 rolls}) \approx 0.509 ]$

   So, the probability of rolling at least one double-six in 24 rolls is the complement of this:

   $[ P(\text{At least one double-six in 24 rolls}) = 1 - P(\text{No double-six in 24 rolls}) \approx 1 - 0.509 \approx 0.491 ]$

   This probability is very close to 50%. Given the large number of trials (24 rolls), it's more likely for at least one double-six to appear, explaining why the gambler seemed to win this bet more often.

***Basically the two probabilities are the same, near 50 to 50 win lose.***



## Variance and standard deviation

From probability theory, specifically for the **variance of a Bernoulli process**, which is a series of trials with only two possible outcomes (like win or lose in your games)
 the variance can be calculated as:

<br>

$[ \text{Variance} = p \times (1 - p) ]$



where $( p )$ is the probability of one of the outcomes (in this case, the probability of winning).

<br>

The variance in this context is a measure of how much the outcomes (win or lose) deviate from the mean (average outcome). In simpler terms, it's a way of quantifying how "spread out" the wins and losses are. If every play resulted in a win or every play resulted in a loss (no variability), the variance would be zero. The more balanced the wins and losses, the higher the variance.

<br>

To find the **standard deviation** from the variance simply take the square root of the variance.:

<br>

$[\text{Standard Deviation} = \sqrt{\text{Variance}} ]$

<br>

Let's calculate the exact value.


In the first scenario for a Bernoulli distribution we have


1.   a **mean** of $\{0.518}\$

2.   the **variance** is approximately $\{0.249676}\$

3.  and the **standard deviation** is approximately $\{0.499676}\$     


<br>


In the second scenario for a Bernoulli distribution we have


1.   a **mean** of $\{0.491}\$

2.   the **variance** is approximately $\{0.249919}\$

3.  and the **standard deviation** is approximately $\{0.499919}\$     

In the case of a Bernoulli distribution  a standard deviation of near $\{0.5}\$ suggests a near-equal probability of both outcomes (success and failure) meaning that  the 2 scenarios a essentially the same as flipping a coin.

## Probabilities calculated with Monte Carlo method
The Monte Carlo simulation, also known as the Monte Carlo method or multiple probability simulation, is a mathematical technique used to estimate the possible outcomes of an uncertain event.
Regardless of the tool used, Monte Carlo techniques involve three fundamental steps:

- Set up the predictive model, identifying both the dependent variable that needs to be predicted and the independent variables (also known as input, risk, or predictive variables) on which the prediction will be based.
- Define the probability distributions of the independent variables.
- Perform simulations repeatedly, generating random values of the independent variables.
- Do this until enough results are collected to constitute a representative sample of the almost infinite number of possible combinations.

In the case of the two scenarios described above...

### 1. Independent and Dependent Variables
- **Independent Variables**: The dice rolls.
- **Dependent Variable**: The events being bet on.

### 2. Probability Distribution
- Random  faces at each roll will be generated using a java.util.Random class using the method nextInt(6) .

### 3. Simulation Execution
- The simulation is carried out 1 million (1,000,000) times.


To enhance flexibility and user interaction in the scenarios,  a very simple user-friendly web application is developed. This web application will serve as the primary interface for inputting independent variables in both scenarios. By leveraging the out-of-the-box features of the Spring Boot, we aim to create an intuitive and accessible platform. This approach not only simplifies data entry but also broadens the potential for diverse scenario analysis with ease.
The source code an the jar file are in this repository.
To access the simulation at localhost:8080 the application can be stated with `java -jar montecalo-0.0.1-SNAPSHOT.jar`.

![picture](https://github.com/alessandrobruni/MontecarloSimulation/assets/106590540/39ea1fb1-10b6-4a3b-ad32-b29f0e4db76c)
