PROBLEM LINK: https://leetcode.com/problems/distance-between-bus-stops/description/


class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int temp=0;int tar=0;
        for(int i=0;i<distance.length;i++)
        {
            sum=sum+distance[i];
        }
        if(start>destination)
        {
            temp=start;
            start=destination;
            destination=temp;

        }
        for(int i=start;i<destination;i++)
        {
            tar=tar+distance[i];
        }
        return Math.min(tar,sum-tar);
    }
}
