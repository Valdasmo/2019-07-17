package lt.bit.collections.arraylist;


import java.util.Collection;
import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Tom");
        names.add("John");
        names.add("Michael");
        names.add("Ozzy");
        System.out.println(names);
//        names. remove(1);
//        System.out.println(names);
//        names.remove(0);
//        System.out.println(names);
        Collections.sort(names);
    //        java.util.ArrayList<Integer> integerArraysList = new java.util.ArrayList<>();
//        for (int i = 0; i< 120; i++){
//            integerArraysList.add(i);
//        }
//        System.out.println(integerArraysList);


    }
}
