import java.util.ArrayList;

public class Algorithm {

    private ArrayList<Double> notes;
    private ArrayList<Double> coeffs;

    public void addNote(Double note) {
        notes.add(note);
    }

    public void removeNote(){
        notes.removeAll(notes);
    }

    public void addCoeff(Double coeff) {
        coeffs.add(coeff);
    }

    public void removeCoeff(){
        coeffs.removeAll(coeffs);
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public ArrayList<Double> getCoeffs() {
        return coeffs;
    }

    public Double calcul(Double notes, Double coeffs){

        int result;


        return null;

    }

}
