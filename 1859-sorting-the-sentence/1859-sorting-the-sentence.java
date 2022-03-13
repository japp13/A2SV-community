class Solution {
    public String sortSentence(String s) {
        String[] sen = s.split(" ");
        String[] temp = new String[sen.length];
        String answer = "";
       

        
        for(int i=0; i<sen.length;i++)
        {
            int index = sen[i].charAt(sen[i].length()-1)-'0';
            String tempp = sen[i].substring(0,sen[i].length()-1);
            temp[index-1] = tempp;
            
            
            
        }
 for(int i=0; i<temp.length; i++){
     answer+=temp[i];
     answer+=" ";
     
 }
        
        return answer.substring(0,answer.length()-1);
    }
}