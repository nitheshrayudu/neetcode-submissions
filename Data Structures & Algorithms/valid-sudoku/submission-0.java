class Solution {
    public boolean isValidSudoku(char[][] board) {
        System.out.println("Bioard LEngth"+ board.length);

          // Track seen digits for rows, cols, and 3x3 boxes
        Set<Character>[] rows  = new HashSet[9];
        Set<Character>[] cols  = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i]  = new HashSet<>();
            cols[i]  = new HashSet<>();
            boxes[i] = new HashSet<>();
        }


        for(int r=0; r< board.length ; r++){

            for(int c=0; c< board.length; c++){
                char val = board[r][c];

                if (val == '.'){
                    continue;
                }
                int boxID= r/3 * 3 + c/3;

                if(rows[r].contains(val) || cols
                [c].contains(val) || boxes[boxID].contains(val)){
                    return false;
                }
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxID].add(val);
            }
            //System.out.println("");
        }
        return true;
    }
}
