package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        List<String> exists = null;
        List<String> every = null;

        for(Map.Entry entry:collection2.entrySet()){
            exists = new ArrayList<>(collection1);
            every = new ArrayList<>(collection1);

            exists.removeAll((List<String>)entry.getValue());
            every.removeAll(exists);
            result.addAll(every);
        }
        return result.stream().distinct().collect(Collectors.toList());
    }
}
