import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ici le code principal, les entrées
        Calculator calculette = new Calculator();
        Algorithm algo = new Algorithm();
        Scanner sc = new Scanner(System.in);
        // on créer un tableau de 2 dimensions (notes et coeffs) pour une clé qui est la personne
        HashMap<String, Double[][]> person = new HashMap<>();
        Boolean typing = true;
        //on entre les données ici
        while (typing == true){
        	//améliorer le code
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