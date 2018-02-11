package autoland;
class Glideslope
{
    //  variables
   double Height1;
   double Distance1;

    // constructor
    Glideslope( double wys, double dyst )
    {
       this.Height1 = wys ;
       this.Distance1 = dyst ;
    }
    // methods
    double calculateGs()
    {
        return ((Height1)/ (Distance1*5280))*100;
    }

}



