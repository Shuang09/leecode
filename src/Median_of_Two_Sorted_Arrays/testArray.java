package Median_of_Two_Sorted_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Shaun on 2018/11/16.
 */
public class testArray {
    public static void main(String[] args) {
        int [] a = {1,2};
        int []a_cp=new int[2];

        System.arraycopy(a,0,a_cp,0,2);
        System.out.println(Arrays.toString(a_cp));

        int[] ids = {1, 2, 3, 4, 5};

        // 1、测试复制到别的数组上
        // 将ids数组的索引从0开始其后5个数，复制到ids2数组的索引从0开始
        int[] ids2 = new int[5];
        System.arraycopy(ids, 0, ids2, 0, 5);
        System.out.println(Arrays.toString(ids2));
    }
}
