package day7;

import java.io.*;

public class Armor implements Serializable {
    String name;
    int defense;

    public String toString() {
        return name + "(" + defense + ")";
    }
}