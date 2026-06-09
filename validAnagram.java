/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.


*/
class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
     char ch = s.charAt(i);

     int countS = 0;
     int countT = 0;

     for(int j = 0; j < s.length(); j++) {
        if(s.charAt(j) == ch) {
            countS++;
        }
    }
     for(int k=0;k<t.length();k++){
        if(t.charAt(k)==ch){
            countT++;
        }
     }
     if(countS!=countT){
        return false;
     }
    }
       return true;
    }
}