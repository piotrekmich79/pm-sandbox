package com.pm.android.sandbox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SandboxLogicUnitTest {

    @Test
    public void SandboxLogic_LogicReturnTheSame() {
        SandboxLogic sl = new SandboxLogic();

        assertEquals(sl.LogicReturnTheSame("AAA"), "AAA");
    }

    @Test
    public void SandboxLogic_LogicReturnEmpty() {
        SandboxLogic sl = new SandboxLogic();

        assertEquals(sl.LogicReturnEmpty("AAA"), "");
    }

    @Before
    public void setup(){

    }

    @After
    public void teardown(){

    }
}