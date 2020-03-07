package pl.sda.oop;

public class Department {
    private int depId;
    private String depName;
    private int workersDepNum;
    private Company company;

    public Department(int depId, String depName, Company company) {
        this.depId = depId;
        this.depName = depName;
        this.workersDepNum = 0;
        this.company = company;
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

    public void setWorkersDepNum(int workersDepNum) {
        this.workersDepNum = workersDepNum;
    }

    public int getWorkersDepNum() {
        return workersDepNum;
    }
}
