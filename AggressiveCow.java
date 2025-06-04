public class AggressiveCow {

    public static int aggressiveCows(int[] A, int B) {
        // code here

        int n=A.length;
        Arrays.sort(A);
        int l=1;
        int h=A[n-1]-A[0];
        int ans=l;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(check(A,B,mid))
            {
                ans=mid;
                //distance aaur v ho skta hai therfore go right
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return ans;
    }
    //chechk function
    public static boolean check(int[]A, int cow, int mid)
    {
        int n=A.length;
        int count=1;
        int j=0;

        for(int i=1;i<n;i++)
        {
            if(A[i]-A[j]>=mid)
            {
                j=i;
                count++;
            }
            if(count>=cow)
            {
                return true;
            }
        }
        return false;

    }
}
