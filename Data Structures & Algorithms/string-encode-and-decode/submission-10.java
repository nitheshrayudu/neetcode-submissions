class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            int len = str.length();
            sb.append(len + "#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
           int j=i;

           while(j < str.length() && Character.isDigit(str.charAt(j))){
                j++;
           }

           String num = str.substring(i, j);
           System.out.println(num);

           // skip # j++
           j++;

           //now get the required string

           int sss = Integer.parseInt(num);

           result.add(str.substring(j, j+sss));
           i = j+sss;

        }

        return result;
    }
}
