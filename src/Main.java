import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ici le code principal, les entr�es
        Calculator calculette = new Calculator();
        Algorithm algo = new Algorithm();
        Scanner sc = new Scanner(System.in);
        // on cr�er un tableau de 2 dimensions (notes et coeffs) pour une cl� qui est la personne
        HashMap<String, Double[][]> person = new HashMap<>();
        Boolean typing = true;
        //on entre les donn�es ici
        while (typing == true){
        	//am�liorer le code
        	System.out.println("Veuillez saisir une personne:");
        	String s = sc.next();
            System.out.println("Veuillez saisir une note:");
            Double n = sc.nextDouble();
            System.out.println("Veuillez saisir un coefficient:");
            Integer c = sc.nextInt();
            algo.add(n, c);
            personnote.put(s, algo.calcul());
            System.out.println("La moyenne de " + s + " est de: " + personnote.get(s));
        }
    }
}