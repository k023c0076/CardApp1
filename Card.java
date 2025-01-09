package CardApp1;

import java.util.Arrays;
import java.util.List;
//import java.util.Random;

public class Card {
    int num;
    String result1;
    String result2;
    List<String> mark = Arrays.asList("スペード", "ダイヤ", "クローバー", "ハート"); 

    void choose(){
        num = (int)(Math.random() * 13) + 1;
        result2 = String.valueOf(num);
        if(num >= 10){
            result2 = result2.replace("11","ジャック")
            .replace("12","クイーン").replace("13","キング");
        }

        //int index = new Random().nextInt(mark.size()); 
        int index = (int)(Math.random() * 4);
        result1 = mark.get(index);
    }
}
