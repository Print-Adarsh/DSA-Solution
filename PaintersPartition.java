public class PaintersPartition {
    // User function Template for Java

    class Solution {
        public int minTime(int[]C, int A) {
            // code here
            int n=C.length;
            long l=0;
            long h=0;

            //min //max
            for(int i=0;i<n;i++)
            {
                l=Math.max(l,C[i]); //sbsay ,max element from array
                h+=C[i]; // summation of all element
            }
            long ans=h; //want min- therefore initialise max

            while(l<=h)
            {
                long mid=l+(h-l)/2;

                if(check(C,A,mid))
                {
                    //if true

                    ans=(mid) ;
                    //go left for optimal
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            return (int)ans;

        }

        //check function
        public static boolean check(int[]arr, int worker,long mid)
        {
            int sum=0;
            int painter=1;
            int n=arr.length;

            for(int i=0;i<n;i++)
            {
                sum+=arr[i];

                if(sum>mid)
                {
                    painter++; //assign new painters
                    sum=arr[i];

                }
                if(painter>worker)
                {
                    return false;
                }
            }
            return true;


        }
    }

}
