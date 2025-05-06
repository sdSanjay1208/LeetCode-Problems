class Solution {
    public boolean isPalindrome(int x) {
        int c=0;
        int temp=x;
        if(x<0){
        return false;
        }
        while(x!=0)
        {
            int digit=x%10;
            c=c*10+digit;
            x=x/10;
        }
        if(temp==c)
        return true;
        else
        return false;   
    }

}
