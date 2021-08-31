public class Product {
  public double product(int[] n){
    double result = 1.00;

    for(int i = 1; i < n.length; i++){
      result = result * n[i];
    }
    
    return result;
  }

  public static void main(String[] args) {
    Product app = new Product();

    System.out.println(app.product(new int[]{1,2,3,4,5}));
    System.out.println(app.product(new int[]{6,2,7,4,5, 8, 30}));
    System.out.println(app.product(new int[]{1, 2, 3, 4, 2, 10, 20}));
    System.out.println(app.product(new int[]{1,2,3,4,5,20,10,30,40,50}));
  }
}
