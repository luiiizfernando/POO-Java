// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {
    String modelo = "Jetta";
    int ano = 2022;
    String cor = "Preto";
    int anoAtual = 2024;

    int calculoIdade()
    {
        return anoAtual - ano;
    }

    void exibirFichaTecnica()
    {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        if(calculoIdade() <= 1)
        {
            System.out.println("Idade do carro: " + calculoIdade() + " ano");
        }
        else
        {
            System.out.println("Idade do carro: " + calculoIdade() + " anos");
        }
    }


}
