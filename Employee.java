package day4;

public class Employee {
  private int id, age, salary, fixedBugs, defaultBugRate;
  private String name;
  private boolean gender;

  public int getId() { return id; }

  public Employee(String name, int id, boolean gender){
    this.name = name;
    this.id =  Integer.parseInt(String.valueOf(setRandom(1, 99)) + id);
    this.gender = gender;
    this.age = setRandom(18, 45);
    this.salary = setRandom(18000, 53000);
    this.fixedBugs = setRandom(20, 100);
    this.defaultBugRate = setRandom(40, 110);
  }

  private int setRandom(int min, int max){
    return (int) (min + Math.random() * (max+1-min));
  }

  @Override
  public String toString(){
    return String.format("Employee #%d: %s\n%s, age: %d,\nsalary: %d,\nfixedBugs: %d,\ndefBugRate: %d.\n---\n",
            id, name, gender ? "Male" : "Female", age, salary, fixedBugs, defaultBugRate);
  }


}
