package pl.sda.oop;

import pl.sda.oop.exceptions.EmptyWorkerListException;

import java.io.File;
import java.util.Scanner;

public class Menu {
    public Menu() {
        ConsoleMenuUtils cmu = new ConsoleMenuUtils();
        WorkerList wl = new WorkerList();
        WorkerPrint wp = new WorkerPrint();
        File list =  new File("ListaPracownikow.json");
        if (list.exists()){
            wl.setWorkerList(JSONUtils.readWorkerList("ListaPracownikow.json"));
        }
        wp.setWorkers(wl.getWorkerList());
        new MainMenuPrint();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Wybrana opcja: ");
            int option = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (option) {
                case 1:     //wyświetl pracowników
                    wp.printAllWorkersTable();
                    break;
                case 2:                           //dodaj pracownika
                    Worker worker = cmu.createNewWorker();
                    wl.addWorker(worker);
                    break;
                case 3:                                             //eksport danych do txt
                    System.out.print("Podaj nazwę pliku: ");
                    String name = scanner.nextLine();
                    wl.exportTxt(name);
                    break;
                case 4:
                    System.out.print("Podaj numer id pracownika do usunięcia: ");
                    int index = scanner.nextInt();
                    wl.deleteWorker(index);                            //usuń pracownika
                    break;
                case 5:                                               //edycja danych
                    System.out.println("U którego pracownika chcesz deytować dane?: ");
                    int id = scanner.nextInt();
                    wl.printFullTitle();
                    worker = wl.getWorker(id);
                    wl.printAllWorker(worker);
                    Worker newWorker = cmu.createNewWorker();
                    newWorker.setWorkerId(worker.getWorkerId());
                    wl.setWorker(id, newWorker);
                    break;
                case 6:                                            //dodatkowe funkcje
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    JSONUtils.writeWorkerList("ListaPracownikow.json", wl.getWorkerList());
                    System.out.println("DO WIDZENIA!");
                    System.exit(0);
                default:
                    System.out.println("Wybierz jeszcze raz");
                    break;
            }
            JSONUtils.writeWorkerList("ListaPracownikow.json", wl.getWorkerList());
        }
    }

}
