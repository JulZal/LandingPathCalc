package autoland;
class ArrivTime
{
    // variables
    double Speed1;
    double Distance1;

    // constructor
    ArrivTime( double pred, double dyst )
    {
        this.Speed1 = pred ;
        this.Distance1 = dyst ;
    }
    // methods
    double calculateETA()
    {
        return (Distance1/Speed1)*60;
    }

}