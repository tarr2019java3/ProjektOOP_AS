package pl.sda.oop;

public class Department {
    private int depId;
    private String depName;
    private int workersNum;

    public Department(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
        this.workersNum = 0;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getWorkersNum() {
        return workersNum;
    }
    public void addWorker(String name, String surname, Sex sex, Department depId, double salary, int age, int childNum, boolean married){

    }
}
