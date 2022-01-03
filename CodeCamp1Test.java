package CodeCamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodeCamp1Test {
	
	 int Array[] = {12, 36, 22, 19, 63};
	 int Sum,size=Array.length;
	
	
	@Test
	public void ValidPair() {
		CodeCamp1 obj=new CodeCamp1();
		Sum=31;
		int actual=obj.checkPair(Array,size,Sum);
		assertEquals(1,actual);
		
	}
	
	@Test
	public void NoPairExists() {
		CodeCamp1 obj=new CodeCamp1();
		Sum=5;
		int actual=obj.checkPair(Array,size,Sum);
		assertEquals(-1,actual);
	}
}
