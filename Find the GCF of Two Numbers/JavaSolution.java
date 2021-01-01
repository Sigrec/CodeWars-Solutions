class Kata 
{
  public static int findGCF(int num1, int num2)
  {
    if (num2 == 0){
      return num1;
    }
    else{
      return findGCF(num2, num1 % num2);
    }
  }
}