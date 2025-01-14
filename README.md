liquidlab
#To compile LiquidLab.java, from the command line run the following command:
 javac LiquidLab.java
#To run LiquidLab, from the command line run the following command:
 java LiquidLab

#From the command line (or Terminal) you should navigate to the folder where class "DBexample1.java" exists.

In order to use properly the programm you have to enter your preferences according to the options we provide you
src


#The structure of the repository's files is the following

├── src
│   └── main
│       └── java
│           ├── AlcoholContentException.java
│           ├── Cocktail.java
│           ├── CocktailArrays.java
│           ├── CocktailArraysTransform.java
│           ├── CocktailRecommender.java
│           ├── DrinkBaseException.java
│           ├── FlavourException.java
│           ├── InsertValues.java
│           ├── LiquidLab.java
│           └── UserChoiceTransform.java
├── test
│   └── java
│       └── det
│           ├── CocktailRecommenderTest.java
│           ├── CocktailArraysTransformTest.java
│           └── UserChoiceTransform.java
├── images
├── target
├── pom.xml
└── README.md


#The uml diagram
![UML DIAGRAM] (images/d2uml.png)


#data structures
Arrays
cocktailsNames[] includes the names of the cocktails
cocktailIng[][] includes the ingridients of the cocktails
transform[][] transform the bases,flavours,intensity in a number for easier transformation

Index
LinkedList stores the indexes of the cocktailsNames[] and finds the final index



