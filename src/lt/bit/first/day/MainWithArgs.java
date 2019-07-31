package lt.bit.first.day;

public class MainWithArgs {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello " + args[0] + "!" + name);
        int number = 45;
        System.out.println(number + Integer.parseInt(args[1]));
    }
}
