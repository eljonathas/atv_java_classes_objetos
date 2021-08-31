package casa;

public class Casa {
  Banheiro banheiro;
  Garagem garagem;
  Cozinha cozinha;
  Sala sala;
  Quarto quarto;
  Endereco endereco;

  public Casa(Endereco endereco) {
    this.banheiro = new Banheiro();
    this.garagem = new Garagem(1, 4);
    this.cozinha = new Cozinha();
    this.sala = new Sala();
    this.quarto = new Quarto();
    this.endereco = endereco;
  }

  public static void main(String[] args) {
    Endereco endereco = new Endereco("Rua dos Bobos", 123, "Bairro dos Bobos", "Cidade dos Bobos", "Estado dos Bobos");
    Casa casa = new Casa(endereco);

    casa.quarto.ocuparQuarto(4);
    casa.banheiro.entraNoBanheiro(1);
    casa.cozinha.entraNaCozinha(2);

    System.out.println(casa.quarto.getQuantidadeDePessoas());
    System.out.println(casa.banheiro.getQuantidadeDePessoas());
    System.out.println(casa.cozinha.getQuantidadeDePessoas());

    casa.quarto.desocuparQuarto();
    casa.banheiro.limpaBanheiro();
    casa.cozinha.limpaCozinha();
  }
}
