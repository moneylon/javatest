

import static org.junit.Assert.*;

import org.junit.Test;

public class testsort {

	@Test
	public void test() {
		sort Sort = new sort();
		assertArrayEquals(new int[] {0,0,0,0,0},sort.InsertionSort(new int[] {0,0,0,0,0}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {5,4,3,2,1}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {1,2,3,4,5}));
		assertArrayEquals(new int[] {1,2,3,4,5},sort.InsertionSort(new int[] {3,2,1,4,5}));
		assertArrayEquals(new int[] {-5,1,2,3,4},sort.InsertionSort(new int[] {-5,2,4,3,1}));
		assertArrayEquals(new int[] {-5,-4,-3,-2,-1},sort.InsertionSort(new int[] {-1,-5,-4,-3,-2}));
		
	}

}
