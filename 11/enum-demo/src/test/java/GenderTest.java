import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenderTest {
    @Test
    public void testEnumerationOptions() {
        Assertions.assertEquals(2, Gender.values().length);

        for (Gender g : Gender.values())
            System.out.println(g);

        Gender female = Gender.valueOf("FEMALE");
        Assertions.assertEquals(Gender.FEMALE, female);

        System.out.println(female.ordinal());
        System.out.println(female.name());
    }
}
