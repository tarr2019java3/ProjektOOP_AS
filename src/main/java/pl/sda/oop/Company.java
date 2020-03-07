package pl.sda.oop;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int workersNum;  //liczba robotnikow
    private int depNum;    //liczba departamentow
    private List<Worker> workers = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
        this.workersNum = 0;
        this.depNum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkersNum() {
        return workersNum;
    }

    public void setWorkersNum(int workersNum) {
        this.workersNum = workersNum;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(String name){
        Department department = new Department(depNum, name, this);
        departments.add(department);
        depNum = depNum++; 
    }
    public void addWorker(String name, String surname, Sex sex, Department dep, double salary, int age, int childNum, boolean married){
        Worker worker = new Worker(name, surname, sex, dep, salary, age, childNum, married);
        workers.add(worker);
        this.workersNum++;
        dep.setWorkersDepNum(dep.getWorkersDepNum()+1);
    }
    public void companyExportJSON(){
        List<Company> companies = new ArrayList<>();
        companies.add(this);
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeCompanyList("companyList.json", companies);
    }
    public void workerExportJSON(){
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeWorkerList("workerList.json", workers);
    }
    public void departmentExportJSON(){
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeDepartmentList("departmentList.json", departments);
    }
}
