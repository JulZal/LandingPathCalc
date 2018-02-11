package autoland;

public class eta2mod {
    // variables
    double Speed1;
    VerticalSpeed VS;

    // constructor
    eta2mod (double spd2, VerticalSpeed vs2 )
    {
        this.Speed1=spd2 ;
        this.VS=vs2 ;
    }
    // methods
    double calculatetmod()
    {                                                                     //vs stop - 60
        return ((6000) / VS.calculateVS());//najprosciej jak sie da 6000 bo 100 stóp - x
    }

}