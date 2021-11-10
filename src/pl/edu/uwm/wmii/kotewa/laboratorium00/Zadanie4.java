package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;

public class Zadanie4 {

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=a.size();i>0;i--)
        {

            list.add(a.get(i-1));

        }
        return list;
    }


    public static void main(String[] args)
    {

        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,1);
        lista.add(1,2);
        lista.add(2,3);
        lista.add(3,4);

        System.out.print(reversed(lista));
    }
}