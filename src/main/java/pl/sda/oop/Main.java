package pl.sda.oop;

public class Main {

    public static void main(String[] args) {

        WorkerList wl = new WorkerList();

        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.addWorker("Adam","Stepień", Sex.M,Dep.HR,3500.00,26, 0, false);
        wl.exportJSON();
        WorkerPrint wp = new WorkerPrint();
        wp.setFilename("workerList.json");
       // wp.printAllWorkersTable();
        wp.printFullTitle();
        wp.printAllWorker(12);


    }
}
