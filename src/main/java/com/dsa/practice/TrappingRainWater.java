package com.dsa.practice;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int l =0, r=height.length-1;
        int lmax=0, rmax=0;
        int total=0;
        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    total+=lmax-height[l] ;
                } else{
                    lmax=height[l];
                }
                l = l+1;
            } else {
                if(rmax>=height[r]){
                    total+=rmax-height[r];
                } else {
                    rmax=height[r];
                }
                r=r-1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
