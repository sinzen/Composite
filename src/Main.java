public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Societe societe1= new SocieteSansFiliale();
        societe1.ajouteVehicule();

        Societe societe2 = new SocieteSansFiliale();
        societe2.ajouteVehicule();
        societe2.ajouteVehicule();

        Societe groupe = new SocieteMere();
        groupe.ajouteFiliale(societe1);
        groupe.ajouteFiliale(societe2);
        groupe.ajouteVehicule();

        Societe s1 = new SocieteSansFiliale();
        s1.ajouteVehicule();
        s1.ajouteVehicule();
        s1.calculeCoutEntretien();

        System.out.println("Coût d\'entretien total du groupe: "+s1.calculeCoutEntretien());

    }
}
