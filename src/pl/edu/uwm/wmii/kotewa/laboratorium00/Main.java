package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.ArrayList;

public class Main {


    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {

        int x=a.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++)
        {
            list.add(i,a.get(i));
        }
        for(int i=0;i<b.size();i++)
        {
            list.add(x+i,b.get(i));

        }


        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,1);
        lista.add(1,2);
        lista.add(2,3);
        lista.add(3,4);
        ArrayList<Integer> lista2=new ArrayList<Integer>(4);
        lista2.add(0,5);
        lista2.add(1,6);
        lista2.add(2,7);
        System.out.print(append(lista,lista2));
    }
}