/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextdateupdated;

/**
 *
 * @author sameen zahra
 */
public class NextDate {
    
    static public String nextDateCheck(int d,int m,int y) {
         //int a=1;
         //System.out.println("aaaaaa");
         int []daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int day,month, year, nextDay, nextMonth, nextYear, numberOfDays;
            day=d;
            month=m;year=y;
           // System.out.println(day+month+year);
            
            
           
          //  if(a==1)
        // return ("Invalid Input");
           
            if (month < 1 || month > 12)
            {
                return("Invalid Input ");
                //printf("Invalid Input Month");
                //    exit(0);
            }
            if (year < 1812 || year > 2012)
            {
                return("Invalid Input ");
                // printf("Invalid Input Year");
                // exit(0);
            }
             numberOfDays=daysInMonth[month-1];
            if (day <= 0 || day > numberOfDays)
            {
                //System.out.println("lucky");
                return("Invalid Input ");
                //printf("Invalid Input Day");
                // exit(0);
            }
           
            else
            {
                 if (month == 2)
            {
                if (year % 100 == 0)
                {
                    if (year % 400 == 0)
                    {numberOfDays = 29;}
                }
                else if (year % 4 == 0)
                {numberOfDays = 29;}
                else
                { numberOfDays = 28;}
            }
                
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
                if (nextDay > numberOfDays)
                {
                    nextDay = 1;
                    nextMonth++;
                }
                if (nextMonth > 12)
                {
                    nextMonth = 1;
                    nextYear++;
                }

                //Console.WriteLine(day + " .." + month + ".." + year);
               // return ("1");
                return(nextDay + "-" + nextMonth + "-" + nextYear+".");
            }
         
         
         
         //return ("99");
         
         
         
         
         
         
         
         
         
         
     }
    
    
}
