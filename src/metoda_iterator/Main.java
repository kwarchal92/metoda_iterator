package metoda_iterator;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        ArrayList lista = new ArrayList();

        int n = 100;

        for (int i = 0; i <= n; i++)
        {
            lista.add(i); //dodawanie kolejnych liczb do listy
        }
        System.out.println("Wszystkie elementy.");

        Iterator it = lista.iterator(); //zastosowanie iteratora
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        int suma = 0;

        for (int i = 0; i < lista.size(); i++)
        {
            suma += i; //Sumowanie liczb od 1 do 100 znajdujących sie w tablicy
        }

        System.out.println();
        System.out.println("Suma = " + suma + ".");
    }
}
