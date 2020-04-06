package pl.sda.oop;

public class MainMenuPrint {
    public MainMenuPrint() {
        System.out.print(String.format("%039d", 0).replace('0', '-'));
        System.out.print(" MENU GLOWNE ");
        System.out.println(String.format("%039d", 0).replace('0', '-'));
        System.out.println(String.format("%58s", "Wybierz jedną z opcji: "));

        String p1, p2, space;
        p1 = "%-40s";
        p2 = "%-35s";
        space = "                ";
        System.out.print(space);
        System.out.print(String.format(p1, "1. Wyswietl liste pracownikow"));
        System.out.println(String.format(p2, "2. Dodaj pracownika"));
        System.out.print(space);
        System.out.print(String.format(p1, "3. Eksport"));
        System.out.println(String.format(p2, "4. Usun pracownika"));
        System.out.print(space);
        System.out.print(String.format(p1, "5. Edycja danych"));
        System.out.println(String.format(p2, "6. Dodatkowe funkcje"));
        System.out.print(space);
        System.out.print(String.format(p1, "7. Dodatkowe funkcje plików .txt"));
        System.out.println(String.format(p2, "8. Informacje o programie"));
        System.out.print(space);
        System.out.print(String.format(p1, "9. Zmiana nazwy bazy danych"));
        System.out.println(String.format(p2, "0. Wyjście"));
        System.out.println();
    }
}
