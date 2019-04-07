package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> exists = null;
        List<String> every = null;
        List<String> result = new ArrayList<>();

        for (List<String> array:collection2
             ) {
            exists = new ArrayList<>(collection1);
            every = new ArrayList<>(collection1);

            exists.removeAll(array);
            every.removeAll(exists);
            result.addAll(every);
        }

        return result.stream().distinct().collect(Collectors.toList());
    }
}
