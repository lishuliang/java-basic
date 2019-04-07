package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> map = new HashMap<>();

        for(String s : collection1) {
            if(s.length() == 1) {
                updateMap(s, map, 1);
            } else {
                specialData(s, map);
            }
        }
        return map;
    }

    public void updateMap(String s, Map<String ,Integer> map, Integer num){
        if(map.containsKey(s)) {
            map.put(s, map.get(s) + num);
        } else {
            map.put(s, num);
        }
    }

    public void specialData(String s, Map<String ,Integer> map){
        s = s.replaceAll("\\-|\\:|\\[|\\]", "");
        updateMap(s.substring(0,1), map, Integer.parseInt(s.substring(1)));
    }
}
