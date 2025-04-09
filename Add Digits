class Solution {
    public int addDigits(int num) {
        int res=0,res1=0,res2=0;
        while(num!=0)
        {
            int n=num%10;
            res+=n;
            num=num/10;
        }
        if(res<10){
        return res;
        }
        else
        {
            while(res!=0){
            int m=res%10;
             res1+=m;
            res=res/10;
            }
            //return res1;
            if(res1<10)
            {
                return res1;
            }
            else
            {
                while(res1!=0){
            int m1=res1%10;
             res2+=m1;
            res1=res1/10;
            }
            return res2;
            }
        }
       /* int n=num/10;
        int m=num%10;
        int o=n+m;
        if(o<10)
        {
            return o;
        }
        else
        {
            int n1=o/10;
            int n2=o%10;
            int o2=n1+n2;
            return o2;
        }*/
        
    }
}
