class Solution {
    public int minAddToMakeValid(String s) {
    int closing=0;
    int open=0;
    for(char ch:s.toCharArray()){
        if(ch=='('){
            open++;
        }
        else{
            if(open>0){
            open--;
            }
            else{
                closing++;
            }
        }
    }
  return open+closing;
    }
}