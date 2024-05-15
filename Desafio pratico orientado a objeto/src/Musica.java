/* 3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
 e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
*/

public class Musica {
    String titulo = "Candy shop";
    String artista = "50 cent";
    int anoLancamento = 2005;
    double avaliacao;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void avaliar(double avaliacao)
    {
        somaDasAvaliacoes += avaliacao;
        numAvaliacoes++;
    }

    double calculaMedia()
    {
        return somaDasAvaliacoes / numAvaliacoes;
    }

    void exibirFichaTecnica()
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
}
