import application.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiemThuBien {

  @Test
  void test1() {
    Person person = new Person(16, 0);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test2() {
    Person person = new Person(16, 1);

    double result = person.CalculateTips();

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test3() {
    Person person = new Person(16, 2);

    double result = person.CalculateTips();

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test4() {
    Person person = new Person(16, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(149, result, 0.001);
  }

  @Test
  void test5() {
    Person person = new Person(16, 99);

    double result = person.CalculateTips();

    Assertions.assertEquals(69.4, result, 0.001);
  }

  @Test
  void test6() {
    Person person = new Person(16, 100);

    double result = person.CalculateTips();

    Assertions.assertEquals(69.4, result, 0.001);
  }

  @Test
  void test7() {
    Person person = new Person(16, 101);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test8() {
    Person person = new Person(8, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test9() {
    Person person = new Person(9, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(149, result, 0.001);
  }

  @Test
  void test10() {
    Person person = new Person(10, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(149, result, 0.001);
  }

  @Test
  void test11() {
    Person person = new Person(21, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(199, result, 0.001);
  }

  @Test
  void test12() {
    Person person = new Person(22, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(199, result, 0.001);
  }

  @Test
  void test13() {
    Person person = new Person(23, 50);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

}

