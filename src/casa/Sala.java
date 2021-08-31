package casa;

public class Sala {
  private int quantidadeDePessoasNaSala = 0;

  public void setQuantidadeDePessoasNaSala(int quantidadeDePessoasNaSala) {
    this.quantidadeDePessoasNaSala = quantidadeDePessoasNaSala;
  }

  public int getQuantidadeDePessoasNaSala() {
    return quantidadeDePessoasNaSala;
  }

  public void adicionarPessoaNaSala() {
    quantidadeDePessoasNaSala++;
  }

  public void removerPessoaNaSala() {
    quantidadeDePessoasNaSala--;
  }
}
