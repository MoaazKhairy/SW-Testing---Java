package sectionTesting;
 import org.junit.Assert;
 import org.junit.Test;
 
 public class mergingTest {
 	@Test
 	public void mergeTesting() {
 		int A1[] = {1,4,6};
 		int A2[] = {2,3,5,9};
 		int actuals[] = MergeUniqueArrays.mergeArrays(A1, A2);
 		int expecteds[]  = {1,2,3,4,5,6,9};
 		Assert.assertArrayEquals(expecteds , actuals);
 	}
 	
 	@Test
 	public void firstArrNull() {
 		int A1[] = null;
 		int A2[] = {1,3,4};
 		int actuals[] = MergeUniqueArrays.mergeArrays(A1, A2);
 		int expecteds[] = {1,3,4};
 		Assert.assertArrayEquals(expecteds, actuals);
 	}
 	
 	@Test
 	public void secondArrNull() {
 		int A1[] = {1,3,4};
 		int A2[] = null;
 		int actuals[] = MergeUniqueArrays.mergeArrays(A1, A2);
 		int expecteds[] = {1,3,4};
 		Assert.assertArrayEquals(expecteds, actuals);
 	}
 	
 	@Test
 	public void firstAndSecondArrsNull() {
 		int A1[] = null;
 		int A2[] = null;
 		int actuals[] = MergeUniqueArrays.mergeArrays(A1, A2);
 		int expecteds[] = null;
 		Assert.assertArrayEquals(expecteds, actuals);
 	}
 
 }