package autoland;

class VerticalSpeed
{

        // variables
        double Height1;
        double ETA;

        // constructor
        VerticalSpeed (double wys1, double czas )
        {
           this.Height1 = wys1 ;
           this.ETA= czas ;
        }
        // methods
        double calculateVS()
        {
            return ((Height1)/ETA);
        }

}

