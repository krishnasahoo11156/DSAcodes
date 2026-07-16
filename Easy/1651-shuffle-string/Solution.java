class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            while (indices[i] != i) {

                char tempChar = arr[i];
                arr[i] = arr[indices[i]];
                arr[indices[i]] = tempChar;

                int tempIndex = indices[i];
                indices[i] = indices[tempIndex];
                indices[tempIndex] = tempIndex;
            }
        }
        return new String(arr);
    }
}