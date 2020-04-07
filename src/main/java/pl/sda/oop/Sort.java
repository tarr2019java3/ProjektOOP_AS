package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public List<Worker> quicksortSalary(List<Worker> collection) {
        if (collection.size() <= 1) {
            return collection;
        }
        List<Worker> result = new ArrayList<>();
        List<Worker> smaller = new ArrayList<>();
        List<Worker> bigger = new ArrayList<>();
        Worker pivot = collection.remove(collection.size() / 2);
        for (Worker obj : collection) {
            if (obj.getSalary() < pivot.getSalary()) {
                smaller.add(obj);
            } else {
                bigger.add(obj);
            }
        }
        smaller = quicksortSalary(smaller);
        bigger = quicksortSalary(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }
    public List<Worker> quicksortAge(List<Worker> collection) {
        if (collection.size() <= 1) {
            return collection;
        }
        List<Worker> result = new ArrayList<>();
        List<Worker> smaller = new ArrayList<>();
        List<Worker> bigger = new ArrayList<>();
        Worker pivot = collection.remove(collection.size() / 2);
        for (Worker obj : collection) {
            if (obj.getAge() < pivot.getAge()) {
                smaller.add(obj);
            } else {
                bigger.add(obj);
            }
        }
        smaller = quicksortAge(smaller);
        bigger = quicksortAge(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }
    public List<Worker> quicksortName(List<Worker> collection) {
        if (collection.size() <= 1) {
            return collection;
        }
        List<Worker> result = new ArrayList<>();
        List<Worker> smaller = new ArrayList<>();
        List<Worker> bigger = new ArrayList<>();
        Worker pivot = collection.remove(collection.size() / 2);
        for (Worker obj : collection) {
            if (obj.getName().charAt(0) < pivot.getName().charAt(0)) {
                smaller.add(obj);
            } else {
                bigger.add(obj);
            }
        }
        smaller = quicksortName(smaller);
        bigger = quicksortName(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }
    public List<Worker> quicksortSurname(List<Worker> collection) {
        if (collection.size() <= 1) {
            return collection;
        }
        List<Worker> result = new ArrayList<>();
        List<Worker> smaller = new ArrayList<>();
        List<Worker> bigger = new ArrayList<>();
        Worker pivot = collection.remove(collection.size() / 2);
        for (Worker obj : collection) {
            if (obj.getSurname().charAt(0) < pivot.getSurname().charAt(0)) {
                smaller.add(obj);
            } else {
                bigger.add(obj);
            }
        }
        smaller = quicksortSurname(smaller);
        bigger = quicksortSurname(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }
    public List<Worker> quicksortDep(List<Worker> collection) {
        if (collection.size() <= 1) {
            return collection;
        }
        List<Worker> result = new ArrayList<>();
        List<Worker> smaller = new ArrayList<>();
        List<Worker> bigger = new ArrayList<>();
        Worker pivot = collection.remove(collection.size() / 2);
        for (Worker obj : collection) {
            if (obj.getDep().toString().charAt(0) < pivot.getDep().toString().charAt(0)) {
                smaller.add(obj);
            } else {
                bigger.add(obj);
            }
        }
        smaller = quicksortSurname(smaller);
        bigger = quicksortSurname(bigger);
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(bigger);
        return result;
    }

}
