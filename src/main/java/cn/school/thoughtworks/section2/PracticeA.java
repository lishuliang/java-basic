package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        /*for (String a : collection1) {
            map.merge(a, 1, Integer::sum);
        }*/
        for (String s : collection1){
            if(map.containsKey(s)) {
                map.put(s,map.get(s) + 1);
            } else {
                map.put(s,1);
            }
        }
        return map;
    }
}
