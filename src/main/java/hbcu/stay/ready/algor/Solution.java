package hbcu.stay.ready.algor;

import java.util.Collection;
import java.util.HashMap;

public class Solution {

    public String countUniqueWords(String input){
        int count = 0;
        HashMap<String,Integer> newmap = new HashMap<>();

        String [] output = input.split(" ");

        for(int i = 0; i < output.length; i++){

            if(newmap.containsKey(output[i])){
                count ++;
            }
        }
            return null;
    }
}
