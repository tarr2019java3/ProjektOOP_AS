package pl.sda.oop;

public class Worker {
    private String name;
    private String surname;
    private Sex sex;
    private Dep dep;
    private double salary;
    private int age;
    private int childNum;
    private boolean married;
    private int workerId;

    public Worker() {
    }

    public Worker(String name, String surname, Sex sex, Dep dep, double salary, int age, int childNum, boolean married, int workerId) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dep = dep;
        this.salary = salary;
        this.age = age;
        this.childNum = childNum;
        this.married = married;
        this.workerId = workerId;
    }

    public Worker(String name, String surname, Sex sex, Dep dep, double salary, int age, int childNum, boolean married) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dep = dep;
        this.salary = salary;
        this.age = age;
        this.childNum = childNum;
        this.married = married;
    }

    // gettery , settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Dep getDep() {
        return dep;
    }

    public void setDep(Dep dep) {
        this.dep = dep;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getChildNum() {
        return childNum;
    }

    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

}

