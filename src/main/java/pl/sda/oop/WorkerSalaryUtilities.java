package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;

public class WorkerSalaryUtilities {
    private List<Worker> workerList;

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public List<Worker> getWorkersWithSalaryLesserThan(double salaryVal) {
        List<Worker> group = new ArrayList<>();
        for (Worker it : workerList) {
            if (it.getSalary() < salaryVal) {
                group.add(it);
            }
        }
        return group;
    }

    public List<Worker> getWorkersWithSalaryBiggerThan(double salaryVal) {
        List<Worker> group = new ArrayList<>();
        for (Worker it : workerList) {
            if (it.getSalary() > salaryVal) {
                group.add(it);
            }
        }
        return group;
    }

    public List<Worker> getWorkersByDep(Dep dep) {
        List<Worker> group = new ArrayList<>();
        for (Worker it : workerList) {
            if (it.getDep() == dep) {
                group.add(it);
            }
        }
        return group;
    }

    public List<Worker> getWorkersBySex(Sex sex) {
        List<Worker> group = new ArrayList<>();
        for (Worker it : workerList) {
            if (it.getSex() == sex) {
                group.add(it);
            }
        }
        return group;
    }

    public List<Worker> getWorkersByCivilStat(boolean married) {
        List<Worker> group = new ArrayList<>();
        for (Worker it : workerList) {
            if (it.isMarried() == married) {
                group.add(it);
            }
        }
        return group;
    }

    public void increaseSalary(int percent, List<Worker> workerList) {
        for (Worker it : workerList) {
            double incr = it.getSalary() * percent / 100;
            it.setSalary(it.getSalary() + incr);
        }
    }

    public void increaseSalary(double value, List<Worker> workerList) {
        for (Worker it : workerList) {
            it.setSalary(it.getSalary() + value);
        }
    }

    public Worker getWorkerWithHighestSalary(List<Worker> workerList) {
        Worker lucky = workerList.get(0);
        for (Worker it : workerList) {
            if (lucky.getSalary() < it.getSalary()) {
                lucky = it;
            }
        }
        return lucky;
    }

    public double calcSumSalary(List<Worker> workerList) {
        double sum = 0;
        for (Worker it : workerList) {
            sum = sum + it.getSalary();
        }
        return sum;
    }

    public double calcMediumSalary(List<Worker> workerList) {
        double result = calcSumSalary(workerList) / workerList.size();
        return result;
    }

    /*
        @calcIncreaseValue
        obydwie grupy muszą mieć tyle samo rekordów aby funkcja nie wywołałą błedu
     */
    public double calcIncreaseValue(List<Worker> beforeIncrease, List<Worker> afterIncrease) {
        if (!(beforeIncrease.size() == afterIncrease.size())) {
            return 0;
        } else {
            double increase = 0;
            for (int x = 0; x < beforeIncrease.size(); x++) {
                increase = afterIncrease.get(x).getSalary() - beforeIncrease.get(x).getSalary();
            }
            return increase;
        }
    }
    /* TODO
     * f. zwiekszająca pensje dla podanej grupy
     *       procentowo
     *       o podaną wartość
     *
     * f. zwracająca pracownika o największej pensji z podanej grupy
     * f. obliczająca średnią płacę z podanej grupy
     * +sumowanie wartości podwyżek
     *
     * */
}



