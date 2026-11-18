class Solution {
    public int countKeyChanges(String s) {
    String newSt=s.toLowerCase();
    int count=0;
    for(int i=1;i<newSt.length();i++){
    if(newSt.charAt(i)!=newSt.charAt(i-1)){
        count++;
    }
    }
    return count;    
    }
}