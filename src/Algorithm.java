import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Algorithm {
	
	//ici l'algorithme principal
    private HashMap<String, Double> total = new HashMap<>();
    private List<Eleve> eleves = new ArrayList<>();
    private Eleve eleve = null;
    //faire en sorte que les notes et coeffs appartiennent à une personne

    public void add(String player, Double note, int coeff) {
    	if(!eleves.contains(eleve)) {
    		eleve = new Eleve(player);
    		eleve.addNote(note);
    		eleve.addCoeff(coeff);
    		eleves.add(eleve);
    		/*eleve = new Eleve(player);
    		eleve.addNote(note);
        	eleve.addCoeff(coeff);*/
    	}
    	eleve.addNote(note);
    	eleve.addCoeff(coeff);
    	eleves.add(eleve);
    }
    
    public void removeTotal(String player) {
    	total.remove(player);
    }
    
    public Double getTotal(String player) {
    	total.put(player, calcul());
    	return total.get(player);
    }
    
    public Double calcul(){

        Double cumul = 0.0;
        int totalcoeffs = 0;
        for(int i=0; i<eleve.getNotes().size(); i++){
            cumul += (eleve.getNotes().get(i)*eleve.getCoeffs().get(i));
            totalcoeffs += eleve.getCoeffs().get(i);
        }

        return cumul/totalcoeffs;

    }

}
