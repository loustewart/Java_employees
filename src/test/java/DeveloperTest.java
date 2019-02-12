import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Betty", "JC123456C", 40000);
    }

    @Test
    public void canGetName() {
        assertEquals("Betty", developer.getName());
    }

    @Test
    public void canGetNINo() {
        assertEquals("JC123456C", developer.getNino());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(42000, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, developer.payBonus(), 0.1);
    }
}
