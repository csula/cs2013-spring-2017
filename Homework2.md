# Homework 2

* Due: 4/4 -- late homework not accepted
* Up to two students may collaborate; please be prepared to discuss individual contributions

## Overview

Consider the card game `Unique Last Hand` with the following rules.

1. Start of game: a player starts with a **hand** which is consisted of `K` cards drawn from a randomly shuffled **super deck**.  If any of the cards are repeats, then duplicates are tossed back into the **super deck** and another card is draw.  After `K` cards have been distributed, the deck must be shuffled again.
2. Each round: the player draws a card from the **super deck**.  With each draw, a card must be discarded.  For now, the card with the lowest priority is discarded.  If a drawn card is a repeat then, repeat drawing cards until the drawn card is not a repeat.
3. The game stops after `R` rounds and the score of final hand is tallied.

Some additional information:

* A **Super Deck** is assembled by joining `N` decks of 52 cards
* A **Hand** is consisted of exactly `K` cards
* The number of rounds is calculated as followed: `R` = `N` x `K` x `M`
* When choosing to remove a card from the deck, use the following priority scheme
  - A repeat card has a higher priority than any non-repeat cards
  - Order by rank, i.e. `King > Queen > ... > 2 > Ace`
  - Order by suit, i.e. `Diamonds > Hearts > Clubs > Spades`
* To score the game: add up all the cards in the final hand as followed
  - Face cards are worth 12 points
  - Ace cards are worth 15 points
  - Number cards are worth their numeric value times a `multipler`.  The `multiplier` for Spades is 4, for Clubs is 3, for Hearts is 2, for Diamonds is 1

### Single Player `Unique Last Hand`

Write a single player version of the `Unique Last Hand` card game using the following parameters:
- `N` = 5
- `K` = 5
- `M` = 20

The game should print out (see sample output below) the following:
- The initial hand
- For each round: the current hand, the drawn and discarded cards, a list of repeated cards
- At the end of the game: the final score

Your `SinglePlayer.java` should set parameters using command line arguments.  Here is an example output of a game being played:

```bash
$ java SinglePlayer 5 5 25

Initial Hand: [KD][QC][5D][2H][2S]
Round 1:
  Change: +[2H] +[5S] -[2S]
  Hand: [KD][QC][5D][5S][2H]
	Repeats: [2H]
Round 2:
  Change: +[2H] +[5S] +[3D] -[3D]
	Hand: [KD][QC][5D][5S][2H]
	Repeats: [2H] [5S]
	...
Round R:
  Change: +[7D] -[KD]
	Hand: [7D][5S][4S][2H][2C]
	Repeats: [7D][5S] ... [2C]
Score: 53
```

### Multi-Player Player `Unique Last Hand`

For the multiplayer game, simply loop around to run the single player multiple times.

### Bonus assignment

You will need to replace `MySet` with the built-in `TreeSet` implementation and do timing.  Please discuss performance as it is related to whether an algorithm is O(n) or O(n^2) or O(log n) etc.


## Grading Scale/Criteria

* 5 completed correctly + enhancements
* 4 all requirements are met
* 3 all but a few requirements are met
* 2 significant number of requires are missing
* 0 not completed

## Submission

Students will need to demonstrate their homework assignment in class.
