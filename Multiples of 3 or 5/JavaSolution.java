public class Solution {

  public int solution(int number) {
    if (number < 3){
      return 0;
    }
    else{
      int numThrees = (number % 3 == 0) && (number % 5 != 0) ? number / 3 - 1 : number / 3;
      int numFives = number % 5 == 0 ? number / 5 - 1 : number / 5;
      int count = 0;
      for (int x = 1; x <= numThrees; x++){
        count = count + (3 * x);
        if ((x > numFives) || ((5 * x) % 3 == 0)) continue;
        System.out.println(x);
        count = count + (5 * x);
      }
      return count;
    }
  }
}