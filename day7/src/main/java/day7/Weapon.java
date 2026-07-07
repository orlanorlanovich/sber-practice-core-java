package day7;

import java.io.*;

public class Weapon implements Serializable {
    String name;
    int damage;

    public String toString() {
        return name + "(" + damage + ")";
    }
}