import application.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiemThuBangQuyetDinh {

  @Test
  void test1() {
    Person person = new Person(6, 30);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test2() {
    Person person = new Person(12, -2);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test3() {
    Person person = new Person(15, 4);

    double result = person.CalculateTips();

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test4() {
    Person person = new Person(13, 9);

    double result = person.CalculateTips();

    Assertions.assertEquals(74.5, result, 0.001);
  }

  @Test
  void test5() {
    Person person = new Person(10, 35);

    double result = person.CalculateTips();

    Assertions.assertEquals(149, result, 0.001);
  }

  @Test
  void test6() {
    Person person = new Person(11, 70);

    double result = person.CalculateTips();

    Assertions.assertEquals(69.4, result, 0.001);
  }

  @Test
  void test7() {
    Person person = new Person(14, 150);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test8() {
    Person person = new Person(18, 0);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test9() {
    Person person = new Person(19, 2);

    double result = person.CalculateTips();

    Assertions.assertEquals(0, result, 0.001);
  }

  @Test
  void test10() {
    Person person = new Person(20, 7);

    double result = person.CalculateTips();

    Assertions.assertEquals(139.3, result, 0.001);
  }

  @Test
  void test11() {
    Person person = new Person(21, 55);

    double result = person.CalculateTips();

    Assertions.assertEquals(199, result, 0.001);
  }

  @Test
  void test12() {
    Person person = new Person(22, 80);

    double result = person.CalculateTips();

    Assertions.assertEquals(119.4, result, 0.001);
  }

  @Test
  void test13() {
    Person person = new Person(17, 300);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

  @Test
  void test14() {
    Person person = new Person(30, 5);

    double result = person.CalculateTips();

    Assertions.assertEquals(-1, result, 0.001);
  }

}

