class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        
        for(String s:sentences)
        {
            String arr[] = s.split(" ");
            
            ans = Math.max(ans,arr.length);
        }
        
        return ans;
    }
}
