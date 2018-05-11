package cn.wanda.chapter14;
/**
 * 结论：List集合里面可以重复添加元素
 *       Set集合里面不能重复添加元素
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice2 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");

        System.out.println(set);
        System.out.println(list);

    }

}
