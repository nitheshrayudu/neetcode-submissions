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
            int j = i;

            // Read all digits
            while (j < str.length() && Character.isDigit(str.charAt(j))) {
                j++;
            }

            // Parse the number
            int len = Integer.parseInt(str.substring(i, j));

            // Skip '#'
            j++;

            // Extract the word
            result.add(str.substring(j, j + len));

            // Move to next encoded string
            i = j + len;
        }

        return result;
    }
}
