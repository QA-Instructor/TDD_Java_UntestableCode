package com.celestial.files;

import java.time.LocalTime;

public class DataClerk
{
   static   public class FileLog
   {
       public  void    ClearTheLog()
       {
           // Simulated method that would do something to files in the log
       }
   }

   private FileLog theFileLog;

   public   DataClerk( FileLog fl )
   {
      this.theFileLog = fl;
   }
   
   public  void    ProcessData()
   {
      LocalTime now = LocalTime.now();
      LocalTime stopTime = LocalTime.parse("20:00");

      if( now.isBefore(stopTime) )
      {
         System.out.println("Ready to process the data");
         theFileLog.ClearTheLog();
      }
   }
}