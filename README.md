# DiceGraph
Hello everyone, I'm finally back with a new personal project to share with y'all! I have been planning on doing this idea I had for a while now but University kept me busy but now that summer vaction is here, I finally did it!
The program called DiceGraph is program that takes two dices (Dice.java) and rolls them for a set amount of time that the user wants before graphing out the rolls to see which rolls had the most amount of rolls and the least amount of rolls and all inbetween. The program uses three classes, DiceGraph, StoredRolls, and Dice.java. The main class, DiceGraph will take an input from the user that ask to see what the max amount of numbers they want and how many times they want to spin the two dice which then roll them, store the sum of the two dice in an arraylist to their corresponding sum, and then graph out the sum using the method RollGraph() and ShowGraphPart() from the StoredRolls class. The StoredRolls class focuses on identifying which sum of number was made and tying it to their respective object, the class has 4 methods, RollRecord() which is called whenever a sum matches to one object in the arraylist and add a one to the var TimesNumRolled to that object, RollGraph() which will add "|" to the var Graph which representive the amount of time that object was matched to the sum, getRollNum() which return the var RollNum which is the identifier which an object can differentiate from each other, and lastly, ShowGraphPart() which returns the amount of time that specify value is rolled in the format of "Roll [val]: [amount of time it was rolled]". The Dice class is a die which gets a value from a random number generator and has one method called Roll() which gets a value from that random number generator.

Please put in any comments about what you want me to do next and what I can I improve, and see y'all when I come back with a new project!
