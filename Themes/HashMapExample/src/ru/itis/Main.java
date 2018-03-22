package ru.itis;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hash of 0.01 " + Double.valueOf(0.01).hashCode());
        System.out.println("Hash of 0.02 " + Double.valueOf(0.02).hashCode());
        System.out.println("Hash of 0.03 " + Double.valueOf(0.03).hashCode());
        System.out.println("Hash of 0.04 " + Double.valueOf(0.04).hashCode());
        System.out.println("Hash of 0.05 " + Double.valueOf(0.05).hashCode());

        System.out.println("---------");

        System.out.println("Position of 0.01 " + (31 & Double.valueOf(0.01).hashCode()));
        System.out.println("Position of 0.02 " + (31 & Double.valueOf(0.02).hashCode()));
        System.out.println("Position of 0.03 " + (31 & Double.valueOf(0.03).hashCode()));
        System.out.println("Position of 0.04 " + (31 & Double.valueOf(0.04).hashCode()));
        System.out.println("Position of 0.05 " + (31 & Double.valueOf(0.05).hashCode()));

        System.out.println("---------");

        System.out.println("Position of 0.01 " + (31 & (Double.valueOf(0.01).hashCode() ^ (Double.valueOf(0.01).hashCode() >>> 16))));
        System.out.println("Position of 0.02 " + (31 & (Double.valueOf(0.02).hashCode() ^ (Double.valueOf(0.02).hashCode() >>> 16))));
        System.out.println("Position of 0.03 " + (31 & (Double.valueOf(0.03).hashCode() ^ (Double.valueOf(0.03).hashCode() >>> 16))));
        System.out.println("Position of 0.04 " + (31 & (Double.valueOf(0.04).hashCode() ^ (Double.valueOf(0.04).hashCode() >>> 16))));
        System.out.println("Position of 0.05 " + (31 & (Double.valueOf(0.05).hashCode() ^ (Double.valueOf(0.05).hashCode() >>> 16))));

        HashSet set = new HashSet();
    }
}
