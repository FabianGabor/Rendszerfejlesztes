import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class FaktorialisTest extends TestCase {

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    void faktorialis() {
    }

    @Test
    public void fakt5() {
        int in = 5;
        long expect = 120;
        long result = Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test
    public void fakt0() {
        int in = 0;
        long expect = 23;
        long result = Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test
    public void faktNagy() throws FaktKivetel {
        int in = 13;
        long expect = 6227020800L;
        long result = Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test (expected = FaktKivetel)
    public void faktNegativ() throws FaktKivetel("negativ"){
        int in = -1;
        long result = Faktorialis.faktorialis(in);

    }
}