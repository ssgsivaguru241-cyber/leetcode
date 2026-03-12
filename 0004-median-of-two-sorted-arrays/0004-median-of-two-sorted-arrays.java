import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int merge[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                merge[k++] = nums1[i++];
            }
            else{
                merge[k++] = nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            merge[k++] = nums1[i++];
        }
        while(j<nums2.length)
        {
            merge[k++] = nums2[j++];
        }
        int a = merge.length;
        if(a % 2 == 0){
            return (merge[a/2-1]+merge[a/2])/2.0;
        }
        else
        {
            return (merge[a/2]);
        }
        
    }

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int m= sc.nextInt();
    int[] nums1 = new int[m];
    int n = sc.nextInt();
    int[] nums2 = new int[n];
    for(int i=0;i<m;i++)
    {
        nums1[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        nums2[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    double med = sol.findMedianSortedArrays(nums1,nums2);
    System.out.println(med);
}
}