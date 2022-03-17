package com.p1;

import static org.junit.Assert.*;  
import org.junit.Test;  

public class CalculationTestCase 
{
	@Test  
	public void testFindMax()
	{  
	    assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	    assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  
}