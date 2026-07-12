class Solution {
    public boolean isValidSudoku(char[][] board) {
        System.out.println("Bioard LEngth"+ board.length);
        // Create the HashSet for the rows, columns and the boxes.
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        // Initialize all the values
        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i=0; i< rows.length;i++){
            for(int j=0; j< columns.length; j++){
                char val = board[i][j];

                if(val == '.'){
                    continue;
                }

                int boxId = i/3 * 3 + j/3;

                if(rows[i].contains(val) ||
                    columns[j].contains(val) ||
                    boxes[boxId].contains(val)){
                        return false;
                    }
                rows[i].add(val);
                columns[j].add(val);
                boxes[boxId].add(val);
            }
        }
        return true;
    }
}
