package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 1000)
  public void method1() {
  }
}
