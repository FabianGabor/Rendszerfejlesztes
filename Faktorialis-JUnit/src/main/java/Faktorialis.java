public class Faktorialis {
    public static long faktorialis (int szam) {
        //if (szam < 0) return 1;
        if (szam == 0 || szam == 1) return 1;
        else return szam * faktorialis(szam -1);
    }

    public static void main(String[] args) {

    }
}
