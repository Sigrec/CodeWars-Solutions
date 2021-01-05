import java.util.ArrayList;
import java.util.List;

public class SqInRect {
	public static List<Integer> sqInRect(int lng, int wdth) {
	  if(lng == wdth){
      return null;
    }
    else{
      int recSize = lng * wdth;
      int min = Math.min(lng, wdth);
      int max = Math.max(lng, wdth);
      int temp, count;
      List<Integer> output = new ArrayList<Integer>();
      while(recSize != 0){
        count = max / min;
        for (int x = 0; x < count; x++){
          output.add(min);
        }
        recSize = recSize - (min * min * count);
        max = min;
        min = recSize / min;
      }
      return output;
    }
	}
}