package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company com = new Company("myCompany");
        com.addDepartment("HR");
        com.addWorker("Adam", "Stępień", Sex.M,com.getDepartments().get(0), 3500, 26, 0, false);
        com.workerExportJSON();
        com.companyExportJSON();
    }
}
