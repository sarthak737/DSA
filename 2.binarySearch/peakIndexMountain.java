package binarySearch;

public class peakIndexMountain {
    public static void main(String[] args) {
        int[] arr={0,1,2,0};
        int r=peakIndexInMountainArray(arr);
        System.out.println(r);
    }

//     static int peakIndexInMountainArray(int[] arr) {
//        int r=-1;
//        int max=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                r=i;
//            }
//        }
//        return r;
//    }
static int peakIndexInMountainArray(int[] arr) {
    int start=0;
    int end=arr.length-1;
    while (start< end){
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
        if(arr[mid]<arr[mid+1]){
            start=mid+1;
        }
    }
    return end;
}
}
