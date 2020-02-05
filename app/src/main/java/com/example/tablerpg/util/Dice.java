package com.example.tablerpg.util;

import java.util.Random;

public class Dice {

    public static int d6() {
        int d6 = new Random().nextInt(6);
        return (d6 + 1);
    }

    public static int d8() {
        int d8 = new Random().nextInt(8);
        return (d8 + 1);
    }

    public static int d20() {
        int d20 = new Random().nextInt(20);
        return (d20 + 1);
    }

}
