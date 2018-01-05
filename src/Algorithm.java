import java.util.ArrayList;

public class Algorithm {

    private ArrayList<Double> notes = new ArrayList<>();
    private ArrayList<Integer> coeffs = new ArrayList<>();

    public void add(Double note, Integer coeff) {
        notes.add(note);
        coeffs.add(coeff);
    }

    public void remove(){
        notes.removeAll(notes);
        coeffs.removeAll(coeffs);
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public ArrayList<Integer> getCoeffs() {
        return coeffs;
    }

    public Double calcul(){

        Double cumul = 0.0;
        int totalcoeffs = 0;
        for(int i=0; i<notes.size(); i++){
            cumul += (notes.get(i)*coeffs.get(i));
            totalcoeffs += coeffs.get(i);
        }

        return cumul/totalcoeffs;

    }

}
