import java.util.Hashtable;
public class FindOdd {
  public static int findIt(int[] a) {
    int odd = 0;
    if (a == null){
      return 0;
    }
    else if (a.length == 1){
      return a[0];
    }
    else{
      Hashtable<Integer, Integer> map = new Hashtable<>();
      for (int x = 0; x < a.length; x++){
        if (map.containsKey(a[x])){
          map.replace(a[x], map.get(a[x]) + 1);
        }
        else{
          map.put(a[x], 1);
        }
      }
      for (int x : map.keySet()){
        if (map.get(x) % 2 != 0){
          odd = x;
          break;
        }
      }
    }
    return odd;
  }
}