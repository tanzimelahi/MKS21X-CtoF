public class CtoFTester{
 public static double  celciusToFarenhite(double n){
    return (n*9.0/5+32);
  }
 public static double fahrenhiteToCelcius(double n){
  return (n-32)*(5.0/9.0);
 }

public static void main(String[] args){
  System.out.println(celciusToFarenhite(28));
  System.out.println(fahrenhiteToCelcius(celciusToFarenhite(28)));
 }
}
