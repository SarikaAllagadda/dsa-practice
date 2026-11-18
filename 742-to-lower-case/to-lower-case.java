class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isUpperCase(ch)){
            sb.append(Character.toLowerCase(ch));
        }
        else{
            sb.append(ch);
        }
    }
    return sb.toString();    
    }
}