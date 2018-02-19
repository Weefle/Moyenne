import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //here is the main code, the inputs
        Calculator calculette = new Calculator();
        Algorithm algo = new Algorithm();
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> person = new HashMap<>();
        Boolean typing = true;
        //we enter notes here
        while (typing == true){
        	//améliorer le code
        	System.out.println("Veuillez saisir une personne:");
        	String s = sc.next();
            System.out.println("Veuillez saisir une note:");
            Double n = sc.nextDouble();
            System.out.println("Veuillez saisir un coefficient:");
            Integer c = sc.nextInt();
            algo.add(n, c);
            person.put(s, algo.calcul());
            System.out.println("La moyenne de " + s + " est de: " + person.get(s));
        }
    }
}