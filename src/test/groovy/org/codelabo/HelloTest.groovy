package org.codelabo

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import static org.junit.Assert.assertEquals
import org.codelabo.Hello

@RunWith(JUnit4)
class HelloTest {
  @Test
  void testHello() {
    assert new Hello().hello == "Hello, World!"
    assertEquals new Hello().hello, "Hello, World!"
    assertEquals(new Hello().hello, "Hello, World!")
  }
}
