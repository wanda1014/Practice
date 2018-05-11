package cn.wanda.chapter14;
/**
 * list存数，然后移除下标对应的元素
 */

import java.util.LinkedList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        list.remove(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }

    }

}
