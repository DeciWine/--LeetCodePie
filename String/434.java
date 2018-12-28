class Solution {
    public int countSegments(String s) {
        int count = 0;
        String[] segments = s.split(" ");
        for(String iter:segments)
            if(!iter.equals("")) 
                count++;
        return count;
    }
}