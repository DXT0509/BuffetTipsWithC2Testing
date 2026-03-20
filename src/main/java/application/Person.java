package application;

public class Person {
  private int time;
  private int age;

  public Person(int time, int age) {
    this.time = time;
    this.age = age;
  }

  public double CalculateTips() {
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

  public int getTime() {
    return time;
  }

  public int getAge() {
    return age;
  }

}
