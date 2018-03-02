import java.util.ArrayList;
import java.util.List;

public class Algorithm {
	
	//ici l'algorithme principal
	private List<Eleve> eleves = new ArrayList<>();
	private Eleve eleve = new Eleve();

    public Double result(String player, Double note, int coeff) {
    		if(eleves.contains(eleve)) {
    			eleve.addNote(note);
        		eleve.addCoeff(coeff);
    		}else {
    			eleve.setName(player);
    			eleve.addNote(note);
        		eleve.addCoeff(coeff);
        		eleves.add(eleve);
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
