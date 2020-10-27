package com.fabiangabor.test;

import com.fabiangabor.FaktKivetel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaktorialisTest {
    public FaktorialisTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }


    @Test
    public void fakt5() throws FaktKivetel {
        int in = 5;
        long expect = 120;
        long result = com.fabiangabor.Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test
    public void fakt0() throws FaktKivetel {
        int in = 0;
        long expect = 23;
        long result = com.fabiangabor.Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test
    public void faktNagy() throws com.fabiangabor.FaktKivetel {
        int in = 13;
        long expect = 6227020800L;
        long result = com.fabiangabor.Faktorialis.faktorialis(in);
        assertEquals(expect,result);
    }

    @Test
    public void faktNegativ() throws com.fabiangabor.FaktKivetel {
        int in = -1;
        long result = com.fabiangabor.Faktorialis.faktorialis(in);

        Assertions.assertThrows(com.fabiangabor.FaktKivetel.class, () -> {
            com.fabiangabor.Faktorialis.faktorialis(in);
        });
    }
}