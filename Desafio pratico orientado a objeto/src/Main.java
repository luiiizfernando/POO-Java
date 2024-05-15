// Estou fazendo a lista de exercício intitulada de Desafio: Hora da prática. Do curso de java orientação a objeto da alura

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 - Pessoa
        Pessoa fernando = new Pessoa();
        fernando.saudacao();

        // 2 - Calculadora
        // Pegando informação do usuário
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o número que você quer dobrar: ");
        int valor = leitura.nextInt();

        // Criando um objeto do tipo Calculadora
        Calculadora calculaDobro = new Calculadora();

        // Instanciando objeto CalculaDobro
        int resultadoDobro = calculaDobro.dobro(valor);
        System.out.println("Resultado calculo dobro = " + resultadoDobro);
        System.out.println();

        // 3 - Música
        // Criando um objeto do tipo música
        System.out.println("Informações sobre a música: ");
        Musica faixa = new Musica();
        faixa.avaliar(8.5);
        faixa.avaliar(9.8);
        faixa.avaliar(9.2);
        faixa.avaliar(5);
        faixa.exibirFichaTecnica();
        System.out.println("Média das avaliações da música: " + faixa.calculaMedia());
        System.out.println();

        // 4 - Carro
        // Criando objeto do tipo carro
        Carro informacaoCarro = new Carro();
        System.out.println("Informações sobre o carro: ");
        informacaoCarro.exibirFichaTecnica();
        System.out.println();

        // 5 - Aluno
        System.out.println("Digite o nome do aluno: ");
        // Limpando o buffer. Consumindo o /n pendende no buffer
        leitura.nextLine();
        String nomeAluno = leitura.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = leitura.nextInt();

        // Criando objeto do tipo aluno
        Aluno pessoaAluno = new Aluno();
        System.out.println();
        pessoaAluno.exibirInformacoes(nomeAluno, idade);



    }
}
