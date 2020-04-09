package pl.sda.oop;

import java.io.File;
import java.util.Scanner;

public class Menu {
    public Menu() {
        CreateWorker createWorker = new CreateWorker();
        WorkerList wl = new WorkerList();
        WorkerPrint wp = new WorkerPrint();
        File list =  new File("ListaPracownikow.json");
        if (list.exists()){
            wl.setWorkerList(JSONUtils.readWorkerList("ListaPracownikow.json"));
        }
        wp.setWorkerList(wl.getWorkerList());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            new MainMenuPrint();
            System.out.print("Wybrana opcja: ");
            int option = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (option) {
                case 1:     //wyświetl pracowników
                    wp.printAllWorkersTable();
                    System.out.println("Naciśnij dowolny klawisz aby wyjść do menu głównego");
                    scanner.nextLine();
                    break;
                case 2:                           //dodaj pracownika
                    Worker worker = createWorker.createNewWorker();
                    wl.addWorker(worker);
                    System.out.println("Dodano nowego pracownika!");
                    scanner.nextLine();
                    break;
                case 3:                                             //eksport danych do txt
                    System.out.print("Podaj nazwę pliku:  ");
                    String name = scanner.nextLine();
                    name = name + ".txt";
                    wl.exportTxt(name);
                    System.out.println("Dane wyeksportowane do pliku " + name);
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Podaj numer id pracownika do usunięcia: ");
                    int index = scanner.nextInt();
                    wl.deleteWorker(index);                            //usuń pracownika
                    System.out.println("Pracownik usunięty z listy!");
                    scanner.nextLine();
                    break;
                case 5:                                               //edycja danych
                    new ChangeWorkerDataMenuPrint();
                    new ChangeWorkerDataUtilities(wl.getWorkerList());
//                    System.out.println("U którego pracownika chcesz edytować dane?: ");
//                    int id = scanner.nextInt();
//                    wp.printFullTitle();
//                    worker = wl.getWorker(id);
//                    wp.printAllWorker(worker);
//                    Worker newWorker = createWorker.createNewWorker();
//                    newWorker.setWorkerId(worker.getWorkerId());
//                    wl.setWorker(id, newWorker);
//                    System.out.println("Pomyślnie zmieniono dane!");
                    scanner.nextLine();
                    break;
                case 6:                                            //dodatkowe funkcje
                    new ExtraFunctionsMenuPrint();
                    new ExtraFunctionsUtilities(wl.getWorkerList());
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
            ClearConsole.clearConsole();
        }
    }

}
