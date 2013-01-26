package org.codelabo

import groovy.util.GroovyTestCase
import org.codelabo.Hello

class HelloTest extends GroovyTestCase {
  void testHello() {
    assert new Hello().hello == "Hello, World!"
  }
}
