package day7;

import java.io.*;

public class Hero implements Serializable {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;

    public String toString() {
        return name + " " + lvl + " " + weapon + " " + armor;
    }
}