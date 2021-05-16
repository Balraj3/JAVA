package com.raj;
import CurrencyConversion.Currencyconverter;
import distanceConversion.DistanceConverter;
import timeConvrsion.TimeConverter;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        int previous = 0;
       do
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("1.Currency Converter"+"\n"+
                   "2.Distance Converter"+"\n"+
                   "3.Time Converter");
           System.out.println("Enter the Choice");
           int choice;
           choice=sc.nextInt();
           switch (choice)
           {

               case 1:
                   do
                   {
                       previous=0;
                       System.out.println("1.INR To DOLLARS\n" +
                               "2.DOLLARS To INR\n" +
                               "3.INR To YEN\n" +
                               "4.YEN To INR\n" +
                               "5.INR To EURO\n" +
                               "6.EURO To INR");
                       System.out.println("ENTER THE CHOICE");
                       int currencyChoice=sc.nextInt();
                       Currencyconverter currencyconverter=new Currencyconverter();
                       double INR,USD,YEN,EURO;
                       switch (currencyChoice)
                       {
                           case 1:
                               System.out.println("Enter the amount in INR: ");
                               INR=sc.nextDouble();
                               System.out.println(currencyconverter.inrToDollars(INR));
                               break;
                           case 2:
                               System.out.println("Enter the amount in USD: ");
                               USD=sc.nextDouble();
                               System.out.println(currencyconverter.dollarsToInr(USD));
                               break;
                           case 3:
                               System.out.println("Enter the amount in INR: ");
                               INR=sc.nextDouble();
                               System.out.println(currencyconverter.inrToYen(INR));
                               break;
                           case 4:
                               System.out.println("Enter the amount in YEN: ");
                               YEN=sc.nextDouble();
                               System.out.println(currencyconverter.yenToinr(YEN));
                               break;
                           case 5:
                               System.out.println("Enter the amount in INR: ");
                               INR=sc.nextDouble();
                               System.out.println(currencyconverter.inrToEuro(INR));
                               break;
                           case 6:
                               System.out.println("Enter the amount in EURO: ");
                               EURO=sc.nextDouble();
                               System.out.println(currencyconverter.euroToInr(EURO));
                           default:
                               System.err.println("INVALID CHOICE");
                       }
                       System.out.println("ENTER -1 to go to previous menu: ");
                       previous=sc.nextInt();
                   }while (previous==-1);
                   break;
               case 2:
                   do
                   {
                       previous=0;
                       System.out.println("1.km to m\n" +
                               "2.m to km\n" +
                               "3.km to miles\n" +
                               "4.miles to km");
                       System.out.println("ENTER THE CHOICE");
                       int distanceChoice=sc.nextInt();
                       DistanceConverter distanceConverter=new DistanceConverter();
                       double km,m,miles;
                       switch (distanceChoice)
                       {
                           case 1:
                               System.out.println("Enter the KM: ");
                               km=sc.nextDouble();
                               System.out.println(distanceConverter.kilometerToMeter(km));
                               break;
                           case 2:
                               System.out.println("Enter the M: ");
                               m=sc.nextDouble();
                               System.out.println(distanceConverter.meterToKilometer(m));
                               break;
                           case 3:
                               System.out.println("Enter the KM: ");
                               km=sc.nextDouble();
                               System.out.println(distanceConverter.kilometerToMiles(km));
                               break;
                           case 4:
                               System.out.println("Enter the MILES: ");
                               miles=sc.nextDouble();
                               System.out.println(distanceConverter.milesToKilometer(miles));
                               break;
                           default:
                               System.out.println("INVALID CHOICE");
                       }
                       System.out.println("ENTER -1 to go to previous menu: ");
                       previous=sc.nextInt();

                   }while (previous==-1);
                   break;
               case 3:
                   do
                   {
                       previous=0;
                       System.out.println("1.Hours To Minutes\n" +
                               "2.Minutes To Hours\n" +
                               "3.Hours To Seconds\n" +
                               "4.Seconds to Hours");
                       System.out.println("ENTER THE CHOICE");
                       TimeConverter timeConverter=new TimeConverter();
                       int timeChoice=sc.nextInt();
                       int hour,minutes,seconds;
                       switch (timeChoice)
                       {
                           case 1:
                               System.out.println("ENTER THE HOUR\\S: ");
                               hour=sc.nextInt();
                               System.out.println(timeConverter.hoursToMinutes(hour));
                               break;
                           case 2:
                               System.out.println("ENTER THE MINUTES: ");
                               minutes=sc.nextInt();
                               System.out.println(timeConverter.minutesToHours(minutes));
                               break;
                           case 3:
                               break;
                           case 4:
                               break;
                           default:
                               System.out.println("INVALID CHOICE");
                       }
                       System.out.println("ENTER -1 to go to previous menu: ");
                       previous=sc.nextInt();
                   }while (previous==-1);
                   break;
               default:
                   System.out.println("INVALID CHOICE");

           }
       }while (previous==0);
       }

}
