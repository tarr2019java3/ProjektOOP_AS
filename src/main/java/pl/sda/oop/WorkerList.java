package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    Worker[] workerTable;
    String filename;
    private int workersIndex = 0;
    private List<Worker> workerList = new ArrayList<>();

    public Worker[] getWorkerTable() {
        return workerTable;
    }

    public void setWorkerTable(Worker[] workerTable) {
        this.workerTable = workerTable;
    }

    public String getFilename() {
        return filename;
    }

    void setFilename(String filename) {
        this.filename = filename;
        workerTable = JSONUtils.readWorkerList(filename).toArray(new Worker[0]);
        for (int x = 0; x < workerTable.length; x++) {
            workerList.add(workerTable[x]);
        }
    }

    public int getWorkersIndex() {
        return workersIndex;
    }

    public void setWorkersIndex(int workersIndex) {
        this.workersIndex = workersIndex;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public void addWorker(String name, String surname, Sex sex, Dep dep, double salary, int age, int childNum, boolean married) {
        Worker worker = new Worker(name, surname, sex, dep, salary, age, childNum, married, workersIndex);
        workersIndex++;
        workerList.add(worker);
    }

    public void exportJSON() {
        JSONUtils.writeWorkerList("workerList.json", workerList);
    }

    public void printFullTitle() {
        String a, b, c, d, e, f, g, h, i;
        a = String.format("%-3s", "ID");
        b = String.format("%-17s", "IMIĘ");
        c = String.format("%-17s", "NAZWISKO");
        d = String.format("%6s", "PŁEĆ");
        e = String.format("%6s", "WIEK");
        f = String.format("%15s", "WYDZIAŁ");
        g = String.format("%17s", "PENSJA BRUTTO");
        h = String.format("%7s", "DZIECI");
        i = String.format("%8s", "ŻONATY");
        String title = "";
        title = new StringBuilder(title).append(a).append(b).append(c).append(d).append(e).append(f).append(g).append(h).append(i).toString();
        System.out.println(title);
    }

    public void printAllWorkersTable() {
        printFullTitle();
        for (Worker it : workerTable) {
            printAllWorker(it);
        }
    }

    public void printShortTitle() {
        String b, c, g;

        b = String.format("%-17s", "IMIĘ");
        c = String.format("%-17s", "NAZWISKO");
        g = String.format("%17s", "PENSJA BRUTTO");
        String title = "";
        title = new StringBuilder(title).append(b).append(c).append(g).toString();
        System.out.println(title);
    }

    public void printShortWorkersTable() {
        printShortTitle();
        for (Worker it : workerTable) {
            printShortWorker(it);
        }
    }

    public void printSpecialTitle() {
        String b, c;

        b = String.format("%-17s", "IMIĘ");
        c = String.format("%-17s", "NAZWISKO");
        String title = "";
        title = new StringBuilder(title).append(b).append(c).toString();
        System.out.println(title);
    }

    public void printSpecialWorkersTable() {
        printSpecialTitle();
        for (Worker it : workerTable) {
            printSpecialWorker(it);
        }
    }

    public void printAllWorker(int id) {
        Worker it = workerTable[id];
        String a, b, c, d, e, f, g, h, i;
        String result = "";
        a = String.format("%-3d", it.getWorkerId());
        b = String.format("%-17s", it.getName());
        c = String.format("%-17s", it.getSurname());
        d = String.format("%6s", it.getSex());
        e = String.format("%6d", it.getAge());
        f = String.format("%15s", it.getDep());
        g = String.format("%17.2f", it.getSalary());
        h = String.format("%7d", it.getChildNum());
        i = String.format("%8b", it.isMarried());
        result = new StringBuilder(result).append(a).append(b).append(c).append(d).append(e).append(f).append(g).append(h).append(i).toString();
        System.out.println(result);

    }

    public void printAllWorker(Worker worker) {
        String a, b, c, d, e, f, g, h, i;
        String result = "";
        a = String.format("%-3d", worker.getWorkerId());
        b = String.format("%-17s", worker.getName());
        c = String.format("%-17s", worker.getSurname());
        d = String.format("%6s", worker.getSex());
        e = String.format("%6d", worker.getAge());
        f = String.format("%15s", worker.getDep());
        g = String.format("%17.2f", worker.getSalary());
        h = String.format("%7d", worker.getChildNum());
        i = String.format("%8b", worker.isMarried());
        result = new StringBuilder(result).append(a).append(b).append(c).append(d).append(e).append(f).append(g).append(h).append(i).toString();
        System.out.println(result);
    }

    public void printShortWorker(int id) {
        Worker it = workerTable[id];
        String b, c, g;
        String result = "";
        b = String.format("%-17s", it.getName());
        c = String.format("%-17s", it.getSurname());
        g = String.format("%17.2f", it.getSalary());
        result = new StringBuilder(result).append(b).append(c).append(g).toString();
        System.out.println(result);
    }

    public void printShortWorker(Worker worker) {
        String b, c, g;
        String result = "";
        b = String.format("%-17s", worker.getName());
        c = String.format("%-17s", worker.getSurname());
        g = String.format("%17.2f", worker.getSalary());
        result = new StringBuilder(result).append(b).append(c).append(g).toString();
        System.out.println(result);
    }

    public void printSpecialWorker(int id) {

        Worker it = workerTable[id];
        String b, c;
        String result = "";
        b = String.format("%-17s", it.getName().toUpperCase());
        c = String.format("%-17s", it.getSurname().toUpperCase());
        result = new StringBuilder(result).append(b).append(c).toString();
        System.out.println(result);

    }

    public void printSpecialWorker(Worker worker) {
        String b, c;
        String result = "";
        b = String.format("%-17s", worker.getName().toUpperCase());
        c = String.format("%-17s", worker.getSurname().toUpperCase());
        result = new StringBuilder(result).append(b).append(c).toString();
        System.out.println(result);

    }
}
