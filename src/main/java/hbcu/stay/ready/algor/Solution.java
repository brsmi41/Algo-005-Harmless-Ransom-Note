package hbcu.stay.ready.algor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){
        Set<Boolean> answer = new LinkedHashSet<>();
       String[] updatedMessage = message.split(" ");
        String[] updatedMagazineText = magazineText.split(" ");
        /*for(String a : updatedMagazineText){
          if(answer.contains(updatedMessage)){
              return true;
          }

        }*/


        return updatedMagazineText.equals(updatedMessage);
    }
}
