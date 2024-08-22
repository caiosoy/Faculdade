import java.util.Scanner;

public class Faculdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira a quantidade de homens na turma: ");
        int homens = sc.nextInt();


        System.out.println("Insira a quantidade de mulheres na turma: ");
        int mulheres = sc.nextInt();


// irá realizar o calculo do total de alunos
        int total = homens + mulheres;


// Calcula o percentual de homens
        double percH = ((double) homens / total);


// Calcula o percentual de mulheres
        double percM = ((double) mulheres / total);


        System.out.println("Percentual Homens: " + percH);
        System.out.println("Percentual Mulheres: " + percM);


        sc.close();

    }
}
