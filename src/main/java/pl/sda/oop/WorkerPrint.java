package pl.sda.oop;

import java.util.List;

public class WorkerPrint {
    List<Worker> workerList;

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
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
        if (workerList.isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            printFullTitle();
            for (int x = 0; x < workerList.size(); x++) {

                printAllWorker(x);
            }
        }

    }
    public void printAllWorkersTable(List<Worker> list) {
        if (list.isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else
            {
            printFullTitle();
            for (int x = 0; x < list.size(); x++) {

                printAllWorker(list.get(x));
            }
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
        if (workerList.isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            printShortTitle();
            try {
                for (int x = 0; x < workerList.size(); x++) {
                    printShortWorker(x);
                }
            } catch (NullPointerException e) {
                System.out.println("Lista pracowników jest pusta!");
            }
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
        if (workerList.isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            printSpecialTitle();
            try {
                for (int x = 0; x < workerList.size(); x++) {
                    printSpecialWorker(x);
                }
            } catch (NullPointerException e) {
                System.out.println("Lista pracowników jest pusta!");
            }
        }
    }

    public void printAllWorker(int id) {
        if (id < workerList.size() && id >= 0) {
            Worker it = workerList.get(id);
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
        } else {
            System.out.println("Niepoprawny numer pracownika!");
        }


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

        if (id < workerList.size() && id >= 0) {
            Worker it = workerList.get(id);
            String b, c, g;
            String result = "";
            b = String.format("%-17s", it.getName());
            c = String.format("%-17s", it.getSurname());
            g = String.format("%17.2f", it.getSalary());
            result = new StringBuilder(result).append(b).append(c).append(g).toString();
            System.out.println(result);
        } else {
            System.out.println("Niepoprawny numer pracownika!");
        }
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
        if (id < workerList.size() && id >= 0) {
            Worker it = workerList.get(id);
            String b, c;
            String result = "";
            b = String.format("%-17s", it.getName().toUpperCase());
            c = String.format("%-17s", it.getSurname().toUpperCase());
            result = new StringBuilder(result).append(b).append(c).toString();
            System.out.println(result);
        } else {
            System.out.println("Niepoprawny numer pracownika!");
        }

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

