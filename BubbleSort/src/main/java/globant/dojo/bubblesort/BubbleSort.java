package globant.dojo.bubblesort;

import static java.lang.System.*;

public class BubbleSort {
    public static void bubbleSort (int[] array)
    {
        int size = array.length;
        int aux = 0;
        for (int i=0;i<size;i++)
        {
            for(int j=1;j<(size-i);j++)
            {
                if(array[j-1] > array[j])
                {
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array={5,1,4,2,8};
        out.print("input: [ ");
        for (int j : array) {
            out.print(j + " ");
        }
        out.println("]");
        bubbleSort(array);
        out.print("output: [ ");
        for (int j : array) {
            out.print(j + " ");
        }
        out.println("]");
    }
}