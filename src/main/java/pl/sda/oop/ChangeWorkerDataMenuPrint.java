package pl.sda.oop;

public class ChangeWorkerDataMenuPrint {
    public ChangeWorkerDataMenuPrint() {
        System.out.print(String.format("%039d", 0).replace('0', '-'));
        System.out.print(" ZMIANA DANYCH PRACOWNIKA ");
        System.out.println(String.format("%039d", 0).replace('0', '-'));
        System.out.println(String.format("%58s", "Wybierz jedną z opcji: "));

        String p1, p2, space;
        p1 = "%-40s";
        p2 = "%-40s";
        space = "            ";
        System.out.print(space);
        System.out.print(String.format(p1, "1. Wyswietl liste pracownikow"));
        System.out.println(String.format(p2, "0. Wyjdź do menu głównego"));
        System.out.print(space);
        System.out.print(String.format(p1, "2. Zmień imię"));
        System.out.println(String.format(p2, "3. Zmień nazwisko"));
        System.out.print(space);
        System.out.print(String.format(p1, "4. Zmień wydział"));
        System.out.println(String.format(p2, "5. Zmień płeć"));
        System.out.print(space);
        System.out.print(String.format(p1, "6. Zmień pensję"));
        System.out.println(String.format(p2, "7. Zmień wiek"));
        System.out.print(space);
        System.out.print(String.format(p1, "8. Zmień liczbę dzieci"));
        System.out.println(String.format(p2, "9. Zmień stan cywilny"));
        System.out.println();
    }
}
