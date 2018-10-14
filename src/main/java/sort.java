import java.util.List;
import java.util.ArrayList;
public class sort {
	    public static int[] InsertionSort(int[] array)
	    {
	        int n, j;
	        for (int i = 1; i < array.length; ++i)
	        {
	            n = array[i];
	            for (j = i - 1; j >= 0 && array[j] > n; --j)
	                array[j + 1] = array[j];
	            array[j + 1] = n;
	        }
	       return array;
	    }
	}

