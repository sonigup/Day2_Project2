package com.cgi.banking;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyConversionTest {
 
 private double delta=.1e-15;
 
 @Test
 public void INRTOUSDTest ()
 {
  MoneyConversion MC=new MoneyConversion();
  
  assertEquals(14493.0, Math.round(MC.INRTOUSD(1000000.0)),delta);
 }
 

}