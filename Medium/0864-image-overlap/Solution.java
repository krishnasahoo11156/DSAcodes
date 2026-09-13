class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int[][] points1 = new int[n * n][2];
        int[][] points2 = new int[n * n][2];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(img1[i][j] == 1){
                    points1[count1][0] = i;
                    points1[count1][1] = j;
                    count1++;
                }
                if(img2[i][j] == 1){
                    points2[count2][0] = i;
                    points2[count2][1] = j;
                    count2++;
                }
            }
        }
        int maxOverlap = 0;
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        for(int i = 0; i < count1; i++){
            for(int j = 0; j < count2; j++){
                int dx = points2[j][0] - points1[i][0];
                int dy = points2[j][1] - points1[i][1];
                String key = dx + "," + dy;
                int frequency = map.getOrDefault(key, 0) + 1;
                map.put(key, frequency);
                maxOverlap = Math.max(maxOverlap, frequency);
            }
        }
        return maxOverlap;
    }
}