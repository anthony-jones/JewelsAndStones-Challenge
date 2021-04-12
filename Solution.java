import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  
  //METHOD 1
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == (jewels.charAt(j))){
                    count++;
                }
            }
        }
        return count;
    }
  
  //METHOD 2
    public int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        String[] splitStones = stones.split("");
        String[] splitJewels = jewels.split("");
        List<String> jewelList = Arrays.asList(splitJewels);
        for(String stone : splitStones){
            if(jewelList.contains(stone)){
                count++;
            }
        }
        return count;
    }
}
