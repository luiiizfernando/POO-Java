/* Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
   Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
*/

public class Aluno {
    String nome;
    int idade;

    void exibirInformacoes(String nome, int idade)
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
