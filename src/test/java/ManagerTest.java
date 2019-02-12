import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Louise", "JR962408A", 25000, "HR");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canGetName() {
        assertEquals("Louise", manager.getName());
    }

    @Test
    public void canGetNINo() {
        assertEquals("JR962408A", manager.getNino());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(30000, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, manager.payBonus(), 0.1);

    }
}
