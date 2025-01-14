public class CocktailArrays {

    // Ονόματα κοκτέιλ
String[] cocktailsNames = {
    "Whiskey Sour", "Penicillin", "Sazerac", "Old Fashioned", "Rob Roy",
    "Manhattan", "Clover Club", "Gold Rush", "Whiskey Smash",
     "Negroni", "Gimlet", "Martinez", "Bee's Knees", "Tom Collins",
     "Gin Fizz", "Gin & Tonic", "Hanky Panky", "Clover Club 2",
     "Cosmopolitan", "Moscow Mule", "Black Russian", "Bloody Mary",
     "Sea Breeze", "Vodka Collins", "Lemon Drop Martini", "Vodka Tonic",
     "Kangaroo", "Piña Colada", "Mai Tai", "Zombie", "El Presidente",
     "Dark & Stormy", "Jungle Bird", "Daiquiri", "Hemingway Daiquiri",
     "Rum Sour", "Paloma", "Tequila Sunrise", "Margarita", "El Diablo",
    "Batanga", "Tequila Old Fashioned", "Tommy's Margarita", "Classic Margarita",
    "Tequila Sour"
    };

String[][] cocktailIng = {
     // Whiskey
    {"Whiskey", "Medium", "Sour"},
    {"Whiskey", "Strong", "Bitter"},
    {"Whiskey", "Light", "Sweet"},
    {"Whiskey", "Medium", "Sweet"},
    {"Whiskey", "Strong", "Sweet"},
    {"Whiskey", "Light", "Sour"},
    {"Whiskey", "Medium", "Bitter"},
    {"Whiskey", "Strong", "Sour"},
    {"Whiskey", "Light", "Bitter"},

    // Gin
    {"Gin", "Medium", "Sour"},
    {"Gin", "Strong", "Bitter"},
    {"Gin", "Light", "Sweet"},
    {"Gin", "Medium", "Sweet"},
    {"Gin", "Light", "Bitter"},
    {"Gin", "Strong", "Sour"},
    {"Gin", "Medium", "Bitter"},
    {"Gin", "Light", "Sour"},
    {"Gin", "Strong", "Sweet"},

    // Vodka
    {"Vodka", "Light", "Sour"},
    {"Vodka", "Medium", "Sweet"},
    {"Vodka", "Strong", "Bitter"},
    {"Vodka", "Medium", "Bitter"},
    {"Vodka", "Light", "Bitter"},
    {"Vodka", "Strong", "Sweet"},
    {"Vodka", "Medium", "Sour"},
    {"Vodka", "Light", "Sweet"},
    {"Vodka", "Strong", "Sour"},

    // Rum
    {"Rum", "Light", "Sour"},
    {"Rum", "Medium", "Sweet"},
    {"Rum", "Strong", "Sour"},
    {"Rum", "Light", "Bitter"},
    {"Rum", "Medium", "Bitter"},
    {"Rum", "Strong", "Sweet"},
    {"Rum", "Light", "Sweet"},
    {"Rum", "Medium", "Sour"},
    {"Rum", "Strong", "Bitter"},

    // Tequila
    {"Tequila", "Medium", "Sour"},
    {"Tequila", "Light", "Sweet"},
    {"Tequila", "Strong", "Bitter"},
    {"Tequila", "Medium", "Bitter"},
    {"Tequila", "Light", "Sour"},
    {"Tequila", "Strong", "Sweet"},
    {"Tequila", "Medium", "Sweet"},
    {"Tequila", "Strong", "Sour"},
    {"Tequila", "Light", "Bitter"}
    };



    int[][] transformedCoctailIng = CocktailArraysTransform.transformCoctailIng(cocktailIng);
}