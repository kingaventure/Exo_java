public class Exo_3 {
    public static void main(String[] args) {
        Employe employe = new Employe();
        Enseignant enseignant = new Enseignant();
        Directeur directeur = new Directeur();
        PersonnelAdministratif personnelAdministratif = new PersonnelAdministratif();
        
        employe.travailler();
        enseignant.travailler();
        directeur.travailler();
        personnelAdministratif.travailler();
    }
}
