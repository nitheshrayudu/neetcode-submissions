class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(int i=0;i < strs.size(); i++){
            result = result + strs.get(i).length() + "#" + strs.get(i);
        }
        //System.out.print(result);
        return result;
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int i =0;
        while (i < str.length() && str.length() > 0) {
            int j=i;  

            while(str.charAt(j) != '#'){
                j++;
            }
            int number = Integer.parseInt(str.substring(i, j));

            result.add(str.substring(j+1,j+1+number));

            i= j+1+number;
            
        }

        return result;
    }

}
