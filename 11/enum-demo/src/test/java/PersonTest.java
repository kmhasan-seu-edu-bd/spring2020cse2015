import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testCreatePersonObject() {
        Person a = new Person("John Doe", Gender.MALE);
        Person b = new Person("Jane Doe", Gender.FEMALE);
        Assertions.assertEquals(Gender.MALE, a.getGender());
        Assertions.assertEquals(Gender.FEMALE, b.getGender());
        System.out.println(a);
        System.out.println(b);
    }
}
