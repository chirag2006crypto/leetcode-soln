class Solution {
    public String[] findWords(String[] words) {
         String q= "qwertyuiopQWERTYUIOP";
    String a = "asdfghjklASDFGHJKL";
    String z = "zxcvbnmZXCVBNM";
    ArrayList<String> temp = new ArrayList<>();
        for(String word: words){
           //word-> hello 
           String row;
           if(q.contains(word.charAt(0)+"")){
            row = q;
           }
           else if(a.contains(word.charAt(0)+"")){
            row = a;

           }
           else{
            row = z;

           }
           boolean flag = true ;
           for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!row.contains(ch+"")){
                flag = false;
            }
           }
           if(flag){
            temp.add(word);

           }

        }

        String[] ans = new String[temp.size()];
        int k = 0;
        for(String ele: temp ){
            ans[k]=ele;
            k++;
        }
        return ans;
    }
}