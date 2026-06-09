class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);

            int countR=0;
            int countM=0;

            for(int j=0;j<ransomNote.length();j++){
                if(ransomNote.charAt(j)==ch){
                    countR++;
                }
            }
            for(int k=0;k<magazine.length();k++){
                if(magazine.charAt(k)==ch){
                    countM++;
                }
            }
            if(countR>countM){
                return false;
            }

        }
        return true;
    }
}