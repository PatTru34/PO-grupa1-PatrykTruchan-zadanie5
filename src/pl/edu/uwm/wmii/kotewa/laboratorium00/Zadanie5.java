package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;

public class Zadanie5 {

    public static void reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.addAll(a);
        for(int i=1;i<=a.size();i++)
        {
            a.set(i-1,list.get(a.size()-i));
        }


    }


    public static void main(String[] args)
    {

        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        reversed(lista);
        System.out.print(lista);


    }
}