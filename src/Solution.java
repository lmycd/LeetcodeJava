/**
 * Created by liunian on 2017/3/6.
 */
//class Solution {
//     int lengthOfLastWord(String s) {
//         int start=-1,end=-1;
//         int i = s.length()-1;
//
//
//         while(i>=0&&s.charAt(i)==' ') i--;
//         start=i;
//         while(i>=0&&s.charAt(i)!= ' ') i--;
//         end=i;
//         return start-end;
//
//
//
//
//
//    }
//}

//public class Solution {
//    public int[] plusOne(int[] digits) {
//        int k=1;
//        for(int i =digits.length-1;i>=0;i--){
//            digits[i]+=k;
//            k=digits[i]/10;
//            digits[i]=digits[i]%10;
//        }
//        if(k>0)
//        {
//            int[] a=new int[digits.length+1]; //创建数组对象的方法？？？
//
//            a[0]=k;
//            for(int j=0;j<digits.length;j++){
//                a[j+1]=digits[j];
//            }
//            return a;
//        }
//        return digits;
//
//    }
//}

//88. Merge Sorted Array
/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.*/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&j>=0){
            if (nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];

            }
            else
            {
                nums1[k--]=nums1[i--];
                nums1[k--]=nums2[j--];
            }


        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }



    }
}