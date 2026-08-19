class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int left = 0, right = height.length-1;

        while(left<right){
            int length = right - left;
            int currentWater = Math.min(height[left], height[right])*length;
            water = Math.max(water, currentWater);

            if(height[left]>height[right]) right --;
            else left ++;
        }

        return water;
    }
}