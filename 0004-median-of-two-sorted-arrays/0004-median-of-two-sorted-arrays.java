class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merge= new int[nums1.length+ nums2.length];
        int index=0;
        for(int i=0; i<nums1.length; i++)
        {
            merge[i]=nums1[i];
            index++;
        }
        for(int j=0; j<nums2.length; j++)
        {
            merge[ index++] =nums2[j];
        }
        Arrays.sort(merge);
        int length= merge.length;
        if(length%2 ==0)
        {
            int mid =length/2;
            int sum= merge[mid]+merge[mid-1];
            double med= sum/2.0;
            return med;

        }
        int mid= length/2;
        double med= merge[ mid];
        return med;
    }
}