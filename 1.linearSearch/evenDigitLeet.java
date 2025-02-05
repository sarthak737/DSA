package linearSearch;

public class evenDigitLeet {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int r=findNumbers(arr);
        System.out.println(r);
    }

        //sarthak
//        static int findNumbers(int[] nums) {
//        int res=0;
//            for (int i=0;i<nums.length;i++){
//                int el=nums[i];
//                int c=0;
//                while (el>0){
//                    el/=10;
//                    c++;
//                }
//                if(c%2==0){
//                    res++;
//                }
//            }
//            return res;
//        }

    static int findNumbers(int[] nums){
        int c=0;
        for (int n:nums){
            if(even(n)){
                c++;
            }
        }
        return c;
    }

    static boolean even(int n){
        int num=0;
//        while (n>0){
//            n/=10;
//            num++;
//        }
        num=(int)Math.log10(n)+1;
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }

}
