import java.util.ArrayList;

/**
 * Created by yassirhessane on 10/08/16.
 */
public class SocieteMere extends Societe {

    protected ArrayList<Societe> filiales = new ArrayList();

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        this.filiales.add(filiale);
        return true;
    }

    public double calculeCoutEntretien()
    {
        double cout = 0.0;
        for (int i=0;i<this.filiales.size();i++)
        {
            cout += this.filiales.get(i).calculeCoutEntretien();

        }
        return cout + this.nbrVehicule * SocieteMere.countUnitVehicule;
    }
}
