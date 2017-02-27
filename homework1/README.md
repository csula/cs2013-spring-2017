# Homework 1

* Due: ~~2/28~~ 3/2 -- late homework not accepted
* Up to two students may collaborate; please be prepared to discuss individual contributions

## Details

### Recursion and Generics

A deck of card is said to a priority scheme its ranks.  For example, a King has a higher priority than a Queen.  Similarly a Queen has a higher priority than a Jack and so on so forth.  Finally, a 2 has higher priority than an Ace.  Within a rank, the order of priority is Diamond, then Heart, then Club, then Spade.

```
King of Diamond > King of Heart > .. > Queen of Diamond > ... > Ace of Spade
```

Given a deck of 52 cards and the cards are arranged in random order and using this random deck of card, perform the following tasks:

* With recursion, determine the location (index position) of the highest priority card and the lowest priority card.  Your code must only contain one recursive `search(...)` method.  The output should look like this:

```
King of Diamond at location 12
Ace of Spade at location 45
```

* Randomly select `N` cards and using recursion, print out all possible combinations for the selected cards.  Test your code against three, four and five randomly selected cards.

Note the following:

- The recursive `search` method should look for for a card with `max` and `min` values and must not be hard-coded to search for `King of Diamond` and `Ace of Spade`.  This is because if the order of priority changes, you do not need to change the search function itself.

- Your code for above must be implemented with `generics` because it would work for different data type, e.g. something other than cards.

### Priority Queue

Write a priority queue (from scratch) that will allow for you to insert and remove numbers (`Integer`) from a queue with the priority being defined as followed:

- An even number has higher priority than an odd number
- Multiples of `threes` has higher priority than other numbers
- A number with a lower numeric value of a number has higher priority

Your program should only focus on `Integer`, i.e. don't use cards for this problem.

## Grading Scale/Criteria

* 5 completed correctly + enhancements
* 4 all requirements are met
* 3 all but a few requirements are met
* 2 significant number of requires are missing
* 0 not completed

## Submission

Students will need to demonstrate their homework assignment in class.
