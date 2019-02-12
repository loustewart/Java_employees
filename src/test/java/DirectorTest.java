import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gillian", "TN987654F", 50000, "HR", 300000);
    }


    @Test
    public void canGetBudget() {
        assertEquals(300000, director.getBudget(), 0.1);
    }

    @Test
    public void canGetName() {
        assertEquals("Gillian", director.getName());
    }

    @Test
    public void canGetNino() {
        assertEquals("TN987654F", director.getNino());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, director.getSalary(), 0.1);
    }
    
    @Test
    public void canGetDeptName() {
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, director.payBonus(), 0.1);
    }
}
