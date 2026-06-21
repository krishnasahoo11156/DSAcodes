class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length + nums2.length];
        for(int i = 0; i<nums1.length; i++){
            answer[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            answer[nums1.length + i] = nums2[i];
        }

        Arrays.sort(answer);           // 1,2,3,4,5,6,7,8
        if(answer.length % 2 == 0){
            int mid = answer.length / 2;
            return (double) (answer[mid] + answer[mid - 1])/2;
        }
        else{
            int mid = answer.length / 2;
            return answer[mid];
        }
    }
}