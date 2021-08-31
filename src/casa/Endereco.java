package casa;

public class Endereco {
  private String rua;
  private int numero;
  private String bairro;
  private String cidade;
  private String estado;

  public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getRua() {
    return rua;
  }

  public String getBairro() {
    return bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEstado() {
    return estado;
  }

  public int getNumero() {
    return numero;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }
}
