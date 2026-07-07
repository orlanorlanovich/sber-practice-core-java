package day7;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Убираем пробелы");
        RemoveSpaces.main(args);

        System.out.println("\n2. Сортируем имена");
        SortNames.main(args);

        System.out.println("\n3. Сохраняем героя");
        SaveLoadHero.main(args);
    }
}