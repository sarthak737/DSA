package binarySearch;

public class InfiniteArrayAmazon {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int target=8;
        int r=search(arr,target);
        System.out.println(r);
    }

    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        while (target>end){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return -1;
    }
}
