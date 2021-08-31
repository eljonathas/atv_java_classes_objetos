package casa;

public class Quarto {
  private int quantidadeDePessoas = 0;

  public void setQuantidadeDePessoas(int quantidadeDePessoas) {
    this.quantidadeDePessoas = quantidadeDePessoas;
  }

  public int getQuantidadeDePessoas() {
    return quantidadeDePessoas;
  }

  public boolean isQuartoOcupado() {
    return quantidadeDePessoas > 0;
  }

  public void ocuparQuarto(int quantidadeDePessoas) {
    this.quantidadeDePessoas = quantidadeDePessoas;
  }

  public void desocuparQuarto() {
    this.quantidadeDePessoas = 0;
  }
}
