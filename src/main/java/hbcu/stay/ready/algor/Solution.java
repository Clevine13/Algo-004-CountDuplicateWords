package hbcu.stay.ready.algor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    public String countUniqueWords(String input){
        String product = "";

        HashMap<String,Integer> newmap = new HashMap<>();
        String modifiedInput = input.replace(".", "");
        String moreModifiedInput = modifiedInput.replaceAll("!", "");

        String[] output = moreModifiedInput.split("\\W");


        for(String i: output) {
            if(newmap.containsKey(i)){
                newmap.put(i,newmap.get(i) + 1);
            }
            else{
                newmap.put(i,1);
            }
        }
        Iterator<Map.Entry<String, Integer>> itr = newmap.entrySet().iterator();

        product += String.format("The %d unique words are:\n", newmap.size());

       while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();

            if (!itr.hasNext()){
                product += entry.getKey() + " (seen " + entry.getValue() + ")";
            }
            else{
                product += entry.getKey() + " (seen " + entry.getValue() + ")";
                product += "\n";
            }
        }
        return product;
    }
}
