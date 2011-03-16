package com.logicalpractice.q224721;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
/**
 * @author gareth
 */

public class ConcreteChildTest {

    ConcreteChild testObject = new ConcreteChild();

    @Test
    public void testThingy() throws Exception {
        assertEquals("Foo OriginalOutput", testObject.thingy());
    }


    @Test
    public void testThingyMockedParent() {
        new MockUp<AbstractParent>(){
            @Mock
            String method() {
                return "MOCK";
            }
        };

        assertEquals("Foo MOCK", testObject.thingy());
    }
}
