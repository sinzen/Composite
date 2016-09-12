/**
 * Created by yassirhessane on 10/08/16.
 */
public class SocieteSansFiliale extends Societe {


    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }

    public double calculeCoutEntretien()
    {
        return this.nbrVehicule * SocieteSansFiliale.countUnitVehicule;
    }


}
