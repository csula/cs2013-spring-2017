# Homework 2

* Due: 3/23 -- late homework not accepted
* Up to two students may collaborate; please be prepared to discuss individual contributions

## Overview

A certain game is called `Unique Last Hand` works as followed.

1. Player starts with a **hand** which is consisted of `K` cards from a randomly shuffled *super deck*, if any of the cards are repeats, the duplicates are tossed back into the **super deck** -- deck must be shuffled again after cards `K` cards have been dealt
2. Player draws cards (one at a time) from a *super deck* and each time a card is drawn, a card must be discarded.  For now, the card with the lowest priority is discarded.
3. When `P` cards have been drawn the round stops

Some additional information:

* **Super Deck** is assembled by joining `N` decks of cards
* A **Hand** is consisted of exactly `K` cards
* `P` = `N` x `K` x `M`
* When choosing to remove a card from the deck, use the following priority scheme
  - Repeated cards have higher priority than any non-repeated card
  - Order by rank, i.e. `King > Queen > ... > 2 > Ace`
  - Order by suit, i.e. `Diamonds > Hearts > Clubs > Spades`
* To score a round: add up all the cards in the final hand as followed
  - Face cards are worth 12 points
  - Ace cards are worth 15 points
  - Number cards are worth their numeric value times a `multipler`.  The `multiplier` for Spades is 4, for Clubs is 3, for Hearts is 2, for Diamonds is 1

### Single Player `Unique Last Hand`

Write a single player version of `Unique Last Hand`, using the following parameters:
- `N` = 5
- `K` = 5
- `M` = 25

The game should print out (see sample output below):
- The initial hand
- The Hand, cards as they are being drawn and discarded (after each play)
- The final hand and its score
- A list of repeated cards (at the end of the round)

Your `SinglePlayer.java` should be executed with the parameters as command line arguments.  For example

```bash
$ java SinglePlayer 5 5 25
Initial Hand: [KD][QC][5D][2H][2S]
Play 1:
  Change: +[2H] +[5S] -[2S]
  Hand: [KD][QC][5D][5S][2H]
	Repeats: [2H]
Play 2:
  Change: +[2H] +[5S] +[3D] -[3D]
	Hand: [KD][QC][5D][5S][2H]
	Repeats: [2H] [5S]
	...
Play M:
  Change: +[7D] -[KD]
	Hand: [7D][5S][4S][2H][2C]
	Repeats: [7D][5S] ... [2C]
Score: 53
```

### Multi-Player Player `Unique Last Hand`

More details to follow.

## Grading Scale/Criteria

* 5 completed correctly + enhancements
* 4 all requirements are met
* 3 all but a few requirements are met
* 2 significant number of requires are missing
* 0 not completed

## Submission

Students will need to demonstrate their homework assignment in class.
