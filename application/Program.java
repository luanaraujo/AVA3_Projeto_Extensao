package application;
import java.util.Scanner;
import Entities.Morador;
public class Program {
   public static void main(String[] args) {
   // Definir o tamanho máximo do array
   final int MAX_MORADORES = 100;

   // Criar o array para armazenar os moradores
   Morador[] moradores = new Morador[MAX_MORADORES];

   // Variável para controlar o número de moradores cadastrados
   int numMoradores = 0;

   // Criar um objeto Scanner para receber entrada do usuário
   Scanner scanner = new Scanner(System.in);

   // Loop para cadastrar os moradores
   while (numMoradores < MAX_MORADORES) {
      System.out.println("Cadastro de Morador #" + (numMoradores + 1));
      // Criar um novo objeto Morador
      Morador morador = new Morador();

      System.out.print("Nome: ");
      morador.setNome(scanner.nextLine());

      System.out.print("RG: ");
      morador.setRg(scanner.nextLine());

      System.out.print("CPF: ");
      morador.setCpf(scanner.nextLine());

      System.out.print("Data de Nascimento: ");
      morador.setDataNascimento(scanner.nextLine());

      System.out.print("E-mail: ");
      morador.setEmail(scanner.nextLine());

      System.out.print("Telefone: ");
      morador.setTelefone(scanner.nextLine());

      System.out.print("Apartamento: ");
      morador.setApartamento(scanner.nextLine());

      System.out.print("Bloco: ");
      morador.setBloco(scanner.nextLine());

      // Adicionar o morador ao array
      moradores[numMoradores] = morador;

      numMoradores++; // Incrementar o número de moradores cadastrados

      System.out.print("Deseja cadastrar outro morador? (S/N): ");
      String resposta = scanner.nextLine();
      if (!resposta.equalsIgnoreCase("S")) {
         break; // Encerrar o loop se a resposta for diferente de "S"
      }
      
}

   // Exibir os moradores cadastrados
   System.out.println("----- Moradores Cadastrados -----");
   for (int i = 0; i < numMoradores; i++) {
      System.out.println("Morador #" + (i + 1));
      System.out.println("Nome: " + moradores[i].getNome());
      System.out.println("RG: " + moradores[i].getRg());
      System.out.println("CPF: " + moradores[i].getCpf());
      System.out.println("Data de Nascimento: " +             moradores[i].getDataNascimento());
      System.out.println("E-mail: " + moradores[i].getEmail());
      System.out.println("Telefone: " + moradores[i].getTelefone());
      System.out.println("Apartamento: " + moradores[i].getApartamento());
      System.out.println("Bloco: " + moradores[i].getBloco());
      System.out.println("------------------------");
   }
   scanner.close();
   

}
}

