class Solution {
    public int countDigits(int num) {
        int c=0,val=0,num1=num;
        while(num!=0)
        {
            val=num%10;
            if(num1%val==0)
            c++;
            num=num/10;

        }
        return c;
    }
}
