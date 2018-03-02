import java.util.ArrayList;
import java.util.List;

public class Eleve {
	
	private String name;
	private List<Double> notes;
	private List<Integer> coeffs;
	
	public Eleve(/*String nom*/) {
		//this.name = nom;
		this.notes = new ArrayList<>();
		this.coeffs = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotes() {
		return notes;
	}
	
	public void addNote(Double note) {
		this.notes.add(note);
	}
	
	public void addCoeff(Integer coeff) {
		this.coeffs.add(coeff);
	}

	public void setNotes(List<Double> notes) {
		this.notes = notes;
	}

	public List<Integer> getCoeffs() {
		return coeffs;
	}

	public void setCoeffs(List<Integer> coeffs) {
		this.coeffs = coeffs;
	}
	
	public void remove(){
        notes.removeAll(notes);
        coeffs.removeAll(coeffs);
    }
	
}
