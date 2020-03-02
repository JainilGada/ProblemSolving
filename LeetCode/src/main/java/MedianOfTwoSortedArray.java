public class MedianOfTwoSortedArray {
    /*
    * https://leetcode.com/problems/median-of-two-sorted-arrays/
    * */


    //Merge Sort, merge subroutine
    public static int[] merge(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] num = new int[n1+n2];
        int i = 0, j=0, k=0;
        while (i<n1&&j<n2)
        {
            num[k++]=nums1[i]>nums2[j]?nums2[j++]:nums1[i++];
        }

        while (i<n1)
        {
            num[k++]=nums1[i++];
        }
        while (j<n2)
        {
            num[k++]=nums2[j++];
        }
        return num;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] num = merge(nums1,nums2);
        int l = num.length;
       //finding median
       if(l%2!=0)      //size of array is odd
       {
           return num[l/2];
       }
       else                     //size of array is even
       {
           return (num[l/2-1]+num[l/2])/2.0;
       }
    }
}
