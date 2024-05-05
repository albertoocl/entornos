import java.util.Scanner;

public class e {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n;
    boolean p = true;
    
    System.out.print("Ingrese un número: ");
    n = sc.nextInt();
    
    if(n < 2) {
      System.out.println("El número debe ser mayor o igual a 2.");
      return;
    }
    
    for(int i=2; i<n; i++) {
      if(n % i == 0) {
        p = false;
        break;
      }
    }
    
    if(p) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
    }
    
  }
  
}