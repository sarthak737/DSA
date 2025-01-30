package linearSearch;

public class richestCustomerLeet {
    public static void main(String[] args) {
        int[][] arr={{1,5},{7,3},{3,5}};
        int c=maximumWealth(arr);
        System.out.println(c);
    }
//sarthak
//        static public int maximumWealth(int[][] accounts) {
//            int w=-1;
//            int[] sum=new int[accounts.length];
//            for (int i=0;i<accounts.length;i++){
//                int s=0;
//                for (int j=0;j<accounts[i].length;j++){
//                    s+=accounts[i][j];
//                }
//                sum[i]=s;
//            }
//            for (int k=0;k<sum.length;k++){
//                if(sum[k]>w){
//                    w=sum[k];
//                }
//            }
//            return w;
//        }

            static public int maximumWealth(int[][] accounts) {
                int sum=0;
                for (int i=0;i<accounts.length;i++){
                    int s=0;
                    for (int j=0;j<accounts[i].length;j++){
                        s+=accounts[i][j];
                    }
                    if(sum<s) {
                        sum = s;
                    }
                }
                return sum;
            }
}
