package pl.sda.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker adam = new Worker("Adam", "Stępień", Sex.M, 1, 3500.5, 26, 0, false);
        Worker dominika = new Worker("Dominika", "C", Sex.K, 2, 3250, 21, 0, false);
        Worker daisy = new Worker("Daisy", "Dog", Sex.K, 3, 100, 10, 6, true);
        List<Worker> workers = new ArrayList<>();
        workers.add(adam);
        workers.add(dominika);
        workers.add(daisy);
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("workers.json", workers);
    }
}
