import java.util.List;

/**
 * Created by yassirhessane on 10/08/16.
 */
public abstract class Societe {

    protected static double countUnitVehicule = 5.0;

    protected int nbrVehicule;

    public void ajouteVehicule()
    {
        this.nbrVehicule++;
    }

    public abstract double calculeCoutEntretien();

    public abstract boolean ajouteFiliale(Societe filiale);
}
