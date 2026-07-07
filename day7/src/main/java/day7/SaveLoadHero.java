package day7;

import java.io.*;

public class SaveLoadHero {
    public static void main(String[] args) throws Exception {
        // создаём героя
        Weapon w = new Weapon();
        w.name = "Меч";
        w.damage = 15;

        Armor a = new Armor();
        a.name = "Щит";
        a.defense = 10;

        Hero hero = new Hero();
        hero.name = "Арагорн";
        hero.lvl = 10;
        hero.weapon = w;
        hero.armor = a;

        System.out.println("До сохранения: " + hero);

        // сохраняем
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day7/src/main/resources/hero.dat"));
        out.writeObject(hero);
        out.close();
        System.out.println("Сохранён");

        // меняем значения
        hero.name = "111";
        hero.lvl = 999;
        System.out.println("После изменений: " + hero);

        // загружаем
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day7/src/main/resources/hero.dat"));
        Hero loaded = (Hero) in.readObject();
        in.close();

        System.out.println("Загруженный: " + loaded);
    }
}