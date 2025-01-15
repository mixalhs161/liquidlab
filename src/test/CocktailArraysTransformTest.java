import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CocktailArraysTransformTest {

    @Test
    public void testTransformCoctailIng_ValidInput() {
        String[][] input = {
            {"Whiskey", "Light", "Sweet"},
            {"Gin", "Medium", "Bitter"},
            {"Vodka", "Strong", "Sour"},
            {"Rum", "Light", "Sweet"},
            {"Tequila", "Medium", "Bitter"}
        };

        int[][] expectedOutput = {
            {1, 1, 1},  // Whiskey, Light, Sweet
            {2, 2, 2},  // Gin, Medium, Bitter
            {3, 3, 3},  // Vodka, Strong, Sour
            {4, 1, 1},  // Rum, Light, Sweet
            {5, 2, 2}   // Tequila, Medium, Bitter
        };

        int[][] result = CocktailArraysTransform.transformCoctailIng(input);

        assertArrayEquals(expectedOutput, result, "The transformation of the cocktail ingredients is incorrect.");
    }

    @Test
    public void testTransformCoctailIng_InvalidInput() {
        String[][] input = {
            {"Whiskey", "Strong", "Sweet"},
            {"Gin", "Light", "Sour"},
            {"Vodka", "Medium", "Bitter"},
            {"Rum", "Medium", "Sour"},
            {"Tequila", "Strong", "Sweet"}
        };

        int[][] expectedOutput = {
            {1, 3, 1},  // Whiskey, Strong, Sweet
            {2, 1, 3},  // Gin, Light, Sour
            {3, 2, 2},  // Vodka, Medium, Bitter
            {4, 2, 3},  // Rum, Medium, Sour
            {5, 3, 1}   // Tequila, Strong, Sweet
        };

        int[][] result = CocktailArraysTransform.transformCoctailIng(input);

        assertArrayEquals(expectedOutput, result, "The transformation of the cocktail ingredients is incorrect.");
    }

    @Test
    public void testTransformCoctailIng_EmptyInput() {
        String[][] input = {};

        int[][] expectedOutput = {};

        int[][] result = CocktailArraysTransform.transformCoctailIng(input);

        assertArrayEquals(expectedOutput, result, "The transformation of an empty input should return an empty array.");
    }

    @Test
    public void testTransformCoctailIng_UnknownValues() {
        String[][] input = {
            {"Unknown", "Unknown", "Unknown"}
        };

        int[][] expectedOutput = {
            {0, 0, 0}  // Unknown, Unknown, Unknown should map to 0
        };

        int[][] result = CocktailArraysTransform.transformCoctailIng(input);

        assertArrayEquals(expectedOutput, result, "The transformation of unknown values should return zeros.");
    }
}
