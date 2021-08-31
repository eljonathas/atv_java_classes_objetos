package casa;

public class Garagem {
  private int numeroDePortas;
  private int numeroDeVagas;
  private int numeroDeVagasOcupadas;

  public Garagem(int numeroDePortas, int numeroDeVagas) {
    this.numeroDePortas = numeroDePortas;
    this.numeroDeVagas = numeroDeVagas;
    this.numeroDeVagasOcupadas = 0;
  }

  public int getNumeroDePortas() {
    return numeroDePortas;
  }

  public int getNumeroDeVagas() {
    return numeroDeVagas;
  }

  public int getNumeroDeVagasOcupadas() {
    return numeroDeVagasOcupadas;
  }

  public void setNumeroDePortas(int numeroDePortas) {
    this.numeroDePortas = numeroDePortas;
  }

  public void setNumeroDeVagas(int numeroDeVagas) {
    this.numeroDeVagas = numeroDeVagas;
  }

  public void setNumeroDeVagasOcupadas(int numeroDeVagasOcupadas) {
    this.numeroDeVagasOcupadas = numeroDeVagasOcupadas;
  }
}
