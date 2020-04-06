package pl.sda.oop;

import java.util.Scanner;

public class ConsoleMenuUtils {

    public Worker createNewWorker() {
        Worker worker = new Worker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        worker.setName(name);
        System.out.println();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        worker.setSurname(surname);
        System.out.println();

        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        worker.setAge(age);
        System.out.println();


        viewDepartmentList();
        boolean choice = true;
        while (choice == true) {
            System.out.println("W jakim wydziale będzie pracować?: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    worker.setDep(Dep.HR);
                    choice = false;
                    break;

                case 2:
                    worker.setDep(Dep.Marketing);
                    choice = false;
                    break;

                case 3:
                    worker.setDep(Dep.Production);
                    choice = false;
                    break;
                default:
                    System.out.println("Zły Wybór!");
            }
        }
        System.out.print("Podaj wysokość pensji: ");
        double salary = scanner.nextDouble();
        worker.setSalary(salary);
        System.out.println();

        System.out.print("Podaj plec  K/M: ");
        char sex = scanner.next().charAt(0);
            switch (sex) {
                case 'K':
                case 'k':
                    worker.setSex(Sex.K);
                    break;
                case 'M':
                case 'm':
                    worker.setSex(Sex.M);
                    break;
                default:
                    System.out.println("Zły wybór!");
            }
        System.out.println();

        System.out.print("Podaj liczbę dzieci: ");
        int childnum = scanner.nextInt();
        worker.setChildNum(childnum);
        System.out.println();
        System.out.print("Czy pracownik jest żonaty?/mężatką? T/N: ");
        char tn = scanner.next().charAt(0);

            switch (tn) {
                case 'T':
                case 't':
                    worker.setMarried(true);
                    break;
                case 'N':
                case 'n':
                    worker.setMarried(false);
                    break;
                default:
                    System.out.println("Zły wybór!");
            }

        System.out.println();
        return worker;

    }
    private void viewDepartmentList(){
        System.out.println("Wydziały: \n");
        System.out.println("1. " + Dep.HR.toString());
        System.out.println("2. " + Dep.Marketing.toString());
        System.out.println("3. " + Dep.Production.toString());
    }


}
