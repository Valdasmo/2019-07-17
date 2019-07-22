package lt.bit.second;

public class HW20190717 {
    public static void main(String[] args) {
        calcSquare();
        printPI();
    }



    private static void calcSquare() {
        int a=2;
        int b=5;
        int c=a*2+b*2;
        int d=a*b;
        System.out.println("Staciakampio perimetras = " + c);
        System.out.println("Staciakampio plotas = " + d);
    }

    private static void printPI() {
        double pi = Math.PI;
        System.out.format("Pi reiksme suapvalinta iki 5 skaiciu po kablelio = " + "%.5f%n", pi);
        System.out.println("Nesuapvalinta Pi reiksme = " + pi);

    }

}



