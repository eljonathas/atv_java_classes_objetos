package casa;

public class Banheiro {
  private int quantidadeDePessoas;
  private boolean banheiroLivre;

  public Banheiro() {
    this.quantidadeDePessoas = 0;
    this.banheiroLivre = true;
  }

  public void setBanheiroLivre(boolean banheiroLivre) {
    this.banheiroLivre = banheiroLivre;
  }

  public void setQuantidadeDePessoas(int quantidadeDePessoas) {
    this.quantidadeDePessoas = quantidadeDePessoas;
  }

  public int getQuantidadeDePessoas() {
    return quantidadeDePessoas;
  }

  public boolean isBanheiroLivre() {
    return banheiroLivre;
  }

  public void entraNoBanheiro(int quantidadeDePessoas) {
    if (this.banheiroLivre) {
      this.quantidadeDePessoas += quantidadeDePessoas;
      this.banheiroLivre = false;
    }

  }

  public void saiDoBanheiro(int quantidadeDePessoas) {
    if (!this.banheiroLivre) {
      this.quantidadeDePessoas -= quantidadeDePessoas;
      if (this.quantidadeDePessoas == 0) {
        this.banheiroLivre = true;
      }
    }
  }

  public void limpaBanheiro() {
    this.quantidadeDePessoas = 0;
    this.banheiroLivre = true;
  }
}
