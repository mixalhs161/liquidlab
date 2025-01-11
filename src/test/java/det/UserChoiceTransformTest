import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserChoiceTransformTest {

    @Test
    public void testTransformChoice_ValidInput() {
        UserChoiceTransform transformer = new UserChoiceTransform();

        // Έγκυροι συνδυασμοί επιλογών
        assertEquals(111, transformer.transformChoice("Whiskey", "Sweet", "Light"), "The combination Whiskey, Sweet, Light should return 111.");
        assertEquals(232, transformer.transformChoice("Gin", "Bitter", "Medium"), "The combination Gin, Bitter, Medium should return 232.");
        assertEquals(343, transformer.transformChoice("Vodka", "Sour", "Strong"), "The combination Vodka, Sour, Strong should return 343.");
        assertEquals(444, transformer.transformChoice("Rum", "Sweet", "Light"), "The combination Rum, Sweet, Light should return 444.");
        assertEquals(515, transformer.transformChoice("Tequila", "Bitter", "Medium"), "The combination Tequila, Bitter, Medium should return 515.");
    }

    @Test
    public void testTransformChoice_InvalidBase() {
        UserChoiceTransform transformer = new UserChoiceTransform();

        // Μη έγκυρη βάση
        assertEquals(0, transformer.transformChoice("NonAlcoholic", "Sweet", "Light"), "The combination with an invalid base should return 0.");
    }

    @Test
    public void testTransformChoice_InvalidFlavor() {
        UserChoiceTransform transformer = new UserChoiceTransform();

        // Μη έγκυρη γεύση
        assertEquals(0, transformer.transformChoice("Whiskey", "Salty", "Light"), "The combination with an invalid flavor should return 0.");
    }

    @Test
    public void testTransformChoice_InvalidIntensity() {
        UserChoiceTransform transformer = new UserChoiceTransform();

        // Μη έγκυρη ένταση
        assertEquals(0, transformer.transformChoice("Gin", "Sweet", "ExtraStrong"), "The combination with an invalid intensity should return 0.");
    }

    @Test
    public void testTransformChoice_AllInvalid() {
        UserChoiceTransform transformer = new UserChoiceTransform();

        // Όλες οι επιλογές μη έγκυρες
        assertEquals(0, transformer.transformChoice("NonAlcoholic", "Salty", "ExtraStrong"), "The combination with all invalid values should return 0.");
    }
}
