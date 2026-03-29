import application.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C2Testing {

  public double CalculateTips(int time, int age) {
    if ( time <= 8 || time >= 23 || age <= 0 || age > 100 ) {
      return -1;
    }
    else if ( time >= 9 && time <= 16) {
      double x = 149;
      if ( age < 6 ) return 0;
      else if ( age >= 6 && age <= 10 ) return x*0.5;
      else if ( age >= 11 && age <= 60 ) return x;
      else return x*0.6-20;
    }
    else {
      double x = 199;
      if ( age < 6 ) return 0;
      else if ( age >= 6 && age <= 10 ) return x*0.7;
      else if ( age >= 11 && age <= 60 ) return x;
      else return x*0.6;
    }
  }

  @Test
  void test1() {
    double result = CalculateTips(1,0);

    Assertions.assertEquals(-1, result, 0.001);
  }
  @Test
  void test2() {
    double result = CalculateTips(12,3);

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test3() {
    double result = CalculateTips(13,7);

    Assertions.assertEquals(74.5, result, 0.001);
  }

  @Test
  void test4() {
    double result = CalculateTips(12,15);

    Assertions.assertEquals(149, result, 0.001);
  }

  @Test
  void test5() {
    double result = CalculateTips(13,70);

    Assertions.assertEquals(69.4, result, 0.001);
  }

  @Test
  void test6() {
    double result = CalculateTips(18,2);

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test7() {
    double result = CalculateTips(19,9);

    Assertions.assertEquals(139.3, result, 0.001);
  }

  @Test
  void test8() {
    double result = CalculateTips(20,20);

    Assertions.assertEquals(199, result, 0.001);
  }

  @Test
  void test9() {
    double result = CalculateTips(21,70);

    Assertions.assertEquals(119.4, result, 0.001);
  }

}

