package cn.wanda.chapter14;
/**
 * map存对象，然后根据key删除元素
 */

import java.util.Map;
import java.util.TreeMap;

public class Practice3 {

    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        
        Emp e1 = new Emp("001", "张三");
        Emp e2 = new Emp("005", "李四");
        Emp e3 = new Emp("010", "王五");
        Emp e4 = new Emp("015", "赵六");
        Emp e5 = new Emp("020", "孙七");
        
        map.put(e1.getId(),e1.getName());
        map.put(e2.getId(),e2.getName());
        map.put(e3.getId(),e3.getName());
        map.put(e4.getId(),e4.getName());
        map.put(e5.getId(),e5.getName());

        for (String str: map.keySet()) {
            System.out.print(map.get(str)+"\t");
        }

        System.out.println();
        map.remove("015");

        for (String str: map.keySet()) {
            System.out.print(map.get(str)+"\t");
        }

    }

}

class Emp{
    private String id;
    private String name;

    public Emp(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
