package pl.sda.oop;

public class Worker {
    private String name;
    private String surname;
    private Sex sex;
    private Department depId;
    private double salary;
    private int age;
    private int childNum;
    private boolean married;
    private int workerId;

    public Worker(String name, String surname, Sex sex, Department depId, double salary, int age, int childNum, boolean married) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.depId = depId;
        this.salary = salary;
        this.age = age;
        this.childNum = childNum;
        this.married = married;
        workerId = depId + getWorkersNum();
    }

    // gettery , settery
    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Department getDepId() {
        return depId;
    }

    public void setDepId(Department depId) {
        this.depId = depId;
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
    public void setAge(int age) {
        this.age = age;
    }
    // ^^^ gettery , settery ^^^


    public void showAll(){

    }
    public void showShort(){

    }
    public void showSpecial(){
        
    }
    public boolean compareSalary(double value){
        return false;
    }
    public void calcIncrease(double incPercent){
        
    }
}

