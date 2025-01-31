package binarySearch;

public class smallestLetterLeet {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='g';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
