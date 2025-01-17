# liquidlab

## Compilation instructions

To compile LiquidLab.java, from the command line navigate to liquilab and then run the following command
- mvn clean install


## Execution instructions

To run LiquidLab, from the command line run the following command:
- java -jar target/liquidlab.jar


## Usage instructions

In order to use properly the programm you have to enter your preferences according to the options we provide you
1. BASE
2. FLAVOUR
3. INTENSITY


## The structure of the repository's files is the following

```

liquidlab
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
│           └── UserChoiceTransformTest.java
├── images
├── target
├── pom.xml
└── README.md

```


## The uml diagram

![UML DIAGRAM](images/d2uml.png)


## Data structures

- Arrays
cocktailsNames[] includes the names of the cocktails
cocktailIng[][] includes the ingridients of the cocktails
transform[][] transform the bases,flavours,intensity in a number for easier transformation

- Index
LinkedList stores the indexes of the cocktailsNames[] and finds the final index


## Licenses

This project is licensed under the MIT License 
- see the [LICENSE](https://opensource.org/license/mit) file for details.



