package binarySearch;

public class rotatedSortedArrayLeet {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int peak=peak(arr);
        int t=4;

        if(peak==-1){
            System.out.print(search(arr,t,0,arr.length-1));
            return;
        }
        if(t>=arr[0]){
            System.out.println(search(arr,t,0,peak));
        } else{
            System.out.println(search(arr,t,peak+1,arr.length-1));
        }


    }

    static int peak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int pivot=-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            } else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[mid]<arr[start]){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int search(int[] arr,int t,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==t){
                return mid;
            } else if(arr[mid]>t){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}
