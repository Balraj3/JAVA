package distanceConversion;
/*
 convert
 1.km to m
 2.m to km
 3.km to miles
 4.miles to km(1 mile = 1.609km)
 */
public class DistanceConverter
{
     public String kilometerToMeter(double km)
     {
      double meter=km*1000;
      return km+" KM ="+String.format("%.2f",meter)+" m";
     }
     public String meterToKilometer(double m)
     {
      double km=m/1000;
      return m+" M ="+String.format("%.2f",km)+" KM";
     }
     public String kilometerToMiles(double km)
     {
      double miles=km/1.609;
      return km+" KM ="+String.format("%.2f",miles)+" MILES";
     }
     public String milesToKilometer(double miles)
     {
      double km=miles*1.609;
      return miles+" MILES ="+String.format("%.2f",km)+" KM";
     }

}
