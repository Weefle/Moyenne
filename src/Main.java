import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ici le code principal, les entrées
        Calculator calculette = new Calculator();
        Algorithm algo = new Algorithm();
        Scanner sc = new Scanner(System.in);
        Boolean typing = true;
        //on entre les données ici
        while (typing == true){
        	System.out.println("Veuillez saisir une personne:");
        	String s = sc.next();
        	Eleve eleve = new Eleve(s);
            System.out.println("Veuillez saisir une note:");
            Double n = sc.nextDouble();
            System.out.println("Veuillez saisir un coefficient:");
            Integer c = sc.nextInt();
            algo.add(s, n, c);
            System.out.println("La moyenne de " + s + " est de: " + algo.getTotal(s));
        }
    }
}