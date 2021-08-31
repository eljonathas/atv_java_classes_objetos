public class Minimum {
  public int getMin(int[] arr) {
    int min = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      min = Math.min(min, arr[i]);
    }
    
    return min;
  }
  
  public static void main(String[] args) throws Exception {
    Minimum min = new Minimum();
    
    int[] arr = {5, 2, 10};
    
    System.out.println(min.getMin(arr));
  }
}
