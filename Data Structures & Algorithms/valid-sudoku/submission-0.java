class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[9];
            for (int col = 0; col < 9; col++) {
                char current = board[row][col];
                if (current == '.') {
                    continue;
                } else {
                    int index = current - '1';
                    if (seen[index]) {
                        return false;
                    }
                    seen[index] = true; 
                }

            }
        }
         for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[9];
            for (int row = 0; row < 9; row++) {
                char current = board[row][col];
                if (current == '.') {
                    continue;
                } else {
                    int index = current - '1';
                    if (seen[index]) {
                        return false;
                    }
                    seen[index] = true; 
                }

            }
        }
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                boolean[] seen = new boolean[9];
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        char current = board[startRow + row][startCol + col];
                if (current == '.') {
                    continue;
                } else {
                    int index = current - '1';
                    if (seen[index]) {
                        return false;
                    }
                    seen[index] = true; 
                }
                    }
                }
                

            }
        }
        return true;
        
    }
}
