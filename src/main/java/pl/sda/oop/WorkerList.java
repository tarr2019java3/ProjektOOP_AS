package pl.sda.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    private List<Worker> workerList;
    private int workersIndex;

    public WorkerList() {
        File file = new File("ListaPracownikow.json");
        if (file.exists()) {
            workerList = JSONUtils.readWorkerList("ListaPracownikow.json");
            workersIndex = workerList.size();
        } else {
            workerList = new ArrayList<>();
            workersIndex = 0;
        }
    }


    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public void setWorker(int id, Worker worker) {
        this.workerList.set(id, worker);
    }

    public Worker getWorker(int id) {
        return workerList.get(id);
    }

    public void addWorker(String name, String surname, Sex sex, Dep dep, double salary, int age, int childNum, boolean married) {
        Worker worker = new Worker(name, surname, sex, dep, salary, age, childNum, married, workersIndex);
        workersIndex++;
        workerList.add(worker);
    }

    public void addWorker(Worker worker) {
        worker.setWorkerId(workersIndex);
        workersIndex++;
        workerList.add(worker);
    }

    public void deleteWorker(int id) {
        workerList.remove(id);
        workersIndex--;
        for (int index = id; index < workerList.size(); index++) {
            workerList.get(index).setWorkerId(workerList.get(index).getWorkerId() - 1);
        }
    }


    public void exportTxt(String name) {
        File file = new File(name);
        try {
            PrintWriter pw = new PrintWriter(file);
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
            pw.println(title);

            for (Worker it : workerList) {
                String result = "";
                a = String.format("%-3d", it.getWorkerId());
                b = String.format("%-17s", it.getName());
                c = String.format("%-17s", it.getSurname());
                d = String.format("%6s", it.getSex());
                e = String.format("%6d", it.getAge());
                f = String.format("%15s", it.getDep());
                g = String.format("%17.2f", it.getSalary());
                h = String.format("%7d", it.getChildNum());
                i = String.format("%8s", it.isMarried());
                result = new StringBuilder(result).append(a).append(b).append(c).append(d).append(e).append(f).append(g).append(h).append(i).toString();
                pw.println(result);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}