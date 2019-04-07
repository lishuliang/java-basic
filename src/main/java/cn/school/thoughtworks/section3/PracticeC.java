package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        cn.school.thoughtworks.section2.PracticeC practice = new cn.school.thoughtworks.section2.PracticeC();
        Map<String,Integer> collect = practice.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB practiceB_section3 = new cn.school.thoughtworks.section3.PracticeB();
        return practiceB_section3.createUpdatedCollection(collect, object);
    }
}
