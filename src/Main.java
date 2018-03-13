import java.util.Scanner;

public class Main {
	static Calculator calculette = new Calculator();
    static Algorithm algo = new Algorithm();
    static Scanner sc = new Scanner(System.in);
    static Boolean typing = true;
    //static List<Eleve> eleves = new ArrayList<>();
    public static void main(String[] args) {
        //ici le code principal, les entrées
        //on entre les données ici
        while (typing == true){
        	System.out.println("Veuillez saisir une personne:");
        	String s = sc.next();
            System.out.println("Veuillez saisir une note:");
            Double n = sc.nextDouble();
            System.out.println("Veuillez saisir un coefficient:");
            Integer c = sc.nextInt();
            System.out.println("La moyenne de " + s + " est de: " + algo.result(s, n, c));
            System.out.println("Voila: " + algo.eleve.getName());
            for(int i = 0; i < algo.eleves.size(); i++) {
            	System.out.println("Eleve numéro " + i + ": " + algo.eleves.get(i));
            }
        }
    }
}