class Solution {
    public int countDigits(int num) {
    int count=0;
    int temp=num;
    while(temp>0){
    int lastdigit=temp%10;
    if(num%lastdigit==0){
    count++;
    }
    temp/=10;
    }
    return count;    
    }
}