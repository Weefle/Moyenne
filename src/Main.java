import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //here is the main code, the inputs
        Calculator calculette = new Calculator();
        Algorithm algo = new Algorithm();
        Scanner sc = new Scanner(System.in);
        Boolean typing = true;
        //we enter notes here
        while (typing == true){
            System.out.println("Veuillez saisir une note:");
            Double n = sc.nextDouble();
            System.out.println("Veuillez saisir un coefficient:");
            Integer c = sc.nextInt();
            algo.add(n, c);
            System.out.println("La moyenne est de: " + algo.calcul());
        }
    }
}