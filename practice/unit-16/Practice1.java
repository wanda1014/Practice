package cn.wanda.chapter16;

import java.lang.reflect.Array;

/**
 * 利用反射实现通用扩展数组长度的方法
 */

public class Practice1 {

    public static void main(String[] args) {

        //定义两个不同类型的数组来做数组长度扩展测试
        int[] array1 = new int[]{1,3,5};
        String[] array2 = new String[]{"A","b","C","D"};

        //输出扩展前的数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
        //调用扩展方法对数组进行扩展
        int[] array11 = (int[]) addArrayLength(array1,10);
        //输出扩展后的数组
        for (int i = 0; i < array11.length; i++) {
            System.out.print(array11[i]+"\t");
        }

        //分界线
        System.out.println();
        System.out.println("------------");

        //扩展前的数组
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"\t");
        }
        System.out.println();
        String[] array22 = (String[]) addArrayLength(array2,10);
        //扩展后的数组
        for (int i = 0; i < array22.length; i++) {
            System.out.print(array22[i]+"\t");
        }


    }

    //扩展数组的通用方法
    public static Object addArrayLength(Object oldArray, int newLength){
        Object newArray = null;
        //利用反射
        Class componentType = oldArray.getClass().getComponentType();

        //产生新数组
        newArray = Array.newInstance(componentType, newLength);
        //将旧数组里面的值拷贝到新数组中，其他位置用0或者null填充
        System.arraycopy(oldArray, 0, newArray, 0, Array.getLength(oldArray));

        return newArray;
    }


}
