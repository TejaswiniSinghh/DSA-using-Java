class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merge= new int[nums1.length+ nums2.length];
        int n=0;
        for(int i=0; i<nums1.length; i++)
        {
            merge[i]=nums1[i];
            n++;
        }
        for(int j=0; j<nums2.length; j++)
        {
            merge[n++] =nums2[j];
        }
        Arrays.sort(merge);
        int len= merge.length;
        if(len%2 ==0)
        {
            return (merge[len/2] + (merge[(len/2)-1])) /2.0;

        }
        return merge[len/2];
    }
}