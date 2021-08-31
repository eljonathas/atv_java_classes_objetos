public class Rectangle {
  private double width = 1;
  private double length = 1;

  public void setLength(double length) {
    if (length > 0 && length < 20) {
      this.length = length;
    } else {
      System.out.println("Comprimento inválido. O valor deve estar entre 0 e 20.");
    }
  }

  public void setWidth(double width) {
    if (width > 0 && width < 20) {
      this.width = width;
    } else {
      System.out.println("Largura inválida. O valor deve estar entre 0 e 20.");
    }
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public static void main(String[] args) {
    Rectangle rect = new Rectangle();

    rect.setLength(10);
    rect.setLength(30);
    rect.setWidth(5);
    rect.setWidth(0);

    System.out.println("Largura: " + rect.getWidth());
    System.out.println("Comprimento: " + rect.getLength());
  }
}
