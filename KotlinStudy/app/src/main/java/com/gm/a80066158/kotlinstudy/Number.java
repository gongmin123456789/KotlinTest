package com.gm.a80066158.kotlinstudy;

/**
 * Created by 80066158 on 2017-06-01.
 */

public class Number {
    private int num = 0;

    public Number(int num) {
        this.num = num;
    }

    public boolean isEven() {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }
}
