package com.curtis.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void Tests() {
      assertEquals( "Nope!" , DRoot.digital_root(16), 7);
      assertEquals( "Nope!" , DRoot.digital_root(942), 6);
    }
}
