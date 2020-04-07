package pl.sda.oop;

import java.util.List;

public class ChangeWorkerData {   //klasa do zmiany danych pracownika
    private List<Worker> workerList;
    public ChangeWorkerData() {

    }
    public void setWorkerList(List<Worker> workers) {
        this.workerList = workers;
    }


}
