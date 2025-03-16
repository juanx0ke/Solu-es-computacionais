import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Coloque Nome, Idade e Salário");

        //String input
        String nome = myObj.nextLine();

        //Numerical input
        int idade = myObj.nextInt();
        double salário = myObj.nextDouble();

        //Output input by user
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salário);
    }
}