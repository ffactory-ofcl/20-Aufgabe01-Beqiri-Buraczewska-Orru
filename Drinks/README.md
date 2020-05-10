# Software Configuration Management #

## Drinks Template for Exercise ##

The goal of this project is to learn and practice the usage of Github, JUnit and JavaDoc.

The premade Java project "Drinks" contains the following classes, complete with getters, setters and descriptions:
```
Drink.java
Liquid.java
SimpleDrinks.java [extends Drink]

LiquidTest.java
```

### Planned extensions:
**Classes**:
- ComplexDrink extends Drink
    - takes a `List<Liquid>` as ingredients
- ColoredDrink extends ComplexDrink
    - takes a `String color` of the final mix
- GlassDrink extends ComplexDrink
    - takes the `GlassType` which the drink is served in

- KidsDrink extends Drink
    - takes `bool withToy` specifying whether or not the drink is served with a toy
- Juice extends KidsDrink
    - takes two `Fruit`s which the drink is made up of
- Soda extends
    - takes a `String manufacturer`

**Exceptions**:
- InvalidColorException
    - Occurs when the color is not valid

- TooManyIngredientsException
    - Occurs when attempting to create a ComplexDrink with more than 10 ingredients

Project by Beqiri Fisnik, Buraczewska Diana, Orru Filippo