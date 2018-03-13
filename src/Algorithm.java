import java.util.ArrayList;
import java.util.List;

public class Algorithm {
	
	//ici l'algorithme principal
	public List<String> eleves = new ArrayList<>();
	public Eleve eleve;

	public Double result(String player, Double note, int coeff) {
    		if(!eleves.contains(player)) {
        		eleve = new Eleve(player);
    			eleve.addNote(note);
        		eleve.addCoeff(coeff);
        		eleves.add(player);
    		}else {
    			eleve.addNote(note);
        		eleve.addCoeff(coeff);
    		}
    		return calcul(eleve);
    }
    
    public Double calcul(Eleve eleve){

        Double cumul = 0.0;
        int totalcoeffs = 0;
        for(int i=0; i<eleve.getNotes().size(); i++){
            cumul += (eleve.getNotes().get(i)*eleve.getCoeffs().get(i));
            totalcoeffs += eleve.getCoeffs().get(i);
        }

        return cumul/totalcoeffs;

    }

}
