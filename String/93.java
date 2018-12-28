class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(result,temp,s);
        return result;

    }

    private void dfs(List<String> result,List<String> tempList,String raw){
       if(raw.length()==0){
           if(tempList.size()==4){
               StringBuilder ip = new StringBuilder();
               for(String iter:tempList){
                   ip.append(iter+".");
               }
               ip.deleteCharAt(ip.length()-1);
               result.add(ip.toString());
           }


       }else {
           if(raw.length()>(4-tempList.size())*3) return;
           for(int i=1;i<4;i++){
               if(i>raw.length()) break;
               String subString = raw.substring(0,i);
               if(subString.charAt(0)=='0'&&subString.length()>1) continue;
               int subIp=Integer.parseInt(subString);
               if(subIp>=0&&subIp<=255){
                   tempList.add(subString);
                   dfs(result,tempList,raw.substring(i));
                   tempList.remove(tempList.size()-1);
               }
           }
       }
    }
}