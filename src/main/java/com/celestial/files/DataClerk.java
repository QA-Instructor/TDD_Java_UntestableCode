package com.celestial.files;

import java.time.LocalTime;

public class DataClerk
{
    public class FileLog
    {
        public  void    ClearTheLog()
        {
            // Simulated method that would do something to files in the log
        }
    }

   private FileLog theFileLog;

   public  void    ProcessData()
   {
      LocalTime now = LocalTime.now();
      LocalTime stopTime = LocalTime.parse("20:00");

      if( now.isBefore(stopTime) )
      {
          System.out.println("Ready to process the data");
          FileLog fl = new FileLog();
          fl.ClearTheLog();
      }
   }

}