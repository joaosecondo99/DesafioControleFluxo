import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Digite o 1º número: ");
    int numeroUm = userInput.nextInt();

    System.out.println("Digite o 2º número: ");
    int numeroDois = userInput.nextInt();

    try {
      contar(numeroUm, numeroDois);
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }

  }

  static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {

    if (numeroUm > numeroDois) {
      throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
    } else {
        int contagem = numeroDois - numeroUm;
        for (int index = 1; index <= contagem; index++) {
         System.out.println(index + "º número!");
        }
      }
    }
  }