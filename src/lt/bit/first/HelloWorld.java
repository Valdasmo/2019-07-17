package lt.bit.first;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HW");
        byte byteValueOne = 127;
        byte byteValueTwo = 12;
        byte byteValueThree = (byte) (byteValueOne + byteValueTwo); // Perpildymas
        System.out.print(byteValueThree + args[0]);
        Byte bt = byteValueOne;
        System.out.println(bt.compareTo(byteValueTwo));





    }

}
