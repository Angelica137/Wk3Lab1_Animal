# Exercise two - Kennel

## Here is a UML diagram for an Animal class:

| Animal              |
| ------------------- |
| -name: String       |
|                     |
| +Animal(String)     |
| +getName() : String |
| +toString() :String |

---

Create a new project called Kennel and add the above Animal.

The toString() method should return a string displaying the Animal’s details.

Create 2 subclasses of the Animal class as indicated below, with the specialist attributes and methods.

### Dog Class

- With an extra attribute – exerciseTime (int) to hold the dogs required daily exercise time in minutes.
- Add methods to set and get exercise time.
- Override the toString method to display all the dog’s details.

### Cat Class

- With an extra attribute livesLeft (int) – This should be initialised to 9 and indicates how many lives the cat has left.
- Add methods to getLivesLeft() and loseLife(). The loseLife method should decrement the livesLeft attribute by 1. If there are no lives left a message should be displayed.saying “the cat is dead”.
- Override the toString() method to display all the cats’ details.
- Create a TestAnimal Class. This should create both a cat and dog object and test all their methods.
