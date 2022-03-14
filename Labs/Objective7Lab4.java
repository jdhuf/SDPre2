public class Objective7Lab4 {
  public static void main(String[] args) {
    int count, sum;
    count = 1;
    sum = 0;

    while (count <= 20) {
      sum = count + sum;
      count = count + 1;
    }
    System.out.println(sum);
  }
}
