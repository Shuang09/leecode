package Median_of_Two_Sorted_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by Shaun on 2018/11/15.
 */
/*
* There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5*/
public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int []nums1={1,3};
        int []nums2={2,4};
        int m = nums1.length;
        int n = nums2.length;
        int a[] = new int[n+m] ;
        //！-------复杂度0(n*ln[n])
       /* System.arraycopy(nums1,0,a,0,nums1.length);

//        System.out.println("num1 after arraycopy"+ Arrays.toString(nums1));

        System.out.println("a after arraycopy nums1"+Arrays.toString(a));

        System.arraycopy(nums2,0,a,m,nums2.length);
        System.out.println("a after arraycopy nums2"+Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("a after sort"+Arrays.toString(a));

        *//*A?B:C 意思就是如果A为真执行B，否则执行C*//*
        double median = (( n + m )% 2 ==0 ) ? (0.5 * ( a [ ( n + m ) / 2 ] + a [ ( n + m ) / 2 -1] )):a [ ( n + m )/2 ];
        System.out.println(median);
       */
        int i=0; int j=0; int k =0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]) a[k++]=nums1[i++];
            else a[k++]=nums2[j++];
        }
        while (i<nums1.length){
            a[k++]=nums1[i++];
        }
        while (j<nums2.length){
            a[k++]=nums2[j++];
        }
        System.out.println(Arrays.toString(a));
        double median = (( n + m )% 2 ==0 ) ? (0.5 * ( a [ ( n + m ) / 2 ] + a [ ( n + m ) / 2 -1] )):a [ ( n + m )/2 ];
        System.out.println(median);

    }

}
