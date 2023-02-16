package com.celestial.files;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
   
   @Test
   public void files_are_logged_before_8pm_mocked()
   {
      // arrange
      IFileLog fl = mock(IFileLog.class);
      
      // use the doNothing on void methods
      doNothing().when(fl).clearTheLog();
      DataClerk cut = new DataClerk(fl);

      // act
      cut.ProcessData();

      // assert
      verify(fl, times(1)).clearTheLog();
   }
   
   @Test
   public void files_are_wrongly_logged_after_8pm_mocked()
   {
      // This test always fails if run before 8pm because of the way 
      // DataCleark is written.
      // Open git tag v1.4 which has an updated version of DataClerk
      // arrange
      IFileLog fl = mock(IFileLog.class);
      
      // use the doNothing on void methods
      doNothing().when(fl).clearTheLog();
      DataClerk cut = new DataClerk(fl);

      // act
      cut.ProcessData();

      // assert
      verify(fl, times(0)).clearTheLog();
      
   }
}
