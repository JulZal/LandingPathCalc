package autoland;

public class Dist2mod {

    // variables
    double Speed1;
    VerticalSpeed VS;

    // constructor
    Dist2mod (double spd1, VerticalSpeed vs1 )
    {
        this.Speed1=spd1 ;
        this.VS=vs1 ;
    }
    // methods
    double calculatedismod()
    {
        return ((Speed1 / 3600)) * ((6000) / VS.calculateVS());
    }

}

