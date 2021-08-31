package casa;

public class Cozinha {
  private int quantidadeDePessoas = 0;

  public void setQuantidadeDePessoas(int quantidadeDePessoas) {
    this.quantidadeDePessoas = quantidadeDePessoas;
  }

  public int getQuantidadeDePessoas() {
    return quantidadeDePessoas;
  }

  public void entraNaCozinha(int quantidadeDePessoas) {
    this.quantidadeDePessoas += quantidadeDePessoas;
  }

  public void saiDaCozinha(int quantidadeDePessoas) {
    this.quantidadeDePessoas -= quantidadeDePessoas;
  }

  public void limpaCozinha() {
    this.quantidadeDePessoas = 0;
  }
}
