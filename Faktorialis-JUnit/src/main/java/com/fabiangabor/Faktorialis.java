package com.fabiangabor;

public class Faktorialis {
    /**
     * @return long
     * @throws FaktKivetel
     */
    public Faktorialis() {
    }

    public static long faktorialis (int szam) throws FaktKivetel {
        if (szam < 0) throw new FaktKivetel("ne negativ");
        if (szam == 0 || szam == 1) return 1;
        else return szam * faktorialis(szam -1);
    }

    public static void main(String[] args) {

    }
}
