

import static org.junit.Assert.*;

import org.junit.Test;

public class testsort {

	@Test
	public void test() {
		sort Sort = new sort();
		/*test insertionsort*/
		assertArrayEquals(new int[] {0,0,0,0,0},sort.InsertionSort(new int[] {0,0,0,0,0}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {5,4,3,2,1}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {1,2,3,4,5}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {3,2,1,4,5}));
		assertArrayEquals(new int[] {-5,1,2,3,4},sort.InsertionSort(new int[] {-5,2,4,3,1}));
		assertArrayEquals(new int[] {-5,-4,-3,-2,-1},sort.InsertionSort(new int[] {-1,-5,-4,-3,-2}));
		/*test quicksort*/
		assertArrayEquals(new int[] {1,2,3,4,5},sort.qsort(new int[]{3,2,1,4,5},0,4));
		assertArrayEquals(new int[] {0,0,0,0,0},sort.qsort(new int[]{0,0,0,0,0},0,4));
		assertArrayEquals(new int[] {-999,-888,-777,-666,-555},sort.qsort(new int[]{-777,-555,-666,-888,-999},0,4));
		
	}

}
