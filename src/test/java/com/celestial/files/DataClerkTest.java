package com.celestial.files;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author selvy
 */
public class DataClerkTest
{
   @Test
   public void testProcessData()
   {
      // arrange
      DataClerk.FileLog fl = new DataClerk.FileLog();
      DataClerk cut = new DataClerk( fl );
      
      // act
      cut.ProcessData();
      
      // assert
      // There is no way of knowing if this ran as expected
   }
   
}
