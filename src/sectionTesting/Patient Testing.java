package sectionTesting;
 
 import org.junit.Test;
-
+ 
 import junit.framework.Assert;
 
 public class patientTesting {
 	Patient p = new Patient("Ahmed" , "Ali");
 
 
 	@Test
 	public void ConstructorTest() {
 		Assert.assertTrue(p.getfname().equals("Ahmed"));
 		Assert.assertTrue(p.getlname().equals("Ali"));
 	}
 	
 	@Test
 	public void fname_Test() {
 		Assert.assertTrue(p.getfname().equals("Ahmed"));
 	}
 	
 	@Test
 	public void lname_Test() {
 		Assert.assertTrue(p.getlname().equals("Ali"));
 	}
 	
 	@Test
 	public void SSN_Test() {
 		p.setSSN("5");
 		Assert.assertTrue(p.getSSN().equals("5"));
 	}
 	
 	@Test
 	public void PhNum_Test() {
 		p.setPhNum("10");
 		Assert.assertTrue(p.getPhNum().equals("10"));
 	}
 }
