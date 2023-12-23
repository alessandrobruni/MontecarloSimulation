
# Probability of One Six in 4 Roll of a Single Dice vs Double-Six in 24 Rolls of a Pair Dice

The questions are classic problems in probability theory and they highlight the counterintuitive nature of probability in certain situations.

1. **Losing the Bet on Rolling at Least One Six in Four Rolls of a Single Die**:

   The gambler's expectation to frequently see a six in four rolls of a single die is a common misconception. The probability of NOT rolling a six in a single roll is
   $(\frac{5}{6})$
   (since there are 5 outcomes that are not six). To find the probability of not rolling a six in four consecutive rolls, we multiply the probability of not rolling a six in each roll:

   $[ P(\text{No six in 4 rolls}) = \left(\frac{5}{6}\right)^4 ]$

   Calculating this:

   $[ P(\text{No six in 4 rolls}) \approx 0.482 ]$

   So, the probability of rolling at least one six in four tries is the complement of this:

   $[ P(\text{At least one six in 4 rolls}) = 1 - P(\text{No six in 4 rolls}) \approx 1 - 0.482 \approx 0.518 ]$

   Although this probability is slightly over 50%, it's not as high as most people intuitively expect. This is why the gambler was losing this bet more often than he anticipated.

2. **Winning the Bet on Getting at Least One Double-Six in 24 Rolls of a Pair of Dice**:

   For a pair of dice, the probability of NOT rolling a double-six in a single roll is $( \frac{35}{36} )$ (since there are 35 outcomes that are not a double-six out of the 36 possible outcomes).

   To find the probability of not rolling a double-six in 24 rolls, we multiply the probability of not rolling a double-six in each roll:

   $[ P(\text{No double-six in 24 rolls}) = \left(\frac{35}{36}\right)^{24} ]$

   Calculating this:

   $[ P(\text{No double-six in 24 rolls}) \approx 0.509 ]$

   So, the probability of rolling at least one double-six in 24 rolls is the complement of this:

   $[ P(\text{At least one double-six in 24 rolls}) = 1 - P(\text{No double-six in 24 rolls}) \approx 1 - 0.509 \approx 0.491 ]$

   This probability is very close to 50%. Given the large number of trials (24 rolls), it's more likely for at least one double-six to appear, explaining why the gambler seemed to win this bet more often.

***Basically the two probabilities are the same, near 50 to 50 win lose.***

Maybe human intuition about probability can often be misleading, especially in scenarios involving independent events and multiple trials.