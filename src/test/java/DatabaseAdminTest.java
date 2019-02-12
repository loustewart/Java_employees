import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before()  {
        databaseAdmin = new DatabaseAdmin("Jenny", "JB456789B", 42000);
    }


    @Test
    public void canGetName() {
        assertEquals("Jenny", databaseAdmin.getName());
    }

    @Test
    public void canGetNINo() {
        assertEquals("JB456789B", databaseAdmin.getNino());
    }

    @Test
    public void canGetSalary() {
        assertEquals(42000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(44000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(420, databaseAdmin.payBonus(), 0.1);
    }
}
