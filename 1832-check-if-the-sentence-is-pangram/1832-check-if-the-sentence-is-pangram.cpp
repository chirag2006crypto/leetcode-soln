class Solution {
public:
    bool checkIfPangram(string sentence) {
       
        for(int i=0;i<26;i++){
            char ch = char(i+97);
            if(!sentence.contains(ch)){
                return false;

            }
    }
    return true ;
    }
};