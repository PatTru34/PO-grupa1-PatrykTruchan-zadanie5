package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(a);
        list.addAll(b);

        Collections.sort(list);
        return list;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,1);
        lista.add(1,54);
        lista.add(2,3);
        lista.add(3,2);
        ArrayList<Integer> lista2=new ArrayList<Integer>(4);
        lista2.add(0,8);
        lista2.add(1,56);
        lista2.add(2,13);
        System.out.print(mergeSorted(lista,lista2));
    }

}