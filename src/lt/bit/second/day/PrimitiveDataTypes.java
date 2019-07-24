package lt.bit.second.day;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        checkByte();
        checkShort();
        checkInt();
        checkLong();
        checkFloat();
        checkDouble();
        checkChar();
        checkBoolean();
    }

    private static void checkByte() {
        byte byteValueOne = 23; // byte variable
        System.out.println(byteValueOne);
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("byte range from " +
                byteMinValue + " to " + byteMaxValue); //
        System.out.println("byte size in bytes: " + Byte.BYTES);
//        System.out.println(byteValueOne / 0); // Error: divide by zero!
    }

    private static void checkShort() {
        short shortValueOne = 12345;
        System.out.println(shortValueOne);
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("short range from " +
                shortMinValue + " to " + shortMaxValue); //
        System.out.println("short size in bytes: " + Short.BYTES);
//        System.out.println(shortValueOne / 0); // Error: divide by zero!
    }

    private static void checkInt() {
        int intValueOne = 1234567890;
        System.out.println(intValueOne);
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("int range from " +
                intMinValue + " to " + intMaxValue); //
        System.out.println("int size in bytes: " + Integer.BYTES);
//        System.out.println(intValueOne / 0); // Error: divide by zero!
    }

    private static void checkLong() {
        long shortValueOne = 12345;
        System.out.println(shortValueOne);
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("long range from " +
                longMinValue + " to " + longMaxValue); //
        System.out.println("long size in bytes: " + Long.BYTES);
//        System.out.println(longValueOne / 0); // Error: divide by zero!
    }

    private static void checkFloat() {
        float floatValueOne = 1.12f;
        System.out.println(floatValueOne);
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("float range from " +
                floatMinValue + " to " + floatMaxValue); // precision IEEE745
        System.out.println("float size in bytes: " + Float.BYTES);
        System.out.println(floatValueOne / 0);
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f +
                0.1f + 0.1f + 0.1f + 0.1f + 0.1f);
    }

    private static void checkDouble() {
        double doubleValueOne = 1.12f;
        System.out.println(doubleValueOne);
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("double range from " +
                doubleMinValue + " to " + doubleMaxValue); // precision IEEE745
        System.out.println("double size in bytes: " + Double.BYTES);
        System.out.println(doubleValueOne / 0);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 +
                0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1); // BigDecimal
        System.out.println("ba" + 0.0 / 0.0);
    }

    private static void checkChar() {
        char charOne = 'a';
        char charTwo = '\u9999';
        System.out.println(charOne);
        System.out.println(charTwo);
        char charMinValue = Character.MIN_VALUE;
        char charMaxValue = Character.MAX_VALUE;
        System.out.println("char range from " +
                (charMinValue + 0) + " to " + (charMaxValue + 0));
        System.out.println("char size in bytes: " + Character.BYTES);
//        System.out.println(charOne / 0); // Error: divide by zero
    }

    private static void checkBoolean() {
        boolean number = true;
        boolean otherNumber = !number;
        System.out.println(number);
        System.out.println(otherNumber);
        System.out.println(number | otherNumber);
        System.out.println(number & otherNumber);
        System.out.println(number ^ otherNumber);
        int numberOne = 10;
        int numberTwo = 20;
        boolean result = numberOne != numberTwo;
        System.out.println(result);

    }
}
