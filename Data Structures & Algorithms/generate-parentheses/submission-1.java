class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        bactracking(result, n, 0, 0, "");
        return result;
    }
    public void bactracking(List<String> result, int n, int opened, 
        int closed, String response){

        if(closed == n && opened == n){
            result.add(response);
            return;
        }

        if(opened < n){
            bactracking(result, n, opened+1, closed, response+'(');
        }
        if(closed < opened){
            bactracking(result, n, opened, closed+1, response+')');
        }

    }

}
