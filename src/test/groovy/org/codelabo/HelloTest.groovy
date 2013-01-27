package org.codelabo

import groovy.util.GroovyTestCase
import org.codelabo.Hello

class HelloTest extends GroovyTestCase {
  def hello

  void setUp() {
    hello = "Hello, World!"
  }

  void testHello() {
    assert new Hello().hello == hello
  }
}
