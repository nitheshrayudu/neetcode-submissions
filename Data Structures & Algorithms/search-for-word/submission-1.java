class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length; i++){
            for(int j=0;j<board[i].length; j++){
                if(dfs(board, word, 0, i,j)){
                    return true;
                }
            }
       }
        return false;
    }

    public boolean dfs(char[][] board,String word,int index,int i,int j){

        //check out of bound
        if(i <0 || i>= board.length || j <0 || j>= board[0].length){
            return false;
        }

        // check if the current char doesnt existin the board
        if(board[i][j] != word.charAt(index)){
            return false;
        }

        // If wecheck the given index == word length, then send true;
        if(index == word.length()-1){
            return true;
        }

        //mark the thing vistitest
        char temp = board[i][j];
        board[i][j] = '#';

        boolean result = dfs(board, word, index+1, i+1, j) ||
                         dfs(board, word, index+1, i-1, j) ||
                         dfs(board, word, index+1, i, j+1) ||
                         dfs(board, word, index+1, i, j-1);

        board[i][j] = temp;
        return result;

    }
}