public class Distance {
  public double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
  
  public static void main(String[] args) throws Exception {
    Distance app = new Distance();
    int[] p1 = {4, 2};
    int[] p2 = {2, 6};

    System.out.println(app.distance(p1[0], p1[1], p2[0], p2[1]));
  }
}
