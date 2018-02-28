import java.util.HashMap;

public class Algorithm {
	
	//ici l'algorithme principal
    private HashMap<String, Double> total = new HashMap<>();
    private Eleve eleve = null;
    //faire en sorte que les notes et coeffs appartiennent à une personne

    public void add(String player, Double note, int coeff) {
    	/*Eleve eleve = new Eleve(player);*/
    	eleve = new Eleve(player);
    	eleve.addNote(note);
    	eleve.addCoeff(coeff);
    }
    
    public void removeTotal(String player) {
    	total.remove(player);
    }
    
    public Double getTotal(String player) {
    	total.put(player, eleve.calcul());
    	return total.get(player);
    }

}
