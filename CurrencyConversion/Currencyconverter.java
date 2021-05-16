package CurrencyConversion;

public class Currencyconverter
{
    /*convert
     1.inr to us dollars (1usd=66 rupees)
     2.us dollars to inr
     3.inr to yen(1rs=1.5yen)
     4.yen to inr
     5.inr to euro(1 euro=89 rs)
     6.euro to inr
     */
    public  String inrToDollars(double indianRupees)
    {
        //precision upto 2 decimal
        double usd=indianRupees*66;
        return indianRupees+" INR = "+String.format(".2f",usd)+" USD";
    }
    public String dollarsToInr(double usdollars)
    {
        double inr=usdollars/66;
        return usdollars+" USD = "+String.format(".2f",inr)+" INR";
    }
    public String inrToYen(double indianRupees)
    {
      double yen=indianRupees*0.67;
        return indianRupees +" INR = "+String.format(".2f",yen)+" YEN";
    }
    public String yenToinr(double yen)
    {
        double inr=yen*1.5;
        return yen+" YEN= "+String.format(".2f",inr)+" INR";

    }
    public String inrToEuro(double indianRupees)
    {
      double euro=indianRupees/89;
        return indianRupees+" INR = "+String.format(".2f",euro)+" euro";
    }
    public String euroToInr(double euro)
    {
        double inr=euro*89;
        return euro+" euro = "+String.format(".2f",inr)+" INR";
    }


}
